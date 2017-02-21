package com.clan.model.clan;

import lombok.Data;
import org.springframework.data.annotation.Id;

import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.Set;

/**
 * Created by weddy on 21.02.17.
 */
public @Data class PartTopic {

    @Id
    private int id;

    private String topicName;
    private String topicDisc;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "topic")
    private Set<TopicMsg> msgs;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "game_part_id", nullable = false)
    private ClanPart part;

}
