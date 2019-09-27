package com.cg.springmvcdemo.dao;

import java.util.List;

import com.cg.springmvcdemo.dto.Product;

public interface ProductDao {

	public Product save(Product product);

	public List<Product> findAll();

	public Product findByProductId(int productId);
	public void remove(int proIid);
}
