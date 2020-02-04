package ru.job4j.middle.multithreading.notify;

public class Producer implements Runnable {

    private String name;
    private SimpleBlockingQueue<Integer> sq;

    public Producer(SimpleBlockingQueue<Integer> sq, String name) {
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
