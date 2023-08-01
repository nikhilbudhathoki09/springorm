package com.spring.neworm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.neworm.dao.EmployeeDao;
import com.spring.neworm.entities.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/neworm/configfile.xml");
        
        EmployeeDao employeeDao = context.getBean("employeeDao", EmployeeDao.class);
        
        Employee employee = new Employee();
        employee.setEmployee_id("8909");
        employee.setAddress("Udipur");
        employee.setEmployee_name("Asal Gurung muji");
        
        String inserted = employeeDao.insert(employee);
        System.out.println("The values are inserted properly" + inserted);
    }
}
