package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class School {
    List<Integer> studentsInEachClass = new ArrayList<>();

    public School(List<Integer> studentsInEachClass) {
        this.studentsInEachClass = studentsInEachClass;
    }

    public int getTotal() {
        int sum = 0;
        for (Integer i : studentsInEachClass) {
            sum += i;
        }
        return sum;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        School school = (School) o;
        return Objects.equals(studentsInEachClass, school.studentsInEachClass);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(studentsInEachClass);
    }

    @Override
    public String toString() {
        return "School{" +
                "studentsInEachClass=" + studentsInEachClass +
                '}';
    }
}
