package com.springjdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.springjdbc.beans.Student;
import com.springjdbc.mapper.StudentRowMapper;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new AnnotationConfigApplicationContext(config.class);
    	
    	 JdbcTemplate jd = context.getBean(JdbcTemplate.class);  
    	 
    	 //------------------ Insert Query --------------
    	 
//    	 String q = "insert into student(id,name,address) values(?,?,?)"; 
//    	 
//    	 int i = jd.update(q, 3,"Sachin","Raghogarh"); 
    	 
    	 // -------------------- Delete Query -----------
    	 
//    	 String q = "delete from student where id = ?"; 
//    	 jd.update(q,3); 
    	 
//    	 String q = "update student set address = ?  where id = ?"; 
//    	 jd.update(q,"Sagar",2);
    	 
    	 // Select query 
    	 
//    	 String q = "select * from Student"; 
//    	 List<Student> list = jd.query(q,new StudentRowMapper());
//    	 for(Student s : list) {
//           System.out.println("Id : " + s.getId());
//           System.out.println("Name : " + s.getName());
//           System.out.println("Address : " + s.getAddres());
//           System.out.println("-----------------------------------------------");
//    	 }
    	 
    	 String q = "select * from Student where id = ? "; 
    	 List<Student> list = jd.query(q,new StudentRowMapper(), 1);
    	 for(Student s : list) {
           System.out.println("Id : " + s.getId());
           System.out.println("Name : " + s.getName());
           System.out.println("Address : " + s.getAddres());
           System.out.println("-----------------------------------------------");
    	 }
    	 
    	 
    	 
    }
}
