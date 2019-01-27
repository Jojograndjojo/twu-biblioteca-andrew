package com.twu.biblioteca.entities;

import com.twu.biblioteca.res.ResStrings;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private ArrayList<Book> availableBooks;

    public Library(String[][] booksList) {
        availableBooks = new ArrayList<Book>();
        generateBooks(booksList);
    }

    public String welcomeMessage() {
        return ResStrings.welcomeMessage;
    }

    public ArrayList<Book> getBookList() {
        return availableBooks;
    }

    public String[] getBooksTitleList() {
        List<String> booksTitles = new ArrayList<String>();

        for (Book book : availableBooks) {
            booksTitles.add(book.getTitle());
        }

        return booksTitles.toArray(new String[0]);
    }

    private void generateBooks(String[][] bookList) {
        for (String[] book : bookList) {
            this.availableBooks.add(new Book(book[0], book[1], Integer.parseInt(book[2])));
        }
    }
}
