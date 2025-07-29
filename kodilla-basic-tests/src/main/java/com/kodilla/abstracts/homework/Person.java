package com.kodilla.abstracts.homework;

public class Person {
    public String Firstname = "Jack";
    public int Age = 19;
    public String Job = "Baker";

    public void jobResponsibilities(){
        Baker baker = new Baker();
        PizzaCooker pizzaCooker = new PizzaCooker();
        if (Job.equals("Baker")) {
            System.out.println("Jack's responsibilities in the job are " + baker.responsibilities);
        } else if (Job.equals("Pizza Cooker")) {
            System.out.println("Pizza's responsibilities in the job are " + pizzaCooker.responsibilities);
        }
    }
}
