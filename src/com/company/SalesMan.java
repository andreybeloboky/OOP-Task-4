package com.company;

public class SalesMan extends Employee {

    private int salary = 800;

    public SalesMan(String name, int experienceJob) {
        super(name, experienceJob);
        this.setSalary();
    }

    public void setSalary() {
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
