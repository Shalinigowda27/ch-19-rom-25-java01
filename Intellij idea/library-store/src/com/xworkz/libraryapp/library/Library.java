package com.xworkz.libraryapp.library;

import com.xworkz.libraryapp.books.BookApp;
import com.xworkz.libraryapp.valibation.BookValidator;

public class Library {

    BookApp bookApp;

    public boolean createBookApp(BookApp bookApp) {
        boolean bookAppCreated = false;


        BookValidator bookValidator = new BookValidator();

        boolean isBookAppValidated = bookValidator.validateBookApp(bookApp);

        if (isBookAppValidated) {
            this.bookApp = bookApp;
            bookAppCreated = true;
        }
        return bookAppCreated;
    }

    public void getBookInfo(){
        System.out.println("The book id is "+bookApp.getBookId());
        System.out.println("The book title is "+bookApp.getTitle());
        System.out.println("The author is "+bookApp.getAuthor());
        System.out.println("The publisher is "+bookApp.getPublisher());
        System.out.println("The publication year is "+bookApp.getPublicationYear());
        System.out.println("The language is "+bookApp.getLanguage());
        }

}
