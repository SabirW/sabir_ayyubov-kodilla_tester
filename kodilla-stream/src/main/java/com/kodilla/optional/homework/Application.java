package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {

    public static List<String> getStudentTeacherPairs() {
        Teacher mrSmith = new Teacher("Mr.Smith");
        Teacher mrJohn = new Teacher("Mr.John");

        List<Student> students = new ArrayList<>();
        students.add(new Student("Jack", mrSmith));
        students.add(new Student("Michael", null));
        students.add(new Student("Frank", mrJohn));

        List<String> result = new ArrayList<>();
        for (Student student : students) {
            String teacherName = Optional.ofNullable(student.getTeacher())
                    .map(Teacher::getName)
                    .orElse("<undefined>");
            result.add("Student: " + student.getName() + ", Teacher: " + teacherName);
        }
        return result;
    }

    public static void main(String[] args) {
        getStudentTeacherPairs().forEach(System.out::println);
    }
}
