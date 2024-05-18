package in.kp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="emp_tbl") 
@Data 
@AllArgsConstructor 
@NoArgsConstructor
public class Employee {
   
	@Id
	private Integer empId;
	private String empName;
	private Double empSalary;
	private String empGender;
	private String dept; 
	
}
