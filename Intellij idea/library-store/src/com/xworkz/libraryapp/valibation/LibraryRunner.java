package com.xworkz.libraryapp.valibation;

import com.xworkz.libraryapp.books.BookApp;
import com.xworkz.libraryapp.library.Library;

public class LibraryRunner {

    public static void main(String[] args) {

        BookApp bookApp = new BookApp();
        bookApp.setBookId(10);
        bookApp.setTitle("Malegalalli Madumagalu");
        bookApp.setAuthor("Kuvempu");
        bookApp.setPublisher("Udaya Bharati Prakashana");
        bookApp.setPublicationYear(1967);
        bookApp.setLanguage("Kannada");

        Library library = new Library();
        boolean createBookApp = library.createBookApp(bookApp);

        if(createBookApp){
            library.getBookInfo();
        }
    }
}
