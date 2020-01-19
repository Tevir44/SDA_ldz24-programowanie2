package pl.sdacademy.intermediate.complex.complex1;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import pl.sdacademy.intermediate.basic.basic8.Genre;

import java.util.UUID;

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
    @Builder.Default
    private int amount = 3;
    @Builder.Default
    private final UUID id = UUID.randomUUID();

    BookShortInfo toBookShortInfo(){
        return BookShortInfo
                .builder()
                .author(author)
                .title(title)
                .yearPublished(yearPushlished)
                .id(id)
                .build();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        return id != null ? id.equals(book.id) : book.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
