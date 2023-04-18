package springbook;


public interface BookDao {
public Book create(Book book);
public Book findById(Long id);
public Book update(Book book);
public void delete(Book book);
}
