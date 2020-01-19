package pl.sdacademy.intermediate.complex.complex1;

import pl.sdacademy.intermediate.basic.basic8.Genre;

import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

class BookStore {
    private Set<Book> books;
    private BookFilterCriteria filter;

    Set<Book> getListOfAllBooks() {
        return books;
    }

    BookStore() {
        this.books = new BookStoreInitializer().initBookStore();
    }

    List<Book> findBooksByAuthor(String author) {
        return books.stream()
                .filter(book -> book.getAuthor().equals(author))
                .collect(Collectors.toList());
    }

    List<Book> findBooksByTitle(String title) {
        return books.stream()
                .filter(book -> book.getTitle().equals(title))
                .collect(Collectors.toList());
    }

    List<Book> findBooksByPublishedYear(int year) {
        return books.stream()
                .filter(book -> book.getYearPushlished() == year)
                .collect(Collectors.toList());
    }

    List<Book> findBooksByNumberOfPages(int numberOfPages) {
        return books.stream()
                .filter(book -> book.getNumberOfPages() == numberOfPages)
                .collect(Collectors.toList());
    }

    List<Book> findBooksByPrice(double price) {
        return books.stream()
                .filter(book -> book.getPrice() == price)
                .collect(Collectors.toList());
    }

    List<Book> findBooksByGenre(String genre) {
        return books.stream()
                .filter(book -> book.getType().equals(Genre.valueOf(genre)))
                .collect(Collectors.toList());
    }

    List <Book> findBookUsingExternalData (){
        filter = new BookFilterCriteria();

        Scanner scr = new Scanner(System.in);
        System.out.println("Author:");
        filter.setAuthorPart(scr.next());
        System.out.println("Title");
        filter.setTitlePart(scr.next());

        return findBooksByPartialNameAndPartialAuthor();


    }

    List<Book> findBooksByPartialNameAndPartialAuthor() {

        return books.stream()
                .filter(book -> filter
                        .matches(book))
                .collect(Collectors.toList());
    }
}
