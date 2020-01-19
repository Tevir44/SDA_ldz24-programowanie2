package pl.sdacademy.intermediate.basic.basic8;

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


}
