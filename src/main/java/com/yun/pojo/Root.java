package com.yun.pojo;

import org.springframework.stereotype.Controller;

@Controller
public class Root {
    public String name;
    public int pwd;
    public int id;

    public Root(){

    }


    public Root(String name, int pwd, int id) {
        this.name = name;
        this.pwd = pwd;
        this.id = id;
    }

    @Override
    public String toString() {
        return "root{" +
                "name='" + name + '\'' +
                ", pwd=" + pwd +
                ", id=" + id +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPwd() {
        return pwd;
    }

    public void setPwd(int pwd) {
        this.pwd = pwd;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
