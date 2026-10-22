package Proxy;

import java.util.List;

public class PageWriter {
    public BookWriter book;

    public PageWriter() {
        book = new BookProxy(new Book());
    }

    public String getPages(List<Integer> pageNumbers){
        String result = "";
        for(var number : pageNumbers){
            result += book.getPage(number) + "\n";
        }
        return result;
    }
}
