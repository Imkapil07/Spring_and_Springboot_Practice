package in.kp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.kp.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
