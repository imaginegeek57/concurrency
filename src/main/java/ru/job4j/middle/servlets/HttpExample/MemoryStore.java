package ru.job4j.middle.servlets.HttpExample;

import java.util.List;

public class MemoryStore implements Store {

    private MemoryStore() {
    }

    public static MemoryStore getInstance() {
        return Holder.INSTANCE;
    }

    private static final class Holder {
        private static final MemoryStore INSTANCE = new MemoryStore();
    }

    @Override
    public void add(User user) {

    }

    @Override
    public void delete(User user) {

    }

    @Override
    public void update(User user) {

    }

    @Override
    public List <User> findAll() {
        return null;
    }

    @Override
    public User findById(int id) {
        return null;
    }
}
