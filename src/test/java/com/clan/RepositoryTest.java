package com.clan;

import com.clan.model.UserInfo;
import com.clan.model.User;
import com.clan.repository.UserRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by weddy on 19.02.17.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = MainRunner.class, webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT)
public class RepositoryTest {


    @Autowired
    private UserRepository repo;

    @Before
    public void setup()
    {

    }

    @Test
    public void addGetAndDelete()
    {
        User entity = new User();
        entity.setEmail("email@test.ru");
        entity.setAccess(1);
        entity.setNickName("nickNameu");
        entity.setPasswrd("pswd");
        UserInfo infoEntity = new UserInfo();
        infoEntity.setFirstName("asd");
        infoEntity.setLastName("gad");
        entity.setInfo(infoEntity);
        entity = repo.save(entity);

        User newEntity = repo.findOne(entity.getId());
        Assert.assertEquals(entity,newEntity);

        repo.delete(entity);

        Assert.assertFalse(repo.exists(entity.getId()));
    }

    @Test
    public void getUser()
    {
        User entity = new User();
        entity.setEmail("aaaa@test.ru");
        entity.setAccess(1);
        entity.setNickName("nickNameu");
        entity.setPasswrd("pswd");
        UserInfo infoEntity = new UserInfo();
        infoEntity.setFirstName("asd");
        infoEntity.setLastName("gad");
        entity.setInfo(infoEntity);
        entity = repo.save(entity);

        User newEntity = repo.findByEmail(entity.getEmail());
        Assert.assertEquals(entity,newEntity);
    }

}
