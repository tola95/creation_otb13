package ic.doc;

import ic.doc.catalogues.BritishLibraryCatalogue;
import ic.doc.catalogues.LibraryCatalogue;

import java.util.List;

public class BookSearchQuery {

    private final String author;
    private final LibraryCatalogue libCatalogue;

    public BookSearchQuery(String author, LibraryCatalogue libCatalogue) {
        this.author = author;
        this.libCatalogue = libCatalogue;
    }

    public List<Book> execute() {
        return libCatalogue.getInstance().searchFor(author);
    }
}