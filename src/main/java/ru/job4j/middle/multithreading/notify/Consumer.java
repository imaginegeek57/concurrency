package ru.job4j.middle.multithreading.notify;


public class Consumer implements Runnable {

    private String name;
    private SimpleBlockingQueue <Integer> sq;

    public Consumer(SimpleBlockingQueue <Integer> sq, String name) {
        this.sq = sq;
        this.name = name;
    }

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {

            sq.poll();
        }
        Thread.currentThread().interrupt();

    }
}
