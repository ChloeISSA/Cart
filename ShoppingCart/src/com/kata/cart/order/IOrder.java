package com.kata.cart.order;

import java.util.Collection;

import com.kata.cart.bean.Product;
import com.kata.cart.exception.ProductNotFoundException;

public interface IOrder {
	boolean addProduct(Product p);
	boolean removeProduct(String pid) throws ProductNotFoundException;
	Collection<Product> getCartDetails();
	Product getProductFromCart(String pid) throws ProductNotFoundException;
	int productCount();
  double getCartPrice();
}