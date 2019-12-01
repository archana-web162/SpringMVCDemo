package com.example.demo.model;

import java.util.Date;

public class Product {
	private Integer id;
	private String productName;
	private Double productPrice;
	private String barcode;
	private Date expDate;

	public Product(Integer id, String productName, Double productPrice, String barcode, Date expDate) {
		super();
		this.id = id;
		this.productName = productName;
		this.productPrice = productPrice;
		this.barcode = barcode;
		this.expDate = expDate;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public Date getExpDate() {
		return expDate;
	}

	public void setExpDate(Date expDate) {
		this.expDate = expDate;
	}

}
