package com.clan.model.clan;

import com.clan.model.User;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by weddy on 21.02.17.
 */
@Entity
@Table(name = "topic_msg", schema = "clanSite")
public @Data class TopicMsg {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String msg;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="user_id", nullable = false)
    private User user;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(insertable=false)
    private Date postedDate;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "topic_id", nullable = false)
    private PartTopic topic;
}
