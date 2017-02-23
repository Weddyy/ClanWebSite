package com.clan.service.impl;

import com.clan.model.User;
import com.clan.model.clan.*;
import com.clan.model.exceptions.*;
import com.clan.repository.*;
import com.clan.service.ClanService;
import com.clan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by weddy on 21.02.17.
 */
@Service
public class ClanServiceImpl implements ClanService {

    @Autowired
    private ClanRepository clanRepository;
    @Autowired
    private ClanGameRepository clanGameRepository;
    @Autowired
    private ClanPartRepository clanPartRepository;
    @Autowired
    private PartTopicRepository partTopicRepository;
    @Autowired
    private TopicMsgRepository topicMsgRepository;

    @Autowired
    private UserService userService;

    @Override
    public Clan addClan(Clan clan) {
        return clanRepository.save(clan);
    }

    @Override
    public Clan getClan(int id) {
        if(!clanRepository.exists(id))
            throw new ClanNotFoundException("CLan not found");
        return clanRepository.findOne(id);
    }

    @Override
    public void deleteClan(int id) {
        clanRepository.delete(id);
    }

    @Override
    public ClanGame addGame(int clanId, ClanGame game) {
        Clan clan = getClan(clanId);
        game.setClan(clan);
        return clanGameRepository.save(game);
    }

    @Override
    public ClanGame updateGame(int clanId, ClanGame game) {
        return null;
    }

    @Override
    public ClanGame getGame(int gameId) {
        if(!clanGameRepository.exists(gameId))
            throw new GameNotFoundException("Game not found");
        return clanGameRepository.findOne(gameId);
    }

    @Override
    public void deleteGame(int gameId) {
        clanGameRepository.delete(gameId);
    }

    @Override
    public ClanPart addGamePart(int gameId, ClanPart part) {
        ClanGame clanGame = getGame(gameId);
        part.setClanGame(clanGame);
        return clanPartRepository.save(part);
    }

    @Override
    public ClanPart updateGamePart(int gameId, ClanPart part) {
        return null;
    }

    @Override
    public ClanPart getGamePart(int partId) {
        if(!clanPartRepository.exists(partId))
            throw new PartNotFoundException("Part not found");
        return clanPartRepository.findOne(partId);
    }

    @Override
    public void deletePartFromGame(int partId) {
        clanPartRepository.delete(partId);
    }

    @Override
    public PartTopic addTopic(int partId, PartTopic topic) {
        ClanPart clanPart = getGamePart(partId);
        topic.setPart(clanPart);
        return partTopicRepository.save(topic);
    }

    @Override
    public PartTopic updateTopic(int partId, PartTopic topic) {
        return null;
    }

    @Override
    public PartTopic getTopic(int topicId) {
        if(!partTopicRepository.exists(topicId))
            throw new TopicNotFoundException("Topic not found");
        return partTopicRepository.findOne(topicId);
    }

    @Override
    public void deleteTopic(int topicId) {
        partTopicRepository.delete(topicId);
    }

    @Override
    public TopicMessage addMsg(int topicId, int userId, TopicMessage msg) {
        PartTopic partTopic = getTopic(topicId);
        User user = userService.getUserById(userId);
        msg.setTopic(partTopic);
        msg.setUser(user);
        return topicMsgRepository.save(msg);
    }

    @Override
    public TopicMessage updateMsg(int topicId, TopicMessage msg) {
        return null;
    }

    @Override
    public TopicMessage getMsg(int msgId) {
        if(!topicMsgRepository.exists(msgId))
            throw new MsgNotFoundException("Msg not found");
        return topicMsgRepository.findOne(msgId);
    }

    @Override
    public void deleteMsg(int msgId) {
        topicMsgRepository.delete(msgId);
    }
}
