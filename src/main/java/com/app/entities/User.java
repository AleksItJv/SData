package com.app.entities;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String login;
    private String name;
    private int age;
    @Column(unique = true)
    private String email;

    public User(){}
    public User(String login, String name, int age, String email) {
        this.login = login;
        this.name = name;
        this.age = age;
        this.email = email;
    }
}
