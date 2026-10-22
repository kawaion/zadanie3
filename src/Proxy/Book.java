package Proxy;

import java.util.ArrayList;
import java.util.List;

public class Book implements BookWriter{
    private List<String> pages = new ArrayList<String>();

    public Book() {
        pages.add("предисловие");
        pages.add("страница 1");
        pages.add("страница 2");
        pages.add("страница 3");
        pages.add("страница 4");
        pages.add("страница 5");
        pages.add("страница 6");
        pages.add("страница 7");
        pages.add("страница 8");
        pages.add("страница 9");
        pages.add("страница 10");
    }

    public String getPage(int i){
        return pages.get(i);
    }
}
