package ru.job4j.middle.multithreading.synchronize.task2;

import net.jcip.annotations.ThreadSafe;

import java.util.LinkedList;
import java.util.List;

@ThreadSafe
public class UserStorage {

    public List <User> userList = new LinkedList <>();

    public void add(User user) {
        if (!userList.contains(user))
            userList.add(user);
    }

    public void update(int id, int a) {
        userList.set(id, new User(id, a));
    }


    public void delete(User user) {
        userList.remove(user);
    }

    public void transfer(int fromId, int toId, int amount) {
        User userFrom = userList.get(fromId);
        User userTo = userList.get(toId);

        int valueFrom = userFrom.getAmount();
        int valueTo = userTo.getAmount();
        userFrom.setAmount(valueFrom -= amount);
        userTo.setAmount(valueTo += amount);
        userList.set(fromId, userFrom);
        userList.set(toId, userTo);
    }

}
