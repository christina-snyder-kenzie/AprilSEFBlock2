package org.example;

public class ComicBook {

    // what properties belong to a comic book?
    // title
    // author
    // artist
    // numPages
    // currentPage
    // content
    // issue number

    private String title, author;
    private int numPages, currentPage;

    // Constructor(s)
    // assuming you have not read the book before
    public ComicBook(String title, String author, int numPages) {
        this.title = title;
        this.author = author;
        this.numPages = numPages;
        this.currentPage = 1;
    }

    // maybe you've read some, idk?
    public ComicBook(String title, String author, int numPages, int currentPage) {
        this.title = title;
        this.author = author;
        this.numPages = numPages;
        this.currentPage = currentPage;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getNumPages() {
        return this.numPages;
    }

    public int getCurrentPage() {
        return this.currentPage;
    }

    public void getBookInfo() {
        System.out.printf("Title: %s \nAuthor: %s \nCurrent Progress: %d/%d \nHave you finished reading?: %b", this.title, this.author, this.currentPage, this.numPages, this.isFinished());
        System.out.println();
        System.out.println("-----------------");
    }

    public void read(int pagesToRead) {
        this.currentPage = Math.min(this.numPages, this.currentPage + pagesToRead);
    }

    public boolean isFinished() {
        return this.currentPage >= this.numPages;
    }




}
