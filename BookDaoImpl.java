package springbook;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class BookDaoImpl implements BookDao{
	
@PersistenceContext
private EntityManager entityManager;

public Book create(Book book) {
	entityManager.persist(book);
	return book;
}

public Book findById(Long id) {
	return entityManager.find(Book.class, id);
}
public Book update(Book book) {
	return entityManager.merge(book);
}
public void delete(Book book) {
	entityManager.remove(entityManager.contains(book)?book:entityManager.merge(book));
}
}