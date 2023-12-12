package com.example.NessaBack.Entities;

import jakarta.persistence.*;

@Entity
@Table(name="user")
public class User {
    @Id
    @Column(name="user_id",length = 45)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userid;

    @Column(name="user_name",length = 255)
    private String username;
    @Column(name="email",length = 255)
    private String email;
    @Column(name="password",length = 255)
    private String password;
    @Column(name="telNumber",length = 255)
    private String telNumber;
    @Column(name="adresse",length = 255)
    private String adresseb;
    @Column(name="pourcentage",length = 255)
    private String pourcentage;
    @Column(name="role",length = 255)
    private String role;


    public User(int userid, String username, String email, String password, String telNumber, String adresseb, String pourcentage, String role) {
        this.userid = userid;
        this.username = username;
        this.email = email;
        this.password = password;
        this.telNumber = telNumber;
        this.adresseb = adresseb;
        this.pourcentage = pourcentage;
        this.role = role;
    }
    public User(){}


    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTelNumber() {
        return telNumber;
    }

    public void setTelNumber(String telNumber) {
        this.telNumber = telNumber;
    }

    public String getAdresseb() {
        return adresseb;
    }

    public void setAdresseb(String adresseb) {
        this.adresseb = adresseb;
    }

    public String getPourcentage() {
        return pourcentage;
    }

    public void setPourcentage(String pourcentage) {
        this.pourcentage = pourcentage;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }


    @Override
    public String toString() {
        return "User{" +
                "userid=" + userid +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", telNumber='" + telNumber + '\'' +
                ", adresseb='" + adresseb + '\'' +
                ", pourcentage='" + pourcentage + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
