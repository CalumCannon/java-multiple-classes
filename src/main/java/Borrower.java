import java.util.ArrayList;

public class Borrower {

    ArrayList<LBook> books;

    public Borrower(){
        books = new ArrayList<LBook>();
    }

    public int getBookCount() {
        return books.size();
    }

    public void addBook(LBook book){
        this.books.add(book);
    }
}
