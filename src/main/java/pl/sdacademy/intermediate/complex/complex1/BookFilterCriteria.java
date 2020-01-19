package pl.sdacademy.intermediate.complex.complex1;

class BookFilterCriteria {
    private String titlePart;
    private String authorPart;
    private IntRange yearsRange;
    private IntRange pagesRange;
    private DoubleRange priceRange;

    public String getTitlePart() {
        return titlePart;
    }

    public void setTitlePart(String titlePart) {
        this.titlePart = titlePart;
    }

    public String getAuthorPart() {
        return authorPart;
    }

    public void setAuthorPart(String authorPart) {
        this.authorPart = authorPart;
    }

    public IntRange getYearsRange() {
        return yearsRange;
    }

    public void setYearsRange(IntRange yearsRange) {
        this.yearsRange = yearsRange;
    }

    public IntRange getPagesRange() {
        return pagesRange;
    }

    public void setPagesRange(IntRange pagesRange) {
        this.pagesRange = pagesRange;
    }

    public DoubleRange getPriceRange() {
        return priceRange;
    }

    public void setPriceRange(DoubleRange priceRange) {
        this.priceRange = priceRange;
    }

    boolean matches (Book book){

        boolean match = true;

        if (yearsRange != null && !yearsRange.contains(book.getYearPushlished()))
            match = false;
        if (pagesRange != null && !pagesRange.contains(book.getYearPushlished()))
            match = false;
        if (priceRange != null && !priceRange.contains(book.getPrice()))
            match = false;

        return match && book.getTitle().toLowerCase().contains(titlePart.toLowerCase()) && book.getAuthor().toLowerCase().contains(authorPart.toLowerCase());
    }
}
