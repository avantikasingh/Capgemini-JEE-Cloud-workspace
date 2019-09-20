package com.cg.demojpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.transaction.Transaction;

import com.cg.demojpa.dto.Employee;
import com.cg.demojpa.dto.Project;

public class EmployeeDaoImpl implements EmployeeDao {

	EntityManagerFactory entityFactory = Persistence.createEntityManagerFactory("jpaDemo");

	@Override
	public Employee save(Employee emp) {
		// TODO Auto-generated method stub
		
		EntityManager em = entityFactory.createEntityManager();
		EntityTransaction tran = em.getTransaction();
		tran.begin();
		//em.persist(emp.getProj());
		em.persist(emp);
		// em.flush();
		tran.commit();

		return null;
	}

	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		EntityManager em=entityFactory.createEntityManager();
		Query query=em.createQuery("FROM Employee");
		List<Employee> empList=query.getResultList();
		return empList;
	}

	@Override
	public void remove(Integer empId) {
		// TODO Auto-generated method stub
		EntityManager em = entityFactory.createEntityManager();
		Employee empRemove = em.find(Employee.class, empId);
		if (empRemove != null) {
			EntityTransaction tran = em.getTransaction();
			tran.begin();
			em.remove(empRemove);
			tran.commit();
		}
	}

}
