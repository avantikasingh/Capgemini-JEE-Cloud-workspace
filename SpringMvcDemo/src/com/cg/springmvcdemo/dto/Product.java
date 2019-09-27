package com.cg.springmvcdemo.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product_db")
public class Product {
	@Id
	@Column(name="prod_id")
	private Integer productId;
	@Column(name="prod_name")
	private String productName;
	@Column(name="prod_price")
	private Double productPrice;
	@Column(name="prod_feature")
	private String features;
	@Column(name="prod_type")
	private String productType;
	@Column(name="prod_online")
	private String online;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
	

	


	public Product(Integer productId, String productName, Double productPrice, String features, String productType,
			String online) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.features = features;
		this.productType = productType;
		this.online = online;
	}



	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(Double productPrice) {
		this.productPrice = productPrice;
	}

	public String getFeatures() {
		return features;
	}

	public void setFeatures(String features) {
		this.features = features;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getOnline() {
		return online;
	}

	public void setOnline(String online) {
		this.online = online;
	}
	
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ ", features=" + features + ", productType=" + productType + ", online=" + online + "]";
	}

}
