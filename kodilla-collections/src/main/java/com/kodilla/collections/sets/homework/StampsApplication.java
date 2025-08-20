package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Blue Eagle", "25 mm × 35 mm", false));
        stamps.add(new Stamp("Poland Independence 1918", "40 mm × 30 mm", false));
        stamps.add(new Stamp("Azerbaijan Carpet Art", "45 mm × 32 mm", false));
        stamps.add(new Stamp("Blue Eagle", "25 mm × 35 mm", true));

        for (Stamp stamp : stamps) {
            System.out.println(stamp);
        }

        System.out.println(stamps.size());
    }
}
