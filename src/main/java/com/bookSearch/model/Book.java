package main.java.com.bookSearch.model;

import java.util.Date;

public record Livro(
        String title,
        String autor,
        String genre,
        int numPages,
        Date year
) {
}
