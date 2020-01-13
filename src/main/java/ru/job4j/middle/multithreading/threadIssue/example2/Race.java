package ru.job4j.middle.multithreading.threadIssue.example2;

public class Race {

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            Counter ct = new Counter("name + " + i);
            ct.start();
            Thread.sleep(1000);
            System.out.println("Counter:" + ct.getName());
            System.out.println("Counter:" + ct.getCounter());
        }
    }
}



