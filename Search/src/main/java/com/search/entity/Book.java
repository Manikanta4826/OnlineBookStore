package com.search.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "search")
public class Book {

    @Id
    long id;

    String bookNumber;
    String tittle;
    String genre;
    String author;


    public Book(long id, String bookNumber, String tittle, String genre, String author) {
        super();
        this.id = id;
        this.bookNumber = bookNumber;
        this.tittle = tittle;
        this.genre = genre;
        this.author = author;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBookNumber() {
        return bookNumber;
    }

    public void setBookNumber(String bookNumber) {
        this.bookNumber = bookNumber;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre= genre;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author= author;
    }



}

