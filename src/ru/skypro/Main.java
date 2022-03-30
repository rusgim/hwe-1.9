package ru.skypro;

public class Main {


    public static void main(String[] args) {
        Book greenMile = new Book("Green Mile",new Author("Steven", "King"), 1996);
        Author stevenKing = new Author("Steven", "King");
        System.out.println("Название книги = " + greenMile.getName());
        System.out.println("Автор = " + stevenKing.getNameAuthor() + " " + stevenKing.getSurnameAuthor());
        System.out.println("Год издания = " + greenMile.getYearOfPublication());
        Book the_silence_of_the_lambs = new Book("The Silence Of The Lambs", new Author("Thomas", "Harris"), 1988);
        Author thomasHarris = new Author("Thomas", "Harris");
        System.out.println("Название книги = " + the_silence_of_the_lambs.getName());
        System.out.println("Автор = " + thomasHarris.getNameAuthor() + " " + thomasHarris.getSurnameAuthor());
        System.out.println("Год издания = " + the_silence_of_the_lambs.getYearOfPublication());
    }
}
