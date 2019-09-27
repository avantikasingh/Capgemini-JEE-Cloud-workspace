package com.cg.springmvcdemo.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.cg.springmvcdemo.dto.Product;
@Repository("proddao")
public class ProductDaoImpl implements ProductDao{
	
	@PersistenceContext
	EntityManager manager;

	@Override
	public Product save(Product product) {
		// TODO Auto-generated method stub
		manager.persist(product);
		return product;
	}

	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		Query query=manager.createQuery("From Product");
		List<Product> myList=query.getResultList();
		return myList;
	}

	@Override
	public Product findByProductId(int productId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove(int proIid) {
		// TODO Auto-generated method stub
		
	}
	

	
		
	
}
