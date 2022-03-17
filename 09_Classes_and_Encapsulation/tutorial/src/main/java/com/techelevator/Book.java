package com.techelevator;

public class Book {
    private String title;
    private  String author;
    private Double price;

    public Book() {

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor(){
        return author;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public Double getPrice(){
        return price;
    }

    public void setPrice(Double price){
        this.price = price;
    }

    public Book(String title, String author, Double price){
        this.title=title;
        this.author=author;
        this.price=price;
    }

    public  String bookInfo(){
        return  "Title: " + title + ", Author: " + author + ", Price: $ " + price;
    }
}
