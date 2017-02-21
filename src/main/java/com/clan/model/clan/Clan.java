package com.clan.model.clan;

import com.clan.model.User;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by weddy on 20.02.17.
 */

@Entity
@Table(name = "clan", schema = "clanSite")
@EqualsAndHashCode(exclude={"users", "games"})
@ToString(exclude={"users", "games"})
public @Data class Clan {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String clanName;
    private String clanPrefix;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "user_clan", joinColumns = {
            @JoinColumn(name = "clan_id", nullable = false, updatable = false) },
            inverseJoinColumns = { @JoinColumn(name = "user_id",
                    nullable = false, updatable = false) })
    private Set<User> users;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "clan")
    private Set<ClanGame> games;



}
