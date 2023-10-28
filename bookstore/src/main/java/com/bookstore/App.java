package com.bookstore;

public class App {
    public static void main(String[] args) {
        System.out.println("Biblioteca\n");

        Book book1 = new Book("Arquitetura Limpa", "Robert C. Martin", "978-85-508-0460-6", true);
        book1.printBook();

        Book book2 = new Book("Ahsoka", "E. K. Johnston", "978-65-5609-027-6", true);
        book2.printBook();
    }
}
