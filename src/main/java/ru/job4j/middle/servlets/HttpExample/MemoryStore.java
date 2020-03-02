package ru.job4j.middle.servlets.HttpExample;

import java.util.List;

public class MemoryStore implements Store {

    private MemoryStore instance;

    private MemoryStore() {
    }

    public MemoryStore getInstance() {
        if (instance == null) {
            instance = new MemoryStore();
        }
        return instance;
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
