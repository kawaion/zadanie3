package Proxy;

import java.util.HashMap;
import java.util.Map;

public class BookProxy implements BookWriter{
    private Book book;
    private Map<Integer, String> pageHash = new HashMap<>();

    public BookProxy(Book book) {
        this.book = book;
    }

    @Override
    public String getPage(int i) {
        if(pageHash.containsKey(i)) {
            return "из кеша: " + pageHash.get(i);
        }
        else{
            var result = book.getPage(i);
            pageHash.put(i, result);
            return result;
        }
    }
}
