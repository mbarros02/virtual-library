package main.java.com.bookSearch.view;

import main.java.com.bookSearch.model.Book;

import java.util.List;
import java.util.Scanner;

public class BookView {

    Scanner scan = new Scanner(System.in);

    public void showWelcome(){
        System.out.println("----------------------------------------");
        System.out.println("       Welcome to VirtualLibrary");
        System.out.println("----------------------------------------");
    }

    public String readBookTitle() {
        System.out.println("Book title you want to search: ");
        return scan.nextLine();
    }

    public void showBooksList(List<Book> list){
        if(list.isEmpty()) {
            System.out.println("No books found for this search!");
            return;
        }
        System.out.println("\n--- No results ---");

        for(Book book : list) {
            showBooksDetails(book);
        }
    }

    public void showBooksDetails(Book book){
        System.out.println("--------------------------------------------------");
        System.out.println("Title: ...................." + book.title());
        System.out.println("Author: ..................." + book.author());
        System.out.println("Genre: ...................." + book.genre());
        System.out.println("Pages: ...................." + book.numPages());
        System.out.println("Released: ................." + book.datePosted());
    }

    public void showError(String message) {
        System.out.println("[Error]" + message);
    }

}
