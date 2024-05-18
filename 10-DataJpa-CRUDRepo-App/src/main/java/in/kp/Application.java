package in.kp;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.kp.entity.Book;
import in.kp.repo.BookRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt = SpringApplication.run(Application.class, args);  
		
		BookRepository repo = ctxt.getBean(BookRepository.class);
//		
//		Book  b = new Book();
//		b.setBookId(102);
//		b.setBookName("Springboot");
//		b.setBookPrice(1600.00);
//		
//		repo.save(b);
//		System.out.println("Recorded inserted.......... ");
		
//		Optional<Book> id = repo.findById(101);
//		System.out.println(id.get()); 
		
		Iterable<Book> findAll = repo.findAll(); 
		for(Book b : findAll) {
			System.out.println(b);
		}
	}

}
