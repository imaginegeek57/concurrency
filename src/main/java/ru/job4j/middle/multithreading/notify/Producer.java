package ru.job4j.middle.multithreading.notify;

public class Producer implements Runnable {

    private String name;
    private SimpleBlockingQueue sq;

    public Producer(SimpleBlockingQueue sq, String name) {
        this.sq = sq;
        this.name = name;
    }

    @Override
    public void run() {
        int i = 0;

        while (true) {
            sq.offer(i++);
        }
    }
}
