package ru.job4j.middle.multithreading.threadIssue.example1;


public class Cashier extends Thread {
    int id;
    Ticket[] t;

    Cashier(int id, Ticket[] t) {
        this.id = id;
        this.t = t;
    }

    @Override
    public void run() {
        for (int i = 0; i < t.length; i++) {
            // Кассир просматривает массив билетов, если какой-то билет не куплен, меняет флаг на true
            if (!t[i].isBought) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
                t[i].isBought = true;
                System.out.println("Cashier " + id + " ticket " + t[i].place);
            }
        }
    }
}
