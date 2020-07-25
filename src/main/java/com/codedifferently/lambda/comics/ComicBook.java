package com.codedifferently.lambda.comics;

public class ComicBook implements Comparable<ComicBook> {
    private String publisher;
    private String title;
    private int issue;

    public ComicBook(String publisher, String title, int issue) {
        this.publisher = publisher;
        this.title = title;
        this.issue = issue;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getTitle() {
        return title;
    }

    public int getIssue() {
        return issue;
    }

    @Override
    public String toString() {
        return String.format("%s Comics, %s #%d \n", this.publisher, this.title, this.issue);
    }

    @Override
    public int compareTo(ComicBook o) {
        return this.toString().compareTo(o.toString());
    }
}