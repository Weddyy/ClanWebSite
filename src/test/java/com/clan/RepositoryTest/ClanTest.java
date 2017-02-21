package com.clan.RepositoryTest;

import com.clan.MainRunner;
import com.clan.StaticGenerate;
import com.clan.model.User;
import com.clan.model.clan.*;
import com.clan.repository.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;

/**
 * Created by weddy on 21.02.17.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = MainRunner.class, webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ClanTest {

    @Autowired
    private ClanRepository repository;
    @Autowired
    private ClanGameRepository clanGameRepository;
    @Autowired
    private ClanPartRepository clanPartRepository;
    @Autowired
    private PartTopicRepository partTopicRepository;
    @Autowired
    private TopicMsgRepository topicMsgRepository;

    @Autowired
    private UserRepository userRepository;

    User user;

    @Before
    public void setup()
    {
        user = userRepository.save(StaticGenerate.getUser());
    }

    @Test
    public void testCreateClan()
    {
        Clan clan = StaticGenerate.getClan();

        clan = repository.save(clan);

        Assert.notNull(clan.getId());
    }

    @Test

    public void createGame()
    {
        Clan clan = StaticGenerate.getClan();

        clan = repository.save(clan);

        ClanGame game = StaticGenerate.getClanGame();
        game.setClan(clan);
        game = clanGameRepository.save(game);
        clan = repository.findOne(clan.getId());

        ClanPart part = StaticGenerate.getClanPart();
        part.setClanGame(game);
        part = clanPartRepository.save(part);

        PartTopic topic = StaticGenerate.getTopk();
        topic.setPart(part);
        topic = partTopicRepository.save(topic);

        TopicMsg msg = StaticGenerate.getMsg();
        msg.setTopic(topic);
        msg.setUser(user);

        msg = topicMsgRepository.save(msg);

        boolean breakk=false;

    }

}
