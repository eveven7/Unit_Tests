package org.example.Book;

import org.example.Calculator.Calculator;

import java.util.*;
import java.util.stream.Collectors;

public class Library {
    private List<Book> books = new ArrayList<>();
    public Calculator calculator;

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public List<Book> printAllBooks(){
        for (Book book : books) {
            System.out.println(book.toString());
        }
        return books;
    }

    public int numberOfBooks(){
       return books.size();
    }
    public List<Book> findByTitle(String title){
        return books.stream()
                .filter(a -> Objects.equals(a.getBookTitle(), title))
                .collect(Collectors.toList());
    }
    public Optional<Book> findMaxPages() {
    return books.stream().max(Comparator.comparingInt(Book::getNumberPages));

    }

    private static void printing(List<Book> books) {
        for (Book book : books) {
            System.out.println(book.toString() + "\n");
        }
    }

}
