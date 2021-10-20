package com.company;

public class Company {

    private Manager[] managers;
    private SalesMan[] salesMan;
    private Decorator[] decorators;
    private int totalManagerSalary;
    private int salarySalesMan;
    private int salaryDecorators;


    /**
     * @param manager   - array with data about managers;
     * @param salesMan  - array with data about salesMans;
     * @param decorator - array with data about decorator;
     */
    public Company(Manager[] manager, SalesMan[] salesMan, Decorator[] decorator) {
        this.managers = manager;
        this.salesMan = salesMan;
        this.decorators = decorator;
        this.totalManagerSalary = this.calculateSalaryAll(managers);
        this.salaryDecorators = this.calculateSalaryAll(decorators);
        this.salarySalesMan = this.calculateSalaryAll(salesMan);

    }

    /**
     * @return - calculate salary;
     */
    public int getTotalManagerSalary() {
        return totalManagerSalary;
    }

    /**
     * @return - calculate salary;
     */
    public int getSalarySalesMen() {
        return salarySalesMan;
    }

    /**
     * @return - calculate salary;
     */
    public int getSalaryDecorators() {
        return salaryDecorators;
    }

    public void calculateSalary() {
        this.totalManagerSalary = this.calculateSalaryAll(managers);
        this.salaryDecorators = this.calculateSalaryAll(decorators);
        this.salarySalesMan = this.calculateSalaryAll(salesMan);
    }


    /**
     * @return - count manager salary;
     */
    public int calculateSalaryAll(Employee[] employees) {
        int salary = 0;
        for (Employee empl : employees) {
            salary += empl.getSalary();
        }
        return salary;
    }

    /**
     * @param employees - broadcast array: manager, decorator or salesman;
     * @param employee  - new employee, someone from manager, decorator or salesman;
     */
    public void addEmployee(Employee[] employees, Employee employee) {
        Employee[] newEmployee = new Employee[employees.length + 1];
        System.arraycopy(employees, 0, newEmployee, 0, employees.length);
        newEmployee[newEmployee.length - 1] = employee;
        this.totalManagerSalary += newEmployee[newEmployee.length - 1].getSalary();
    }

    /**
     * @param employees - broadcast array: manager, decorator or salesman;
     */
    public void deleteEmployee(Employee[] employees) {
        Employee[] deleteEmployee = new Employee[employees.length - 1];
        System.arraycopy(employees, 0, deleteEmployee, 0, employees.length - 1);
        this.calculateSalary();
    }

    /**
     * @return - calculate general salary all employees;
     */
    public int calculateTotalOrganizationSalary() {
        return calculateSalaryAll(managers) + calculateSalaryAll(salesMan) + calculateSalaryAll(decorators);
    }
}
