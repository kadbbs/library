package com.yun.pojo;

public class Borrow {
    private String borrower;
    private String book;
    private String starttime;
    private String stoptime;
    public Borrow(){

    }

    public Borrow(String borrower, String book, String starttime, String stoptime) {
        this.borrower = borrower;
        this.book = book;
        this.starttime = starttime;
        this.stoptime = stoptime;
    }

    public String getBorrower() {
        return borrower;
    }

    public void setBorrower(String borrower) {
        this.borrower = borrower;
    }

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    public String getStarttime() {
        return starttime;
    }

    public void setStarttime(String starttime) {
        this.starttime = starttime;
    }

    public String getStoptime() {
        return stoptime;
    }

    public void setStoptime(String stoptime) {
        this.stoptime = stoptime;
    }
}
