package com.pb.benera.hw5;

public class Book {

private String name;
private String author;
private int year;


    public Book(String name, String author,int year) {
        this.name = name;
        this.author = author;
        this.year=year;
    }

public Book (){
}

public String getName(){
    return name;
}

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getInfo(){
        return "[name:"+name+", author:"+author+", year:"+year+"]";

    }
}

