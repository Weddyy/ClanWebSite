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
@Table(name = "clan_game", schema = "clanSite")
@EqualsAndHashCode(exclude={"parts"})
@ToString(exclude={"parts"})
@Data
public class ClanGame {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String gameName;
    private String gameDisc;


    @OneToMany(fetch = FetchType.EAGER, mappedBy = "clanGame")
    private Set<ClanPart> parts;

    @ManyToOne
    private Clan clan;
}
