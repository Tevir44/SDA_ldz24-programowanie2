package pl.sdacademy.intermediate.basic.basic8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

class BookStoreInitializer {

    List<Book> initBookStore() {
        String line;
        String[] bookData;
        List<Book> bookStore = new ArrayList<>();
        File file = new File(Objects.requireNonNull(getClass().getClassLoader().getResource("books.txt")).getFile());
        try (Scanner scr = new Scanner(file)) {
            while (scr.hasNextLine())
            {
                line = scr.nextLine();
                bookData = line.split("\\|");
                bookStore.add(
                        Book.builder()
                                .title(bookData[0])
                                .author(bookData[1])
                                .yearPushlished(Integer.parseInt(bookData[2]))
                                .numberOfPages(Integer.parseInt(bookData[3]))
                                .price(Double.parseDouble(bookData[4]))
                                .type(Genre.valueOf(bookData[5]))
                                .build()
                );

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return bookStore;
    }
}
