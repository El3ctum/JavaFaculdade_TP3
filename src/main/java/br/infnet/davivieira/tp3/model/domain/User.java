package br.infnet.davivieira.tp3.model.domain;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nickName;

    private String email;

    private LocalDate birthday;

    @Override
    public String toString() {
        return "User: " + id + ";" + nickName + ";" + email + ";" + birthday;
    }

    public User() {
    }

    public User(String nickName) {
        this();
        this.nickName = nickName;
    }

    public User(String nickName, String email, LocalDate birthday) {
        this(nickName);
        this.email = email;
        this.birthday = birthday;
    }

    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = LocalDate.parse(birthday);
    }

}
