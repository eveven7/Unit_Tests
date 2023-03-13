package org.example.Library;

import org.example.Book.Book;
import org.example.Book.Library;
import org.example.Calculator.Calculator;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

public class LibraryTest {

    private final Library library = new Library();

    @Mock
    Calculator calculator;

    @InjectMocks
    Library lib;


    @Test
    public void addNumbers_shouldReturnCorrectSum_withPositiveNumbers() {
        Book book1 = new Book("Luck", 200);
        Book book2 = new Book("Success", 300);
        Book book3 = new Book("Joyful life", 100);
        Book book4 = new Book("I work my dream job", 560);

        List<Book> books = new ArrayList<>();

        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        library.setBooks(books);
        final int expected = 4;
//        when(library.numberOfBooks()).thenReturn(expected);
        final int actual = library.numberOfBooks();
        assertThat(actual).isEqualTo(expected);

        when(calculator).thenReturn(false);

    }
}
