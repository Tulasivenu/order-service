package service;

import java.util.List;

import model.Order;

public interface OrderService {
	public Order placeOrder(Order order);
	public List<Order>getAllOrders();
	public Order findOrder(Long orderId);
}
