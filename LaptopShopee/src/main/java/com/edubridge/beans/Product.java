package com.edubridge.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "products")
public class Product  {

	private static final String PRODUCT = "product";

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int productId;
	
	@Column
	private String productBrand;
	
	@Column
	private String productName;
	
	@Column
	private String productDesc;
	
	@Column
	private String productScreenSize;
	
	@Column
	private String productColour;
	
	@Column
	private String productWarranty;
	
	@Column
	private String productAccessories;
	
	@Column
	private double productPrice;

	@Column
	private int productImageId;
	// Constructors
	


	public Product() {
	}


	public Product(int productId, String productBrand, String productName, String productDesc,
			String productScreenSize, String productColour, String productWarranty, String productAccessories,
			double productPrice, int productImageId) {
		this.productId = productId;
		this.productBrand = productBrand;
		this.productName = productName;
		this.productDesc = productDesc;
		this.productScreenSize = productScreenSize;
		this.productColour = productColour;
		this.productWarranty = productWarranty;
		this.productAccessories = productAccessories;
		this.productPrice = productPrice;
		this.productImageId = productImageId;
	}


	public String getProductBrand() {
		return productBrand;
	}

	public void setProductBrand(String productBrand) {
		this.productBrand = productBrand;
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

	public String getProductDesc() {
		return productDesc;
	}

	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}

	public String getProductScreenSize() {
		return productScreenSize;
	}

	public void setProductScreenSize(String productScreenSize) {
		this.productScreenSize = productScreenSize;
	}

	public String getProductColour() {
		return productColour;
	}

	public void setProductColour(String productColour) {
		this.productColour = productColour;
	}

	public String getProductWarranty() {
		return productWarranty;
	}

	public void setProductWarranty(String productWarranty) {
		this.productWarranty = productWarranty;
	}

	public String getProductAccessories() {
		return productAccessories;
	}

	public void setProductAccessories(String productAccessories) {
		this.productAccessories = productAccessories;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public int getProductImageId() {
		return productImageId;
	}

	public void setProductImageId(int productImageId) {
		this.productImageId = productImageId;
	}

}
