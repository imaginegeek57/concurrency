package ru.job4j.middle.multithreading.threadIssue.example2;

public class Counter extends Thread {
    Thread t;
    String name;

    int count = 0;

    Counter(String threadname) {
        name = threadname;
        t = new Thread(this, name);
        this.t = t;
        t.start();
    }

    public void increment() {
        count = count + 1;
    }


    public int getCounter() {
        return count;
    }

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            increment();
        }
    }
}
