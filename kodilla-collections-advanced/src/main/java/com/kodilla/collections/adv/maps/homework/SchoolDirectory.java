package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> schoolInfo = new HashMap<Principal, School>();

        Principal principalJohn = new Principal("John", "Black");
        Principal principalArthur = new Principal("Arthur", "Simon");
        Principal principalMateusz = new Principal("Mateusz", "Parker");

        School schoolOfJohn = new School(List.of(12,34,53,23,43,23));
        School schoolOfArthur = new School(List.of(12,34,53,23));
        School schoolOfMateusz = new School(List.of(13,23,53));

        schoolInfo.put(principalJohn, schoolOfJohn);
        schoolInfo.put(principalArthur, schoolOfArthur);
        schoolInfo.put(principalMateusz, schoolOfMateusz);

        for (Map.Entry<Principal, School> entry : schoolInfo.entrySet()) {
            System.out.println(entry.getKey().getFirstname() + " " + entry.getKey().getLastname() + "'s school has total " + entry.getValue().getTotal() + " students");
        }
    }
}
