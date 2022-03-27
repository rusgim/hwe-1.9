package ru.skypro;

public class Main {

    public static void main(String[] args) {
        Book book1 = new Book("Green Mile", "Steven King", 1996);
        Book book2 = new Book("The Silence Of The Lambs", "Thomas Harris",1988);
        System.out.println("book1.name = " + book1.getNameBook());
        System.out.println("book2.name = " + book2.getNameBook());
        System.out.println("book1.yearOfPublication = " + book1.getYearOfPublication());
        System.out.println("book2.yearOfPublication = " + book2.getYearOfPublication());
        System.out.println("book1.fullName = " + book1.getFullName());
        System.out.println("book2.fullName = " + book2.getFullName());
    }
}
