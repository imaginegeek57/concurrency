package ru.job4j.middle.multithreading.synchronize.task2;


import org.junit.Test;

public class TesUserStorageTest {

    private UserStorage userStorage = new UserStorage("main");

    @Test
    public void test() throws InterruptedException {
        userStorage.add(new User(1, 100));
        userStorage.add(new User(2, 250));
        userStorage.add(new User(3, 400));
        User us = new User(4, 550);
        userStorage.add(us);
        userStorage.update(0, 25);
        userStorage.transfer(2, 3, 30);
        //Создаем нити.
        Thread first = new Thread(new UserStorage("thread-1"));
        Thread second = new Thread(new UserStorage("thread-2"));
        //Запускаем нити.
        first.start();
        second.start();
        //Заставляем главную нить дождаться выполнения наших нитей.
        first.join();
        second.join();
        System.out.println(userStorage);

        for (User i : userStorage.userList)
            System.out.println(i);
    }
}
