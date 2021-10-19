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
    }
}
