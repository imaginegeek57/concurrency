package ru.job4j.middle.multithreading.synchronize.treadSafe;

import org.junit.Test;

import java.util.Set;
import java.util.TreeSet;


public class SingleLockListTest {

    @Test
    public void add() throws InterruptedException {
        SingleLockList <Integer> list = new SingleLockList <>();
        Thread first = new Thread(() -> list.add(3));
        Thread second = new Thread(() -> list.add(5));
        first.start();
        second.start();
        first.join();
        second.join();
        Set <Integer> rsl = new TreeSet <>();
        list.iterator().forEachRemaining(rsl::add);
        System.out.println(first);
        System.out.println(second);
    }
}
