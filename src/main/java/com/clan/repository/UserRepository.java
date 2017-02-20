package com.clan.repository;

import com.clan.model.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by weddy on 19.02.17.
 */
public interface UserRepository extends CrudRepository<User,Integer> {

    public User findByEmail(String email);
}
