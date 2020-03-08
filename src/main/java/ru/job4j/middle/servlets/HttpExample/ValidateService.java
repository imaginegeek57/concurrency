package ru.job4j.middle.servlets.HttpExample;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ValidateService {

    private ValidateService() {
    }

    public static ValidateService getInstance() {
        return Holder.INSTANCE;
    }

    private static final class Holder {
        private static final ValidateService INSTANCE = new ValidateService();
    }

    private MemoryStore memoryStore = MemoryStore.getInstance();

    public List <User> userList = new CopyOnWriteArrayList <>();

    /**
     * Добавление нового пользователя
     *
     * @param user
     */
    public void add(User user) {
        userList.add(user);
    }

    /**
     * Обнавление пользователя по id
     *
     * @param id
     * @param user
     */
    public void update(int id, User user) {
        for (User u : this.userList) {
            if (u.getId() == id) {
                this.userList.set(id, user);
                user.setId(id);
                break;
            }
        }
    }

    /**
     * Удаление пользователя
     *
     * @param user
     * @return
     */
    public void delete(User user) {
        this.userList.remove(user);
    }

    /**
     * Получить всех пользователей
     *
     * @return
     */
    public List <User> findAll() {
        List <User> users = new LinkedList <>();
        for (User user : this.userList) {
            users.add(user);
        }
        return users;
    }

    /**
     * Получить пользователя по id
     *
     * @param id
     * @return
     */
    public List <User> findById(int id) {
        for (User user : this.userList) {
            if (user.getId() == id) {
                this.userList.add(user);
            }
        }
        return this.userList;
    }

}
