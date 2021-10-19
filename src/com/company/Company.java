package com.company;

public class Company {

    private Manager[] managers;
    private SalesMan[] salesMan;
    private Decorator[] decorators;
    private int salaryManager;
    private int salarySalesMans;
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
    }

    /**
     * @return - count manager salary;
     */
    public int countManagerSalary() {
        for (Manager manager : managers) {
            salaryManager += manager.getSalary();
        }
        return salaryManager;
    }

    /**
     * @return - count salesMan salary;
     */
    public int countSalesManSalary() {
        for (SalesMan salesMan : salesMan) {
            salarySalesMans += salesMan.getSalary();
        }
        return salarySalesMans;
    }

    /**
     * @return - count decorators salary;
     */
    public int countDecoratorsSalary() {
        for (Decorator decorator : decorators) {
            salaryDecorators += decorator.getSalary();
        }
        return salaryDecorators;
    }

    /**
     * @param manager - new object with new employee (name and experience job).
     */
    public void addEmployeeManager(Manager manager) {
        Manager[] newEmployee = new Manager[managers.length + 1];
        System.arraycopy(managers, 0, newEmployee, 0, managers.length);
        newEmployee[newEmployee.length - 1] = manager;
        this.salaryManager += newEmployee[newEmployee.length - 1].getSalary();
    }

    /**
     * @return - calculate salary without dismissed an employee;
     */
    public int deleteEmployeeManager() {
        Manager[] deleteEmployee = new Manager[managers.length - 1];
        for (int i = 0; i < managers.length - 1; i++) {
            deleteEmployee[i] = managers[i];
            this.salaryManager += deleteEmployee[i].getSalary();
        }
        return salaryManager;
    }

    /**
     * @param salesMan - new object with new employee (name and experience job).
     */
    public void addEmployeeSalesMan(SalesMan salesMan) {
        SalesMan[] newEmployee = new SalesMan[this.salesMan.length + 1];
        System.arraycopy(this.salesMan, 0, newEmployee, 0, this.salesMan.length);
        newEmployee[newEmployee.length - 1] = salesMan;
        this.salaryManager += newEmployee[newEmployee.length - 1].getSalary();
    }

    /**
     * @return - calculate salary without dismissed an employee;
     */
    public int deleteEmployeeSalesMan() {
        SalesMan[] deleteEmployee = new SalesMan[salesMan.length - 1];
        for (int i = 0; i < salesMan.length - 1; i++) {
            deleteEmployee[i] = salesMan[i];
            this.salarySalesMans += deleteEmployee[i].getSalary();
        }
        return salarySalesMans;
    }

    /**
     * @param decorator - new object with new employee (name and experience job).
     */
    public void addEmployeeDecorator(Decorator decorator) {
        Decorator[] newEmployee = new Decorator[decorators.length + 1];
        System.arraycopy(decorators, 0, newEmployee, 0, decorators.length);
        newEmployee[newEmployee.length - 1] = decorator;
        this.salaryManager += newEmployee[newEmployee.length - 1].getSalary();
    }

    /**
     * @return - calculate salary without dismissed an employee;
     */
    public int deleteEmployeeDecorator() {
        Decorator[] deleteEmployee = new Decorator[decorators.length - 1];
        for (int i = 0; i < decorators.length - 1; i++) {
            deleteEmployee[i] = decorators[i];
            this.salaryDecorators += deleteEmployee[i].getSalary();
        }
        return salaryDecorators;
    }

    /**
     * @return - calculate general salary all employees;
     */
    public int countOfAllEmployee() {
        return countManagerSalary() + countDecoratorsSalary() + countSalesManSalary();
    }
}
