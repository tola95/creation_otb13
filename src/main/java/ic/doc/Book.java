package ic.doc;

public class Book {

    private final String title;
    private final String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public boolean isWrittenBy(String author) {
        return this.author.equalsIgnoreCase(author);
    }

    @Override
    public String toString() {
        return String.format("%s, by %s", title, author);
    }
}
