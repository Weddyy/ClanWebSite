package com.clan.RepositoryTest;

import com.clan.MainRunner;
import com.clan.StaticGenerate;
import com.clan.model.User;
import com.clan.model.clan.Clan;
import com.clan.model.clan.ClanGame;
import com.clan.repository.ClanGameRepository;
import com.clan.repository.ClanRepository;
import com.clan.repository.UserRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;

import java.util.HashSet;

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
        boolean br = false;
    }

}
