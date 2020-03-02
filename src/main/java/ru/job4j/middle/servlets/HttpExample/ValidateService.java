package ru.job4j.middle.servlets.HttpExample;

import java.util.LinkedList;
import java.util.List;

public class ValidateService {

    private MemoryStore MemoreStore;

    private final Store logic = MemoreStore.getInstance();

    /**
     * Список пользователей
     */
    private List <User> userList = new LinkedList <>();

    private ValidateService instace;

    private ValidateService() {
    }

    /**
     * Получение экземпляра класса
     *
     * @return
     */
    public ValidateService getInstace() {
        if (instace == null) {
            instace = new ValidateService();
        }
        return instace;
    }

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
