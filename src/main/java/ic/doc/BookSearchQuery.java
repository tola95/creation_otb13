package ic.doc;

import ic.doc.catalogues.BritishLibraryCatalogue;

import java.util.List;

public class BookSearchQuery {

    private final String author;

    public BookSearchQuery(String author) {
        this.author = author;
    }

    public List<Book> execute() {
        return new BritishLibraryCatalogue().searchFor(author);
    }
}