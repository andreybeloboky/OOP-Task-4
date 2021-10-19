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
    }
}
