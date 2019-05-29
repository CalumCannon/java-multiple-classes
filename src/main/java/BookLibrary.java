import java.util.ArrayList;
import java.util.HashMap;

public class BookLibrary {

    ArrayList<LBook> books;
    int capacity;
    HashMap<String, Integer> booksByGenre;

    public BookLibrary(){
        this.books = new ArrayList<LBook>();
        this.capacity = 5;
    }

    public int getBookCount() {
        return books.size();
    }

    public void addBookToLibrary(LBook book){
        if(this.getBookCount() < this.capacity){
            this.books.add(book);
        }
    }


    public int getNumberOfBooksByGenre(String genre) {
        for(int i=0; i<this.getBookCount(); i++){
          //  booksByGenre.put(this.books[i].genre, 1 );
        }
        return 0;
        //booksByGenre
    }
}
