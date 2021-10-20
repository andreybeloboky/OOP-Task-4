package com.company;

public class Employee {

    protected String name;
    protected int experienceJob;
    protected int salary;

    public Employee(String name, int experienceJob, int salary) {
        this.name = name;
        this.experienceJob = experienceJob;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }
}