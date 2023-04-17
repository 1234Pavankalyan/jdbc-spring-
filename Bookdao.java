package helloworld;


import java.util.List;

public interface Bookdao {
  List<Book> getAllBooks();
    void saveBook(Book book);
}