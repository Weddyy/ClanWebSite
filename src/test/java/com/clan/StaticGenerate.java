package com.clan;

import com.clan.model.User;
import com.clan.model.UserInfo;
import com.clan.model.clan.*;

/**
 * Created by weddy on 21.02.17.
 */
public class StaticGenerate {

    public static User getUser()
    {
        User user = new User();
        user.setAccess(0);
        user.setPasswrd("password");
        user.setEmail("mail.ru");
        user.setNickName("nickName");

        UserInfo info = new UserInfo();
        info.setFirstName("asd");
        info.setLastName("dsa");
        user.setInfo(info);
        return user;
    }

    public static Clan getClan()
    {
        Clan clan = new Clan();
        clan.setClanName("name");
        clan.setClanPrefix("prefix");
        return clan;
    }

    public static ClanGame getClanGame()
    {
        ClanGame game = new ClanGame();
        game.setGameDisc("diskClan");
        game.setGameName("clan Name");

        return game;
    }

    public static ClanPart getClanPart()
    {
        ClanPart part = new ClanPart();
        part.setPartDisc("part disk");
        part.setPartName("part name");

        return part;
    }

    public static PartTopic getTopk()
    {
        PartTopic topic = new PartTopic();
        topic.setTopicName("topik name");
        topic.setTopicDisc("topik disk");

        return topic;
    }

    public static TopicMsg getMsg()
    {
        TopicMsg msg = new TopicMsg();
        msg.setMsg("msg msg msg");
        return msg;
    }

}
