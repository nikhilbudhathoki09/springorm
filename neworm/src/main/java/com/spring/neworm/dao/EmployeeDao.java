package com.spring.neworm.dao;

import java.io.Serializable;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.neworm.entities.Employee;

public class EmployeeDao {

	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	
//	@Transactional
//	public int insert(Employee employee) {
//		
//		Integer inserted = (Integer)this.hibernateTemplate.save(employee);
//		
//		return inserted;
//	}

	@Transactional
	public String insert(Employee employee) {
	    String inserted =(String) this.hibernateTemplate.save(employee);
	    // Since the primary key is of type String, we can safely cast to String.
	    
	    return inserted;
	}

}
