package ru.job4j.middle.concurrency.semaphore.task1;

import java.util.concurrent.Semaphore;

public class Foo {
    private Semaphore sem;

    public Foo(Semaphore s) {
        sem = s;
    }

    public void first() {
        System.out.print("first");
    }

    public void second() {
        System.out.print("second");
    }

    public void third() {
        System.out.print("third");
    }
}
