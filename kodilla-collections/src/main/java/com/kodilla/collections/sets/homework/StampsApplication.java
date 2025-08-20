package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Blue Eagle", "25 mm × 35 mm", "Yes"));
        stamps.add(new Stamp("Poland Independence 1918", "40 mm × 30 mm", "No"));
        stamps.add(new Stamp("Azerbaijan Carpet Art", "45 mm × 32 mm", "No"));
        stamps.add(new Stamp("Blue Eagle", "25 mm × 35 mm", "Yes"));

        for (Stamp stamp : stamps) {
            System.out.println(stamp);
        }

        System.out.println(stamps.size());
    }
}
