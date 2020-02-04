package ru.job4j.middle.multithreading.notify;

import org.junit.Test;

public class QueueTest {

    @Test
    public void test() throws InterruptedException {
        SimpleBlockingQueue <Integer> sq = new SimpleBlockingQueue <>();
        Thread first = new Thread(new Producer(sq, "first"));
        Thread second = new Thread(new Consumer(sq, "second"));
        first.start();
        second.start();
        first.join();
        second.join();
        System.out.println(first);
        System.out.println(second);

    }
}

