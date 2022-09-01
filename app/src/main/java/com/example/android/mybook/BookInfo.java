package com.example.android.mybook;

public class BookInfo {

    String title;
    String author;
    String pages;

    public BookInfo(String title, String author, String pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {

        return author;
    }

    public String getPages() {

        return pages;
    }
}


