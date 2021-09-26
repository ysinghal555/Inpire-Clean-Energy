/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.internshala.yash;

public class User {

    private int id;
    private String email;
    private String password;
    private String fileName;

    public User(int id, String email, String password, String fileName) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.fileName = fileName;
    }

    public User() {
    }

    public User(String email, String password, String fileName) {
        this.email = email;
        this.password = password;
        this.fileName = fileName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
    
    
}
