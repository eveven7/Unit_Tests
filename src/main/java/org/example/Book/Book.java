package org.example.Book;

public class Book {
    int numberPages;
    String bookTitle;
    public Book(String bookTitle, int numberPages) {
        this.bookTitle = bookTitle;
        this.numberPages = numberPages;

    }
    public int getNumberPages() {
        return numberPages;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setNumberPages(int numberPages) {
        this.numberPages = numberPages;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    @Override
    public String toString() {
        return
                "\nTitle : " + bookTitle +
                        "\nGenre :" + numberPages + "\n";
    }
}
