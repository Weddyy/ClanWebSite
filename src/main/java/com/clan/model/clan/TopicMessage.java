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
@Data
public class TopicMessage {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String message;

    @OneToOne(fetch = FetchType.EAGER)
    private User user;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(insertable=false)
    private Date postedDate;

    @ManyToOne(fetch = FetchType.EAGER)
    private PartTopic topic;
}
