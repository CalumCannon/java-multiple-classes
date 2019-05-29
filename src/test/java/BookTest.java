import org.junit.Before;

public class BookTest {

    LBook book;

    @Before
    public void setup() {
        book = new LBook("Rendezvous with Rama", "Arthur C. Clarke", "Science Fiction");
    }

}
