package com.clan.repository;

import com.clan.model.clan.TopicMessage;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by weddy on 21.02.17.
 */
public interface TopicMsgRepository extends CrudRepository<TopicMessage,Integer> {
}
