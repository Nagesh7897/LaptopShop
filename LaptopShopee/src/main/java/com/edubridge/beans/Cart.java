package com.edubridge.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table
public class Cart {

private static final String CART = "cart";
	
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column
private int cartId;

@Column
private int productId;

@Column
private String emailId;

@Column
private int quantity;

public Cart(int cartId, int productId, String emailId) {
	this.cartId = cartId;
	this.productId = productId;
	this.emailId = emailId;
}

public Cart() {
}


public Cart(int cartId, int productId, String emailId, int quantity) {
	this.cartId = cartId;
	this.productId = productId;
	this.emailId = emailId;
	this.quantity = quantity;
}

public int getQuantity() {
	return quantity;
}

public void setQuantity(int quantity) {
	this.quantity = quantity;
}

public int getCartId() {
	return cartId;
}

public void setCartId(int cartId) {
	this.cartId = cartId;
}

public int getProductId() {
	return productId;
}

public void setProductId(int productId) {
	this.productId = productId;
}

public String getEmailId() {
	return emailId;
}

public void setEmailId(String emailId) {
	this.emailId = emailId;
}

public Cart(int productId, String emailId) {
	this.productId = productId;
	this.emailId = emailId;
}
}
