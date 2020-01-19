package ru.job4j.middle.multithreading.synchronize.task2;


import org.junit.Test;

public class Test12 {

    UserStorage userStorage = new UserStorage();

    @Test
    public void test() {
        userStorage.add(new User(1, 100));
        userStorage.add(new User(2, 250));
        userStorage.add(new User(3, 400));
        User us = new User(4, 550);
        userStorage.add(us);
        userStorage.update(0, 25);
        userStorage.transfer(2, 3, 30);
        for (User i : userStorage.userList)
            System.out.println(i);
    }

}
