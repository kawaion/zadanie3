package Proxy;

import java.util.List;

public class PageWriter {
    public BookWriter book;

    public PageWriter() {
        book = new BookProxy(new Book());
    }

    public String getPages(List<Integer> pageNumbers) {
        StringBuilder result = new StringBuilder();
        for (var number : pageNumbers) {
            result.append(book.getPage(number)).append("\n");
        }
        return result.toString();
    }
}
