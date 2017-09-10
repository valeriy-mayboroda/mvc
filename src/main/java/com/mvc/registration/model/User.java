package com.mvc.registration.model;

import javax.persistence.*;

@Entity
@Table (name = "users")
public class User {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;
    @Column (name = "login")
    private String login;
    @Column (name = "password")
    private String password;

    public User() {}
    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public int getId() {return id;}
    public void setId(int id) {this.id = id;}
    public String getLogin() {return login;}
    public void setLogin(String login) {this.login = login;}
    public String getPassword() {return password;}
    public void setPassword(String password) {this.password = password;}

    @Override
    public String toString() {return "User " + "login = " + login + " password = " + password;}

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        User user = (User)obj;
        if (getLogin().equals(user.getLogin()) && getPassword().equals(user.getPassword()))
            return true;
        return false;
    }
}