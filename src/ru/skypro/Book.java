package ru.skypro;

public class Book {
    private final String nameBook;
    private final Author fullName;
    private final int yearOfPublication;

    public Book(String nameBook, Author fullName, int yearOfPublication) {
        this.nameBook = nameBook;
        this.fullName = fullName;
        this.yearOfPublication = yearOfPublication;
    }

    public String getNameBook() {
        return  nameBook;
    }
    public Author getFullName() {
        return fullName;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }
}