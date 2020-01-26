package ru.job4j.middle.multithreading.synchronize.treadSafe;

import net.jcip.annotations.GuardedBy;
import net.jcip.annotations.ThreadSafe;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ThreadSafe
public class SingleLockList<E> implements Iterable <E>, Runnable {

    @GuardedBy("this")
    private DynamicList dynamicList = new DynamicList();

    public synchronized void add(E value) {
        dynamicList.add(value);
    }

    public synchronized E get(int index) {
        return (E) dynamicList.get(index);
    }

    public DynamicList copy(DynamicList dynamicList) {
        List <E> list = new LinkedList <>();

        Iterator <E> itr = list.iterator();
        while (itr.hasNext()) {
            E value = itr.next();
        }
        return dynamicList;
    }


    @Override
    public synchronized Iterator <E> iterator() {
        return copy(this.dynamicList).iterator();
    }

    @Override
    public void run() {

    }
}