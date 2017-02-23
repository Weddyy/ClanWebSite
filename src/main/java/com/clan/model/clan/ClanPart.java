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
@Table(name = "game_parts", schema = "clanSite")
@EqualsAndHashCode(exclude={"topics"})
@ToString(exclude={"topics"})
@Data
public class ClanPart {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String partName;
    private String partDisc;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "part")
    private Set<PartTopic> topics;

    @ManyToOne
    private ClanGame clanGame;
}
