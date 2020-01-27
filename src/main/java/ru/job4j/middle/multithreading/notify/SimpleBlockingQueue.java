package ru.job4j.middle.multithreading.notify;

import net.jcip.annotations.GuardedBy;
import net.jcip.annotations.ThreadSafe;
import java.util.LinkedList;
import java.util.Queue;

@ThreadSafe
public class SimpleBlockingQueue<T> {

    boolean value = false;

    @GuardedBy("this")
    private Queue <T> queue = new LinkedList <>();
    private Object T;

    public synchronized void offer(T t) {
        while (value)
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        this.queue.add(t);
        this.value = true;
        System.out.println("offer:" + t);
        notify();
    }

    public synchronized T poll() {
        while (!value)
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        System.out.println("poll");
        value = false;
        notify();
        return (T) T;
    }
}
