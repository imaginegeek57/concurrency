package ru.job4j.middle.multithreading.notify;

import net.jcip.annotations.GuardedBy;
import net.jcip.annotations.ThreadSafe;

import java.util.LinkedList;
import java.util.Queue;

@ThreadSafe
public class SimpleBlockingQueue<T> {

    @GuardedBy("this")
    protected Queue <T> queue = new LinkedList <>();

    public synchronized void offer(T t) {
        this.queue.offer(t);
        System.out.println("offer:" + t);
        notify();
    }

    public synchronized T poll() {
        while (queue.isEmpty())
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        T value = queue.poll();
        System.out.println("poll:" + value);
        notify();
        return value;
    }
}
