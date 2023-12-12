package com.example.NessaBack.Dto;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class UserDTO {
    private int userid;
    private String username;
    private String email;
    private String password;
    private String telNumber;
    private String adresseb;
    private String pourcentage;
    private String role;

    public UserDTO(int userid, String username, String email, String password, String telNumber, String adresseb, String pourcentage, String role) {
        this.userid = userid;
        this.username = username;
        this.email = email;
        this.password = password;
        this.telNumber = telNumber;
        this.adresseb = adresseb;
        this.pourcentage = pourcentage;
        this.role = role;
    }

    public UserDTO() {
    }

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
}
