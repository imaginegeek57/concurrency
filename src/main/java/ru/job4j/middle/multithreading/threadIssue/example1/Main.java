package ru.job4j.middle.multithreading.threadIssue.example1;

public class Main {
    public static void main(String[] args) {
        Ticket[] t = {
                new Ticket(1),
                new Ticket(2),
                new Ticket(3),
                new Ticket(4)
        };

        Cashier c1 = new Cashier(1, t);
        Cashier c2 = new Cashier(2, t);
        Cashier c3 = new Cashier(3, t);
        Cashier c4 = new Cashier(4, t);

        c1.start();
        c2.start();
        c3.start();
        c4.start();
    }
}
