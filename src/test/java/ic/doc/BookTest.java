package ic.doc;

import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class BookTest {

    final Book oliverTwist = new Book("Oliver Twist", "Dickens");

    @Test
    public void supportsCaseInsensitiveAuthorQuery() {
        assertTrue(oliverTwist.isWrittenBy("Dickens"));
        assertTrue(oliverTwist.isWrittenBy("dickens"));
        assertFalse(oliverTwist.isWrittenBy("Shakespeare"));
    }

    @Test
    public void convertsToFormattedStringOfTitleAndAuthor() {
        assertThat(oliverTwist.toString(), is("Oliver Twist, by Dickens"));
    }

}