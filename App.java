package springbook;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
   ;

	public static void main( String[] args )
    {
 ApplicationContext  context=new AnnotationConfigApplicationContext(AppConfig.class);
 BookDao bookDao=context.getBean(BookDao.class);
 Book book =new Book();
 book.setTitle("the great history");
 book.setAuthor("aryanshetty");
 book.setGenre("libro");
 book.setBorrowed(false);
bookDao.create(book);
 Book retriveBook =bookDao.findById(1L); 
 System.out.println("retrived book " +retriveBook);
 retriveBook.setBorrowed(true);
 bookDao.delete(retriveBook);
 Book deletedBook =bookDao.findById(1L); 
 System.out.println("deleted book " +deletedBook);


    }
}
