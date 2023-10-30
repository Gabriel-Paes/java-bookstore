package com.bookstore;

import com.bookstore.linkedlist.LinkedList;

public class App {
    public static void main(String[] args) {
        LinkedList bookshelf = new LinkedList();

        bookshelf.push(new Book("Arquitetura Limpa", "Robert C. Martin", "978-85-508-0460-6", true));
        bookshelf.push(new Book("Ahsoka", "E. K. Johnston", "978-65-5609-027-6", true));

        System.out.println(bookshelf.length());
        System.out.println(bookshelf);

        System.out.println("Biblioteca\n");

        Book bookSearched = bookshelf.getBookByAuthor("Robert C. Martin");
        bookSearched.printBook();

        bookshelf.remove("978-85-508-0460-6");

        Book bookSearched2 = bookshelf.getBookByAuthor("Robert C. Martin");
        bookSearched2.printBook();

        System.out.println(bookshelf);
        System.out.println(bookshelf.length());

    }
}
