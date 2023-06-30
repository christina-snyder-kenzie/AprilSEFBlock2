package org.example;

public class ComicBookTester {
    public static void main(String[] args) {
        ComicBook myOnlyComic = new ComicBook("Godzilla vs Mighty Morphin Power Rangers", "Cullen Bunn", 55);
//        System.out.println(myOnlyComic.getTitle());

        myOnlyComic.getBookInfo();

        // lets get readin'
        myOnlyComic.read(20);

        myOnlyComic.getBookInfo();

        myOnlyComic.read(10000000);
        myOnlyComic.getBookInfo();
    }
}
