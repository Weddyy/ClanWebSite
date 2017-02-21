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
public @Data class ClanGame {

    @Id
    private int id;

    private String gameName;
    private String gameDisc;


    @OneToMany(fetch = FetchType.EAGER, mappedBy = "clanGame")
    private Set<ClanPart> parts;

    @ManyToOne
    @JoinColumn(name="clan_id")
    private Clan clan;
}
