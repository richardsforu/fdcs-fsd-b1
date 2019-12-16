package com.cts.product.entity;

public class Product {

	private int productId;
	private String productName;
	private double price;

	private String[] stores;

	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(int productId, String productName, double price) {

		this.productId = productId;
		this.productName = productName;
		this.price = price;
	}

	public String[] getStores() {
		return stores;
	}

	public void setStores(String[] stores) {
		this.stores = stores;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
