package com.cg.springmvcdemo.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.springmvcdemo.dao.ProductDao;
import com.cg.springmvcdemo.dto.Product;


@Service("prodservice")
@Transactional
public class ProductServiceImpl implements ProductService{


	@Autowired
	ProductDao proddao;
	public ProductServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Product addProduct(Product product) {
		// TODO Auto-generated method stub
		return proddao.save(product);
	}

	@Override
	public List<Product> showProducts() {
		// TODO Auto-generated method stub
		return proddao.findAll();
	}

	@Override
	public Product searchProduct(int productId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeData(int prodId) {
		// TODO Auto-generated method stub
		proddao.remove(prodId);
		
	}

}
