package com.clan.model.clan;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by weddy on 21.02.17.
 */
@Entity
@Table(name = "part_topics", schema = "clanSite")
@EqualsAndHashCode(exclude={"msgs"})
@ToString(exclude={"msgs"})
public @Data class PartTopic {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String topicName;
    private String topicDisc;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "topic")
    private Set<TopicMsg> msgs;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "game_part_id", nullable = false)
    private ClanPart part;

}
