package com.yun.pojo;

public class Stutea {
    private int id;
    private String name;
    private String account;
    private int pwd;
    public Stutea(){

    }

    public Stutea(int id, String name, String account, int pwd) {
        this.id = id;
        this.name = name;
        this.account = account;
        this.pwd = pwd;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public int getPwd() {
        return pwd;
    }

    public void setPwd(int pwd) {
        this.pwd = pwd;
    }
}
