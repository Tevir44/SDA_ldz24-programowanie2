package pl.sdacademy.intermediate.basic.basic8;

import java.util.List;
import java.util.stream.Collectors;

public class Basic8FilesAndStreams {

    public static void printAllAuthors(BookStore bookstore) {
        bookstore.getListOfAllBooks()
                .stream()
                .map(Book::getAuthor)
                .distinct()
                .forEach(System.out::println);
    }

    public static void printNumberOfBooksOfGivenAuthor(BookStore bookstore, String author){
        long numberOfBooks = bookstore
                .getListOfAllBooks()
                .stream()
                .filter(book -> book.getAuthor()
                        .equals(author))
                .count();
        System.out.printf("There are %d books of author %s\n", numberOfBooks, author);
    }

    public static void printFullCostOf90sFantasyOver40(BookStore bookStore){
        double overallCost = bookStore
                .getListOfAllBooks()
                .stream()
                .filter(book -> book.getType()
                        .equals(Genre.FANTASY))
                .filter(book -> book.getYearPushlished()>=1990 && book.getYearPushlished()<2000)
                .filter(book -> book.getPrice()>40)
             //   .peek(System.out::println)  //Check for the books
                .mapToDouble(Book::getPrice)
                .sum();
        System.out.println("The overall cost of books that match the criteria is " + overallCost);
    }

    public static void printCrimeStoryBooks(BookStore bookStore){
        List <BookShortInfo> listBookShort;
        listBookShort = bookStore.getListOfAllBooks()
                .stream()
                .filter(book -> book.getAuthor().equals("Harlan Coben"))
                .filter(book -> book.getType().equals(Genre.CRIME_STORY))
                .filter((book -> book.getNumberOfPages()<300))
                .skip(2)
//                .map(book -> new BookShortInfo(book.getTitle(),book.getAuthor(),book.getYearPushlished()))
                .map(book -> BookShortInfo
                        .builder()
                        .author(book.getAuthor())
                        .title(book.getTitle())
                        .yearPublished(book.getYearPushlished())
                        .build())
                .collect(Collectors.toList());
        System.out.println(listBookShort);
    }

    public static void main(String[] args) {
        BookStore bookStore = new BookStore();




        System.out.println(bookStore.findBooksByAuthor("Andrzej Sapkowski"));
        System.out.println();
        System.out.println(bookStore.findBooksByTitle("Harry Potter and the The Half-Blood Prince"));
        System.out.println();
        System.out.println(bookStore.findBooksByPublishedYear(1997));
        System.out.println();
        System.out.println(bookStore.findBooksByNumberOfPages(217));
        System.out.println();
        System.out.println(bookStore.findBooksByPrice(29.99));
        System.out.println();
        System.out.println(bookStore.findBooksByGenre("FOR_CHILDREN"));

        System.out.println();
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println();

        printAllAuthors(bookStore);
        printNumberOfBooksOfGivenAuthor(bookStore, "Andrzej Sapkowski");
        printFullCostOf90sFantasyOver40(bookStore);
        System.out.println();

        printCrimeStoryBooks(bookStore);


    }
}
