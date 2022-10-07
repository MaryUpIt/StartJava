package com.startjava.graduation.bookshelf;


public class Book {
    private String author;
    private String title;
    private int publishYear;

    public Book(String author, String title, String publishYear) {
        this.author = author;
        this.title = title;
        this.publishYear = Integer.parseInt(publishYear);
        if (this.publishYear > 2022 || this.publishYear < 1500) {
            throw new IllegalArgumentException("Год печати должен быть реальным!!!");
        }
    }

    public String getTitle() {
        return title;
    }

    public String toString() {
         return author + ", " + title + ", " + publishYear;
    }


}
