package ru.job4j.middle.multithreading.threadIssue.example3;

public class ThreadState {

    public static void main(String[] args) {
        Thread first = new Thread(
                () -> System.out.println(Thread.currentThread().getName())
        );
        first.start();
        Thread second = new Thread(
                () -> System.out.println(Thread.currentThread().getName())
        );
        second.start();
        System.out.println("work completed");
    }
}


