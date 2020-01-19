package pl.sdacademy.intermediate.basic.basic8;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

//Double przy porownaniach warto zmieniac na BigDecimal

class BookStore {
    private List<Book> books;

    List<Book> getListOfAllBooks() {
        return books;
    }

    BookStore() {
        this.books = new BookStoreInitializer().initBookStore();
    }

    List<Book> findBooksByAuthor(String author){
        return books.stream()
                .filter(book -> book.getAuthor().equals(author))
                .collect(Collectors.toList());
    }

    List<Book> findBooksByTitle(String title){
        return books.stream()
                .filter(book -> book.getTitle().equals(title))
                .collect(Collectors.toList());
    }

    List<Book> findBooksByPublishedYear(int year){
        return books.stream()
                .filter(book -> book.getYearPushlished() == year)
                .collect(Collectors.toList());
    }

    List<Book> findBooksByNumberOfPages(int numberOfPages){
        return books.stream()
                .filter(book -> book.getNumberOfPages() == numberOfPages)
                .collect(Collectors.toList());
    }

    List<Book> findBooksByPrice(double price){
        return books.stream()
                .filter(book -> BigDecimal.valueOf(book.getPrice()).equals(BigDecimal.valueOf(price)))
                .collect(Collectors.toList());
    }

    List<Book> findBooksByGenre(String genre){
        return books.stream()
                .filter(book -> book.getType().equals(Genre.valueOf(genre)))
                .collect(Collectors.toList());
    }
}
