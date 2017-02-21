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
public @Data class ClanPart {

    @Id
    private int id;

    private String partName;
    private String partDisc;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "part")
    private Set<PartTopic> topics;

    @ManyToOne
    @JoinColumn(name="department_id")
    private ClanGame clanGame;
}
