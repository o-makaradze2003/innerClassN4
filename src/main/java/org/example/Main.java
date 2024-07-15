package org.example;

public class Main {
    public static void main(String[] args) {
        Library lib = new Library();
        Library.Book book=lib.new Book() ;
        book.setAuthor("Vasya");
        book.setTitle("BookN1");
        System.out.println(book.getAuthor());
        System.out.println( book.getTitle());
    }
}