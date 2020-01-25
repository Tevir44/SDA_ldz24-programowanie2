package pl.sdacademy.intermediate.basic.basic8;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class BookStoreTest {

    private static final int NUMBER_OF_BOOKS_AFTER_INITIALIZATION = 36;
    private static final int NUMBER_OF_SAPKOWSKI_BOOKS = 8;
    private static final int NUMBER_OF_BOOKS_FROM_1999 = 3;
    private static final int NUMBER_OF_BOOKS_WITH_384_PAGES = 2;
    private static final int NUMBER_OF_BOOKS_WITH_39_POINT_99_PRICE = 4;
    private static final int NUMBER_OF_CRIME_STORY_BOOKS = 15;
    private static BookStore bookStore;

    @BeforeClass
    public static void setUpClass() {
        bookStore = new BookStore();
    }

    @Test
    public void testBookStoreInitializer() {
        Assert.assertEquals(NUMBER_OF_BOOKS_AFTER_INITIALIZATION, bookStore.getListOfAllBooks().size());
    }

    @Test
    public void testFindBookByTitle() {
        //Given
        Book longLostBook = Book
                .builder()
                .title("Long Lost")
                .author("Harlan Coben")
                .yearPushlished(2009)
                .price(44.99)
                .numberOfPages(195)
                .type(Genre.CRIME_STORY)
                .build();
        //when
        List<Book> listByTitle = bookStore.findBooksByTitle("Long Lost");
        //then
        Assert.assertEquals(1, listByTitle.size());
        Assert.assertEquals(longLostBook, listByTitle.get(0));
    }


    @Test
    public void testFindBooksByAuthor() {
        //given
        String author = "Andrzej Sapkowski";

        List<Book> mockListOfBooksBySapkowski = new ArrayList<>();
        mockListOfBooksBySapkowski.add(Book.builder().title("The Witcher: The Last Wish").yearPushlished(1993).author("Andrzej Sapkowski").price(34.99).type(Genre.FANTASY).numberOfPages(288).build());
        mockListOfBooksBySapkowski.add(Book.builder().title("The Witcher: Sword of Destiny").yearPushlished(1992).author("Andrzej Sapkowski").price(44.99).type(Genre.FANTASY).numberOfPages(384).build());
        mockListOfBooksBySapkowski.add(Book.builder().title("The Witcher: Blood of Elves").yearPushlished(1994).author("Andrzej Sapkowski").price(44.99).type(Genre.FANTASY).numberOfPages(320).build());
        mockListOfBooksBySapkowski.add(Book.builder().title("The Witcher: Time of Contempt").yearPushlished(1995).author("Andrzej Sapkowski").price(44.99).type(Genre.FANTASY).numberOfPages(331).build());
        mockListOfBooksBySapkowski.add(Book.builder().title("The Witcher: Baptism of Fire").yearPushlished(1996).author("Andrzej Sapkowski").price(44.99).type(Genre.FANTASY).numberOfPages(343).build());
        mockListOfBooksBySapkowski.add(Book.builder().title("The Witcher: The Tower of the Swallow").yearPushlished(1997).author("Andrzej Sapkowski").price(54.99).type(Genre.FANTASY).numberOfPages(436).build());
        mockListOfBooksBySapkowski.add(Book.builder().title("The Witcher: The Lady of the Lake").yearPushlished(1999).author("Andrzej Sapkowski").price(54.99).type(Genre.FANTASY).numberOfPages(531).build());
        mockListOfBooksBySapkowski.add(Book.builder().title("The Witcher: Season of Storms").yearPushlished(2013).author("Andrzej Sapkowski").price(29.99).type(Genre.FANTASY).numberOfPages(384).build());

        //when
        List<Book> booksByAuthor = bookStore.findBooksByAuthor(author);

        //then
        Assert.assertEquals(mockListOfBooksBySapkowski, booksByAuthor);
        Assert.assertEquals(NUMBER_OF_SAPKOWSKI_BOOKS, mockListOfBooksBySapkowski.size());
        Assert.assertTrue(booksByAuthor.stream()
                .allMatch(book -> book.getAuthor().equals(author)));
    }

    @Test
    public void testFindBooksByPublishedYear() {
        //given
        int mockYear = 1999;

        //when
        List<Book> booksPublishedIn1999 = bookStore.findBooksByPublishedYear(mockYear);

        //then
        Assert.assertEquals(NUMBER_OF_BOOKS_FROM_1999, booksPublishedIn1999.size());
        Assert.assertTrue(booksPublishedIn1999.stream()
                .allMatch(book -> book.getYearPushlished() == mockYear));
    }

    @Test
    public void testFindBooksByNumberOfPages() {
        //given
        int numberOfPages = 384;

        //when
        List<Book> booksWith384Pages = bookStore.findBooksByNumberOfPages(numberOfPages);

        //then
        Assert.assertEquals(NUMBER_OF_BOOKS_WITH_384_PAGES, booksWith384Pages.size());
        Assert.assertTrue(booksWith384Pages.stream()
                .allMatch(book -> book.getNumberOfPages() == numberOfPages));
    }

    @Test
    public void findBooksByPrice() {
        //given
        double mockPrice = 39.99d;

        //when
        List<Book> booksWithPrice39Point99 = bookStore.findBooksByPrice(39.99d);

        //then
        Assert.assertEquals(NUMBER_OF_BOOKS_WITH_39_POINT_99_PRICE, booksWithPrice39Point99.size());
        Assert.assertTrue(booksWithPrice39Point99.stream()
                .allMatch(book -> BigDecimal.valueOf(book.getPrice()).equals(BigDecimal.valueOf(mockPrice))));
    }

    @Test
    public void findBooksByGenre() {
        //given
        String crimeStory = "CRIME_STORY";

        //when
        List<Book> crimeStoryBooks = bookStore.findBooksByGenre(crimeStory);

        //then
        Assert.assertEquals(NUMBER_OF_CRIME_STORY_BOOKS, crimeStoryBooks.size());
        Assert.assertTrue(crimeStoryBooks.stream()
                .allMatch(book -> book.getType().equals(Genre.CRIME_STORY)));
    }
}