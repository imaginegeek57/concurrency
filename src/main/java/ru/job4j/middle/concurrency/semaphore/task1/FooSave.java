package ru.job4j.middle.concurrency.semaphore.task1;

import java.util.concurrent.Semaphore;

class FooSave {

    private Semaphore sem = new Semaphore(1);
    private Foo foo = new Foo(sem);

    public void first(Runnable printFirst) throws InterruptedException {
        sem.acquire();
        foo.first();
        sem.release();
        printFirst.run();
    }

    public void second(Runnable printSecond) throws InterruptedException {
        sem.acquire();
        foo.second();
        sem.release();
        printSecond.run();
    }

    public void third(Runnable printThird) throws InterruptedException {
        sem.acquire();
        foo.third();
        sem.release();
        printThird.run();
    }
}
