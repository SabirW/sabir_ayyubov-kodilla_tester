package com.kodilla.mockito.homework;


import java.util.*;

public class WeatherAlertService {

    private final Map<Location, Set<Person>> subscriptions = new HashMap<>();

    // Subscribe a person to a location
    public void subscribe(Person person, Location location) {
        subscriptions.computeIfAbsent(location, k -> new HashSet<>()).add(person);
    }

    // Unsubscribe a person from a specific location
    public void unsubscribe(Person person, Location location) {
        Set<Person> people = subscriptions.get(location);
        if (people != null) {
            people.remove(person);
            if (people.isEmpty()) subscriptions.remove(location);
        }
    }

    // Unsubscribe a person from all locations
    public void unsubscribeFromAll(Person person) {
        subscriptions.values().forEach(set -> set.remove(person));
        subscriptions.entrySet().removeIf(entry -> entry.getValue().isEmpty());
    }

    // Send notification to people observing a specific location
    public void notifyLocation(Location location, String message) {
        Set<Person> people = subscriptions.get(location);
        if (people != null) {
            for (Person p : people) {
                sendMessage(p, message);
            }
        }
    }

    // Send notification to all subscribed persons
    public void notifyAll(String message) {
        Set<Person> allPeople = new HashSet<>();
        subscriptions.values().forEach(allPeople::addAll);
        for (Person p : allPeople) {
            sendMessage(p, message);
        }
    }

    // Delete a location and unsubscribe everyone
    public void deleteLocation(Location location) {
        subscriptions.remove(location);
    }

    // Placeholder for sending messages
    protected void sendMessage(Person person, String message) {
        // In real implementation, send an email or SMS
        System.out.println("Sending to " + person.getEmail() + ": " + message);
    }

    // Getter for testing
    public Map<Location, Set<Person>> getSubscriptions() {
        return subscriptions;
    }
}
