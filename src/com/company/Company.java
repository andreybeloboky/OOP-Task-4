package com.company;

public class Company {

    private Manager[] managers;
    private SalesMan[] salesMen;
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
        this.salesMen = salesMan;
        this.decorators = decorator;
        this.totalManagerSalary = this.calculateSalaryAll(managers);
        this.salaryDecorators = this.calculateSalaryAll(decorators);
        this.salarySalesMan = this.calculateSalaryAll(salesMen);

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

    /**
     * @param decorator - add new employee a decorator;
     */
    public void addDecorator(Decorator decorator) {
        addEmployee(decorators, decorator);
    }

    /**
     * @param manager - add new employee a manager;
     */
    public void addManager(Manager manager) {
        addEmployee(managers, manager);
    }

    /**
     * @param salesMan - add new employee a salesMan;
     */
    public void addSalesMan(SalesMan salesMan) {
        addEmployee(salesMen, salesMan);
    }

    /**
     * @return - calculate general salary all employees;
     */
    public int calculateTotalOrganizationSalary() {
        return calculateSalaryAll(managers) + calculateSalaryAll(salesMen) + calculateSalaryAll(decorators);
    }

    public void deleteManager() {
        deleteEmployee(managers);
    }

    public void deleteSalesMan() {
        deleteEmployee(salesMen);
    }

    public void deleteDecorator() {
        deleteEmployee(decorators);
    }

    private void calculateSalary() {
        this.totalManagerSalary = this.calculateSalaryAll(managers);
        this.salaryDecorators = this.calculateSalaryAll(decorators);
        this.salarySalesMan = this.calculateSalaryAll(salesMen);
    }

    /**
     * @return - count manager salary;
     */
    private int calculateSalaryAll(Employee[] employees) {
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
    private void addEmployee(Employee[] employees, Employee employee) {
        Employee[] newEmployee = new Employee[employees.length + 1];
        System.arraycopy(employees, 0, newEmployee, 0, employees.length);
        newEmployee[newEmployee.length - 1] = employee;
        this.totalManagerSalary += newEmployee[newEmployee.length - 1].getSalary();
    }

    /**
     * @param employees - broadcast array: manager, decorator or salesman;
     */
    private void deleteEmployee(Employee[] employees) {
        Employee[] deleteEmployee = new Employee[employees.length - 1];
        System.arraycopy(employees, 0, deleteEmployee, 0, employees.length - 1);
        this.calculateSalary();
    }
}
