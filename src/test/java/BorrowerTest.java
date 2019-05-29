import org.junit.Before;
import org.junit.Test;

import java.awt.print.Book;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Borrower borrower;
    BookLibrary library;
    LBook book;

    @Before
    public void setup() {
        borrower = new Borrower();
        library = new BookLibrary();
        book = new LBook("Rendezvous with Rama", "Arthur C. Clarke", "Science Fiction");
    }

    @Test
    public void canRentBook() {
        borrower.addBook(book);
        assertEquals(1,borrower.getBookCount());

    }
}
