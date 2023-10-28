package com.bookstore;

public class Book {
    private String title;
    private String author;
    private String ISBN;
    private Boolean isAvailable;

    public Book() {
        title = "";
        author = "";
        ISBN = "";
        isAvailable = false;
    }

    public Book(String title, String author, String ISBN, Boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.isAvailable = isAvailable;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public Boolean getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(Boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public void printBook() {
        System.out.println("Título: " + getTitle());
        System.out.println("Autor: " + getAuthor());
        System.out.println("ISBN: " + getISBN());
        System.out.println("Disponíbilidade: " + (getIsAvailable() ? "Disponível" : "Indisponível") + "\n");
    }
}
