package pl.sdacademy.intermediate.basic.basic8;

//2 obiekty sa euqauls -> musza miec ten sam hash code
//2 obiekty maja ten sam hash code -> NIE musza byc equals

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@ToString
@Getter
class Book{

    private String title;
    private String author;
    private int yearPushlished;
    private int numberOfPages;
    private double price;
    private Genre type;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (yearPushlished != book.yearPushlished) return false;
        if (numberOfPages != book.numberOfPages) return false;
        if (!title.equals(book.title)) return false;
        if (!author.equals(book.author)) return false;
        return type == book.type;
    }

    @Override
    public int hashCode() {
        int result = title.hashCode();
        result = 31 * result + author.hashCode();
        result = 31 * result + yearPushlished;
        result = 31 * result + numberOfPages;
        result = 31 * result + type.hashCode();
        return result;
    }
}
