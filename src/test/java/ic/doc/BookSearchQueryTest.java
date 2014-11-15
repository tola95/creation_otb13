package ic.doc;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.greaterThan;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class BookSearchQueryTest {

    @Test
    public void allowsLookingUpBooksByAuthor() {
        List<Book> books = new BookSearchQuery("dickens").execute();
        assertThat(books.size(), is(greaterThan(0)));
        for (Book book : books) {
            assertTrue(book.isWrittenBy("dickens"));
        }
    }
}
