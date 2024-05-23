package in.kp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.kp.entity.Book;

public interface BookRepository extends JpaRepository<Book,Integer>{

}
