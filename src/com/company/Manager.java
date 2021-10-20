package com.company;

public class Manager extends Employee {

    public Manager(String name, int experienceJob) {
        super(name, experienceJob, 1200);
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
