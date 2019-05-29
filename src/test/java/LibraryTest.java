import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    public BookLibrary library;
    public LBook book, book2;
    @Before
    public void setup() {
        library = new BookLibrary();
        book = new LBook("Rendezvous with Rama", "Arthur C. Clarke", "Science Fiction");
        book2 = new LBook("Fifty Shades of Grey", "Who Cares", "Fiction");
    }

    @Test
    public void testLibraryStartsEmpty() {
        assertEquals(0, library.getBookCount());
    }

    @Test
    public void testAddingBookToLibrary() {
        library.addBookToLibrary(book);
        assertEquals(1, library.getBookCount());
    }


    @Test
    public void testBookCapacityWhenAddingBookToLibrary() {
        library.addBookToLibrary(book2);
        library.addBookToLibrary(book2);
        library.addBookToLibrary(book2);
        library.addBookToLibrary(book2);
        library.addBookToLibrary(book2);
        library.addBookToLibrary(book2);
        assertEquals(5, library.getBookCount());
    }

    @Test
    public void testBookCountByGenre(){
        library.addBookToLibrary(book);
        library.addBookToLibrary(book);
        library.addBookToLibrary(book);
        library.addBookToLibrary(book);
        assertEquals(4, library.getNumberOfBooksByGenre("Science Fiction"));
    }
}
