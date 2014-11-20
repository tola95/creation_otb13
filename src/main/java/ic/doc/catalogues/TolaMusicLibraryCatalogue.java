package ic.doc.catalogues;

import ic.doc.Book;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class TolaMusicLibraryCatalogue implements LibraryCatalogue {

	private final Collection<Book> catalogue = allTheSongs();
	
	private static TolaMusicLibraryCatalogue instance;
	
	private TolaMusicLibraryCatalogue() {
		
	}

	@Override
	public List<Book> searchFor(String author) {
		List<Book> results = new ArrayList<>();
        for (Book book : catalogue) {
            if (book.isWrittenBy(author)) {
                results.add(book);
            }
        }
        return results;
	}

	private Collection<Book> allTheSongs() {
		return Arrays.asList(
	            new Book("Yesterday", "The Beatles"),
	            new Book("Questions", "Asa"),
	            new Book("99 Problems", "Jay-Z"),
	            new Book("Holy Grail", "Jay-Z"),
	            new Book("Ting-A-Ling", "Shabba Ranks"));
	}
	
	public static synchronized TolaMusicLibraryCatalogue getInstance() {
    	if (instance == null) {
    		instance = new TolaMusicLibraryCatalogue();
    	}
    	return instance;
    }

}
