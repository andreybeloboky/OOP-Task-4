package com.company;

public class SalesMan extends Employee {


    public SalesMan(String name, int experienceJob) {
        super(name, experienceJob, 800);
        this.setSalary(salary);
    }

    private void setSalary(int salary) {
        this.salary = salary + (experienceJob * 100);
    }

    /**
     * @return - value salary from array with taking into account the experience job;
     */
    public int getSalary() {
        return salary;
    }
}
