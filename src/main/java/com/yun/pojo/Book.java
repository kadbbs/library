package com.yun.pojo;

public class Book {
    private String bookname;
    private String author;
    private String intro;
    private String category;
    public Book (){

    }

    public Book(String bookname, String author, String intro, String category) {
        this.bookname = bookname;
        this.author = author;
        this.intro = intro;
        this.category = category;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
