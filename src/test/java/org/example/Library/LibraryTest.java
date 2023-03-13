package org.example.Library;

import org.example.Book.Book;
import org.example.Book.Library;
import org.example.Calculator.Calculator;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class LibraryTest {

    private final Library library = new Library();

    @Mock
    Calculator calculator;

    @InjectMocks
    Library lib;
    @Mock
    private List<Book> mockedBooks;

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

    @Test
    public void ShouldPrintAllBooks() {
        when(mockedBooks.get(0)).thenReturn(new Book("Joyful life",100 ));

        assertEquals(100, library.printAllBooks().get(0).getNumberPages());
        assertEquals("Joyful life", library.printAllBooks().get(0).getBookTitle());
    }

    @Test
    public void Should_GetNumberOfBooks() {
        when(mockedBooks.size()).thenReturn(4);
        assertEquals(4, library.numberOfBooks());
    }
    @Test
    public void Should_FindBookWithMaxPages_WhenLibraryHasBooks() {
        when(mockedBooks.size()).thenReturn(2);
        when(mockedBooks.get(0)).thenReturn(new Book("title1", 55 ));
        when(mockedBooks.get(1)).thenReturn(new Book("title2",43 ));
S
        Optional<Book> actual = library.findMaxPages();

        assertEquals(55, actual.getNumberPages());
    }

}
