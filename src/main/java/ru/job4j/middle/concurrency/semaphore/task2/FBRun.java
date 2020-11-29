package ru.job4j.middle.concurrency.semaphore.task2;

public class FBRun {

    public static void main(String[] args) throws InterruptedException {
        FizzBuzz fizzBuzz = new FizzBuzz(50);
        fizzBuzz.fizz(new Runnable() {
            @Override
            public void run() {
            }
        });
        fizzBuzz.buzz(new Runnable() {
            @Override
            public void run() {
            }
        });
        fizzBuzz.fizzbuzz(new Runnable() {
            @Override
            public void run() {

            }
        });
        fizzBuzz.number(new Runnable() {
            @Override
            public void run() {

            }
        });

    }
}
