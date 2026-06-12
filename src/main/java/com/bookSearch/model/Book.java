package main.java.com.bookSearch.model;

public record Book(
        String title,
        String author,
        String genre,
        String numPages,
        String datePosted
    ) {
}
