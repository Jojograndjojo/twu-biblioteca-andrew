package com.twu.biblioteca;


import com.twu.biblioteca.entities.Library;
import com.twu.biblioteca.res.ResStrings;
import com.twu.biblioteca.util.Printer;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExampleTest {

    @Test
    public void testWelcome() {
        Library library = new Library(ResStrings.booksList);
        assertEquals(ResStrings.welcomeMessage, library.welcomeMessage());
    }

//    @Test
//    public void testBookTitleList() {
//        Library library = new Library(ResStrings.booksList);
//        assertEquals(ResStrings.booksList, library.getBooksTitleList());
//    }

    @Test
    public void testBookTitleListOutput() {
        String[][] books = ResStrings.booksList;
        Library library = new Library(books);
        assertEquals("\nAvailable books:\n" +
                books[0][0]+" - "+books[0][1]+"\n" +
                books[1][0]+" - "+books[1][1]+"\n" +
                books[2][0]+" - "+books[2][1]+"\n", Printer.generateBooksTitlesOutput(library.getBookList()));
    }
}
