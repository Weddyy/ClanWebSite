package com.clan.model;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by weddy on 19.02.17.
 */
@Entity
@Table(name = "user_info", schema = "clanSite")
@Data
public class UserInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String firstName;
    private String lastName;
}
