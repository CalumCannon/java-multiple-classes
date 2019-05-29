import java.util.ArrayList;
import java.util.HashMap;

public class BookLibrary {

    ArrayList<LBook> books;
    int capacity;
    HashMap<String, Integer> booksByGenre;

    public BookLibrary(){
        this.books = new ArrayList<LBook>();
        this.capacity = 5;
        this.booksByGenre = new HashMap<String, Integer>();
    }

    public int getBookCount() {
        return books.size();
    }

    public void addBookToLibrary(LBook book){
        if(this.getBookCount() < this.capacity){
            this.books.add(book);
            this.addToGenreHashMap(book);
        }
    }

    private void addToGenreHashMap(LBook book){
        if(booksByGenre.containsKey(book.genre)){
            int value = booksByGenre.get(book.genre);
            booksByGenre.put(book.genre, value+=1 );
        }else{
            booksByGenre.put(book.genre, 1 );
        }
    }


    public int getNumberOfBooksByGenre(String genre) {
      return this.booksByGenre.get(genre);
    }
}
