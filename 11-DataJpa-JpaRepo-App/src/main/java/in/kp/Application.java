package in.kp;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import in.kp.entity.Employee;
import in.kp.repo.EmployeeRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext cnxt = SpringApplication.run(Application.class, args); 
		
		  EmployeeRepository  repo =   cnxt.getBean(EmployeeRepository.class);
	
	
//		    Employee e1 = new Employee(2, "Orlen", 5000.00, "Male", "Sales");
//			Employee e2 = new Employee(3, "Charles", 15000.00, "Male", "Admin");
//			Employee e3 = new Employee(4, "Smith", 25000.00, "Male", "Marketing");
//			Employee e4 = new Employee(5, "Cathy", 35000.00, "Fe-Male", "Account");
//			Employee e5 = new Employee(6, "Robert", 45000.00, "Male", "HR");
//			Employee e6 = new Employee(7, "David", 55000.00, "Male", "Manager");
//			
//			repo.saveAll(Arrays.asList(e1, e2, e3, e4, e5, e6));
//			
//			System.out.println("record saved...");  
		  
//		  Sort asc = Sort.by("empName").ascending();
//		  List<Employee> emps = repo.findAll(asc); 
//		  for(Employee emp : emps) {
//			  System.out.println(emp);
//		  }
		  
		    int pageNo = 1;
			PageRequest page = PageRequest.of(pageNo-1, 3);
			Page<Employee> findAll = repo.findAll(page);
			List<Employee> emps = findAll.getContent();
			emps.forEach(System.out::println);
		  
		  
	}

}
