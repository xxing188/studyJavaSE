package com.xiang.demo;


import java.util.Date;

public class Book08 {
    private int id;
    private String bookName;
    private String isbn;
    private double price;
    private Date date;

    public Book08() {
    }

    public Book08(int id, String bookName, String isbn, double price, Date date) {
        this.id = id;
        this.bookName = bookName;
        this.isbn = isbn;
        this.price = price;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    public void showBook(){
        System.out.println("NO:" + id + "," + bookName + ",isbn:"+ isbn + ",价格:" + price + ",出版日期:" + date);
    }
}
