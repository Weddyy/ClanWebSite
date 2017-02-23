package com.clan.service;

import com.clan.model.clan.*;

/**
 * Created by weddy on 21.02.17.
 */
public interface ClanService {

    /**
     * Добавить клан
     * @param clan клан
     */
    public Clan addClan(Clan clan);


    /**
     * Найти клан
     * @param id ид клана
     */
    public Clan getClan(int id);

    /**
     * Удалить клан
     * @param id ид клана
     */
    public void deleteClan(int id);


    /**
     * Добавить игру в клан
     * @param clanId ид клана
     * @param game игра
     */
    public ClanGame addGame(int clanId,ClanGame game);

    /**
     * Обновить игру
     * @param clanId ид клана
     * @param game игра
     */
    public ClanGame updateGame(int clanId,ClanGame game);

    /**
     * Найти игру
     * @param gameId ид игры
     */
    public ClanGame getGame(int gameId);

    /**
     * Удалить игру
     * @param gameId ид игры
     */
    public void deleteGame(int gameId);

    /**
     * Добавить раздел в игру
     * @param gameId ид игры
     * @param part раздел
     */
    public ClanPart addGamePart(int gameId, ClanPart part);

    /**
     * Обновить раздел в игре
     * @param gameId ид игры
     * @param part раздел
     */
    public ClanPart updateGamePart(int gameId,ClanPart part);

    /**
     * Найти раздел с игры
     * @param partId ид раздела
     */
    public ClanPart getGamePart(int partId);

    /**
     * Удалить раздел с игры
     * @param partId ид раздела
     */
    public void deletePartFromGame(int partId);


    /**
     * Добавить топик в раздел
     * @param partId ид раздела
     * @param topic топик
     */
    public PartTopic addTopic(int partId, PartTopic topic);

    /**
     * Обновить топик в разделе
     * @param partId ид раздела
     * @param topic топик
     */
    public PartTopic updateTopic(int partId,PartTopic topic);

    /**
     * Найти топик с раздела
     * @param topicId ид топика
     */
    public PartTopic getTopic(int topicId);

    /**
     * Удалить топик с раздела
     * @param topicId ид топика
     */
    public void deleteTopic(int topicId);


    /**
     * Добавть сообщение в топик
     * @param topicId ид топика
     * @param userId ид пользователя
     * @param msg сообщение
     */
    public TopicMessage addMsg(int topicId, int userId, TopicMessage msg);

    /**
     * Изменить сообщение в топике
     * @param topicId ид топика
     * @param msg сообщение
     */
    public TopicMessage updateMsg(int topicId, TopicMessage msg);

    /**
     * Найти сообщение из топика
     * @param msgId ид сообщения
     */
    public TopicMessage getMsg(int msgId);

    /**
     * Удалить сообщение из топика
     * @param msgId ид сообщения
     */
    public void deleteMsg(int msgId);
}
