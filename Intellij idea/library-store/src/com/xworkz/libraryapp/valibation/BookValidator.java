package com.xworkz.libraryapp.valibation;

import com.xworkz.libraryapp.books.BookApp;

public class BookValidator {

    public  boolean validateBookApp(BookApp bookApp) {
        boolean isBookAppValidated = false;

        boolean isBookIdValid = false;
        boolean isTitleValid = false;
        boolean isAuthorValid = false;
        boolean isPublisherValid = false;
        boolean isPublishedYearValid = false;
        boolean isLanguageValid = false;

        if (bookApp.getBookId() != 0) {
            isBookIdValid = true;
        } else {
            System.out.println("The book id is not valid");
        }

        if (bookApp.getTitle() != null) {
            isTitleValid = true;
        } else {
            System.out.println("The title is not valid");
        }

        if (bookApp.getAuthor() != null) {
            isAuthorValid = true;
        } else {
            System.out.println("The author is not valid");
        }

        if (bookApp.getPublisher() != null) {
            isPublisherValid = true;
        } else {
            System.out.println("The publisher is not valid");
        }

        if (bookApp.getPublicationYear() !=  0) {
            isPublishedYearValid = true;
        } else {
            System.out.println("The published year is not valid");
        }

        if (bookApp.getLanguage() != null) {
            isLanguageValid = true;
        } else {
            System.out.println("The language is not valid");
        }

        if (isBookIdValid && isTitleValid && isAuthorValid && isPublisherValid && isPublishedYearValid && isLanguageValid) {
            isBookAppValidated = true;
        }

        return isBookAppValidated;
    }
}
