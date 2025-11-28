package rvt;

public class Book {
    private String title;
    private String pages;
    private String pubYear;

    public Book(String title, String pages, String pubYear) {
        this.title = title;
        this.pages = pages;
        this.pubYear = pubYear;
    }

    public String getTitle() {
        return title;
    }

    public String toString() {
        return title + ", " + pages + " pages, " + pubYear;
    }
}
