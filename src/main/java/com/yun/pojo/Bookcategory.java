package com.yun.pojo;

import org.apache.ibatis.type.NStringTypeHandler;

public class Bookcategory {
    private String category;
    public Bookcategory (){

    }

    public Bookcategory(String category){
        this.category = category;
    }

    public String getCategory(){
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}