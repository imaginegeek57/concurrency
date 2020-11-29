package ru.job4j.middle.concurrency.semaphore.task2;

import java.util.concurrent.Semaphore;

public class FizzBuzz {

    private Semaphore fizz, buzz, fb, number;
    private int n;

    public FizzBuzz(int n) {
        this.n = n;
        this.fizz = new Semaphore(1);
        this.buzz = new Semaphore(1);
        this.fb = new Semaphore(1);
        this.number = new Semaphore(1);
    }

    public void fizz(Runnable printFizz) throws InterruptedException {
        for (int i = 1; i <= this.n; i++) {
            if (i % 3 == 0) {
                this.fizz.acquire();
                printFizz.run();
                System.out.println("fizz");
                fizz.release();
            }
        }
    }

    public void buzz(Runnable printBuzz) throws InterruptedException {
        for (int i = 1; i <= this.n; i++) {
            if (i % 5 == 0) {
                this.buzz.acquire();
                printBuzz.run();
                System.out.println("buzz");
                buzz.release();
            }
        }
    }

    public void fizzbuzz(Runnable printFizzBuzz) throws InterruptedException {
        for (int i = 1; i <= this.n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                this.fb.acquire();
                printFizzBuzz.run();
                System.out.println("fizzbuzz");
                fb.release();
            }
        }
    }

    public void number(Runnable printNumber) throws InterruptedException {
        for (int i = 1; i <= this.n; i++) {
            if (i % 3 != 0 && i % 5 != 0) {
                this.number.acquire();
                printNumber.run();
                System.out.println(i);
                number.release();
            }
        }
    }
}

