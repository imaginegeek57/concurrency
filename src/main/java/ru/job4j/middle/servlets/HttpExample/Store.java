package ru.job4j.middle.servlets.HttpExample;

import java.util.List;


public interface Store {

    void add(User user);

    void delete(User user);

    void update(User user);

    List <User> findAll();

    User findById(int id);
}


