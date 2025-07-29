package com.kodilla.abstracts.homework;

public abstract class Job {
    public String responsibilities;
    public int salary;
    public Job(String responsibilities, int salary) {
        this.responsibilities = responsibilities;
        this.salary = salary;
    }
}
