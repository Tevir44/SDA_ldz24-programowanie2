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

    IntRange setIntRange() {
        int min, max;
        IntRange intRange;
        Scanner scr = new Scanner(System.in);

        System.out.println("Min:");
        min = scr.nextInt();
        System.out.println("Max:");
        max = scr.nextInt();
        intRange = new IntRange(min, max);
        return intRange;
    }

    DoubleRange setDoubleRange() {
        double min, max;
        DoubleRange doubleRange;
        Scanner scr = new Scanner(System.in);

        System.out.println("Min:");
        min = scr.nextDouble();
        System.out.println("Max:");
        max = scr.nextDouble();
        doubleRange = new DoubleRange(min, max);
        return doubleRange;
    }

    List <Book> findBookUsingExternalData (){
        filter = new BookFilterCriteria();

        Scanner scr = new Scanner(System.in);

        System.out.println("Author:");
        filter.setAuthorPart(scr.next());

        System.out.println("Title");
        filter.setTitlePart(scr.next());
        scr.nextLine();

        System.out.println("Search by dates?");
        if (scr.nextLine().equals("yes")) {
            System.out.println("Year ranges. Please provide min and max values for published year.");
            filter.setYearsRange(setIntRange());
        }

        System.out.println("Search by pages?");
        if (scr.nextLine().equals("yes")) {
            System.out.println("Please set pages range. Please provide min and max values for the number of pages");
            filter.setPagesRange(setIntRange());
        }
        System.out.println("Search by price?");
        if (scr.nextLine().equals("yes")) {
            System.out.println("Please set price ranges Please provide min and max values for the price");
            filter.setPriceRange(setDoubleRange());
        }


        return findBooksByPartialNameAndPartialAuthor();


    }

    List<Book> findBooksByPartialNameAndPartialAuthor() {

        return books.stream()
                .filter(book -> filter
                        .matches(book))
                .collect(Collectors.toList());
    }
}
