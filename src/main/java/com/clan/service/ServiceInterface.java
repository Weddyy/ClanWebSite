package com.clan.service;

import com.clan.model.User;
import com.clan.model.UserInfo;

/**
 * Created by weddy on 20.02.17.
 */
public interface ServiceInterface {
    /**
     * Создать пользователя в базе данных
     * @param user
     */
    public void createUser(User user);

    /**
     * Найти пользователя
     * @param email мыло пользователя
     * @param pass пароль пользователя
     * @return
     */
    public User getUserByEmailAndPassword(String email,String pass);

    /**
     * Удалить пользователя с базы
     * @param id
     */
    public void deleteUser(int id);

    /**
     * Изменить пользователя в базе
     * @param user
     */
    public void changeUser(User user);

    /**
     * Обновить иформацию пользователя в базе
     * @param id
     * @param info
     */
    public void updateUserInfo(int id, UserInfo info);
}
