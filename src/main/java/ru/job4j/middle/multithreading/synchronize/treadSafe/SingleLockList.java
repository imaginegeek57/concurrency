package ru.job4j.middle.multithreading.synchronize.treadSafe;

import net.jcip.annotations.ThreadSafe;
import java.util.Iterator;

@ThreadSafe
public class SingleLockList<E> implements Iterable<E> {

    private DynamicList dynamicList = new DynamicList();

    public synchronized void add(E value) {
        dynamicList.add(value);
    }

    public synchronized E get(int index) {
        return (E) dynamicList.get(index);
    }


    // метод copy должен быть здесь?
    @Override
    public synchronized Iterator<E> iterator() {
        return null;
    }
}