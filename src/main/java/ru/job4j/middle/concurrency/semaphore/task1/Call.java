package ru.job4j.middle.concurrency.semaphore.task1;

public class Call {

   private static FooSave FS = new FooSave();

    public static void main(String[] args) throws InterruptedException {
        FS.first(new Runnable() {
            public void run() {
            }
        });
        FS.second(new Runnable() {
            public void run() {
            }
        });
        FS.third(new Runnable() {
            public void run() {
            }
        });
    }

}
