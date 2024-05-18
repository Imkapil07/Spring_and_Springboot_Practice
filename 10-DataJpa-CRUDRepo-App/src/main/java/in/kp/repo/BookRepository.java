package in.kp.repo;

import org.springframework.data.repository.CrudRepository;

import in.kp.entity.Book;

public interface BookRepository extends CrudRepository<Book, Integer> {

	
	
}
