package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] name = {"Andrew", "Bober", "Sergey", "Inga", "Ina", "Inna", "Olya", "Nella", "Anton", "Kirill"};
        int begin = 1;
        int end = 10;
        int randomName = (int) (Math.random() * end);
        Manager[] manager = new Manager[begin + (int) (Math.random() * end)];
        SalesMan[] salesMan = new SalesMan[begin + (int) (Math.random() * end)];
        Decorator[] decorator = new Decorator[begin + (int) (Math.random() * end)];
        for (int i = 0; i < manager.length; i++) {
            int managerExperienceJob = begin + (int) (Math.random() * end);
            String managerName = name[randomName];
            manager[i] = new Manager(managerName, managerExperienceJob);
        }
        for (int i = 0; i < salesMan.length; i++) {
            int salesManExperienceJob = begin + (int) (Math.random() * end);
            String salesManName = name[randomName];
            salesMan[i] = new SalesMan(salesManName, salesManExperienceJob);
        }
        for (int i = 0; i < decorator.length; i++) {
            int decoratorExperienceJob = begin + (int) (Math.random() * end);
            String decoratorName = name[randomName];
            decorator[i] = new Decorator(decoratorName, decoratorExperienceJob);
        }
        Company company = new Company(manager, salesMan, decorator);
        System.out.println("Enter operation. 1-10.");
        System.out.println("1 - add manager and recalculate salary taking into account begin new employee;\n" +
                "2 - count salary manager; \n" +
                "3 - delete manager and recalculate salary taking into account begin dismiss employee;\n" +
                "4 - add salesman and recalculate salary taking into account begin new employee;\n" +
                "5 - count salary salesman; \n" +
                "6 - delete salesman and recalculate salary taking into account begin dismiss employee;\n" +
                "7 - add decorator and recalculate salary taking into account begin new employee;\n" +
                "8 - count salary decorator; \n" +
                "9 - delete decorator and recalculate salary taking into account begin dismiss employee;\n" +
                "10 - calculate general salary all employees; \n" + "another number - finish program");
        int i = scanner.nextInt();
        switch (i) {
            case 1 -> {  // add manager with count salary
                company.addEmployeeManager(new Manager(name[randomName], begin + (int) (Math.random() * end)));
                System.out.println("add Employee");
                int averageSalaryWithNewEmployee = company.countManagerSalary();
                System.out.println(averageSalaryWithNewEmployee);
            }
            case 2 -> {  // count salary manager
                int countSalaryOfManager = company.countManagerSalary();
                System.out.println(countSalaryOfManager);
            }
            case 3 -> {  // delete manager with count salary
                System.out.println("delete manager");
                int salary = company.deleteEmployeeManager();
                System.out.println(salary);
            }
            case 4 -> {  // add salesman with count salary
                company.addEmployeeSalesMan(new SalesMan(name[randomName], begin + (int) (Math.random() * end)));
                System.out.println("add Employee");
                int averageSalaryWithNewEmployee = company.countSalesManSalary();
                System.out.println(averageSalaryWithNewEmployee);
            }
            case 5 -> {  // count salary salesman
                int countSalaryOfSalesMan = company.countSalesManSalary();
                System.out.println(countSalaryOfSalesMan);
            }
            case 6 -> {  // delete salesman with count salary
                System.out.println("delete salesman");
                int salary = company.deleteEmployeeSalesMan();
                System.out.println(salary);
            }
            case 7 -> {  // add decorator with count salary
                company.addEmployeeDecorator(new Decorator(name[randomName], begin + (int) (Math.random() * end)));
                System.out.println("add Employee");
                int averageSalaryWithNewEmployee = company.countDecoratorsSalary();
                System.out.println(averageSalaryWithNewEmployee);
            }
            case 8 -> {  // count salary decorator
                int countSalaryOfDecorator = company.countDecoratorsSalary();
                System.out.println(countSalaryOfDecorator);
            }
            case 9 -> {  // delete decorator with count salary
                System.out.println("delete decorator");
                int salary = company.deleteEmployeeDecorator();
                System.out.println(salary);
            }
            case 10 -> {  // count all employee
                int salary = company.countOfAllEmployee();
                System.out.println(salary);
            }
            default -> System.out.println("end");
        }
    }
}
