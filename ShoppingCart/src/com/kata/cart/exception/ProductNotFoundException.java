package com.kata.cart.exception;

public class ProductNotFoundException extends Exception {
	public ProductNotFoundException(){}
	public ProductNotFoundException(String msg){
		super(msg);
	}
}