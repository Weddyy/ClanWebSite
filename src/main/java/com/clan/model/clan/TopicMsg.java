package com.clan.model.clan;

import com.clan.model.User;
import lombok.Data;
import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by weddy on 21.02.17.
 */
public @Data class TopicMsg {

    @Id
    private int id;

    private String msg;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="user_id")
    private User user;

    private Date postedDate;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "topic_id", nullable = false)
    private PartTopic topic;
}
