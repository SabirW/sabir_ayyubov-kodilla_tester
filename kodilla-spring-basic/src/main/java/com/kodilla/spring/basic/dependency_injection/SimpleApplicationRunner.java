package com.kodilla.spring.basic.dependency_injection;

public class SimpleApplicationRunner {

    public static void main(String[] args) {
        MessageService messageService = new MessageService() {
            @Override
            public String send(String message, String receiver) {

                return message;
            }
        };
        SimpleApplication application = new SimpleApplication(messageService);
        application.processMessage("Test message", "receiver@mail.com");
    }
}