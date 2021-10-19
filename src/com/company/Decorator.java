package com.company;

public class Decorator extends Employee {

    private int salary = 1100;

    public Decorator(String name, int experienceJob) {
        super(name, experienceJob);
        this.setSalary();
    }

    private void setSalary() {
        for (int i = 0; i < experienceJob; i++) {
            salary += 100;
        }
    }

    /**
     * @return - value salary from array with taking into account the experience job;
     */
    public int getSalary() {
        return salary;
    }
}
