package ru.job4j.middle.multithreading.notify;


public class Consumer implements Runnable {

    private String name;
    private SimpleBlockingQueue sq;

    public Consumer(SimpleBlockingQueue sq, String name) {
        this.sq = sq;
        this.name = name;
    }

    @Override
    public void run() {
        while (true) {
            sq.poll();
        }
    }
}
