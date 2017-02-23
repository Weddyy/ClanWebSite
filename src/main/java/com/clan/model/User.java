package com.clan.model;

import com.clan.model.clan.Clan;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by weddy on 19.02.17.
 */
@Entity
@Table(name = "users", schema = "clanSite")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String nickName;
    private int access;
    private String email;
    private String password;

    @OneToOne(cascade = CascadeType.ALL)
    private UserInfo info;

    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "users")
    Set<Clan> clans;
}
