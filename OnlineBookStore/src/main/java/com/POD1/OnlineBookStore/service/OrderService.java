package com.POD1.OnlineBookStore.service;

/**
 * 
 */

import java.util.List;

import com.POD1.OnlineBookStore.entity.Order;

public interface OrderService {

	List<Order> getOrderList(String token);

	Order getOrderConfrim(String token);

	int getCountOfBooks(String token);
}
