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
@Data
public class Clan {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String clanName;
    private String clanPrefix;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Set<User> users;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "clan")
    private Set<ClanGame> games;



}
