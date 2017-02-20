package com.clan.model;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by weddy on 19.02.17.
 */
@Entity
@Table(name = "users", schema = "clanSite")
public @Data class User {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nickName;
    private int access;
    private String email;
    private String passwrd;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="user_info_id")
    private UserInfo info;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User that = (User) o;

        if (id != that.id) return false;
        if (access != that.access) return false;
        if (nickName != null ? !nickName.equals(that.nickName) : that.nickName != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (passwrd != null ? !passwrd.equals(that.passwrd) : that.passwrd != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (nickName != null ? nickName.hashCode() : 0);
        result = 31 * result + access;
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (passwrd != null ? passwrd.hashCode() : 0);
        return result;
    }
}
