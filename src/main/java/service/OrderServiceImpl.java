package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import model.Order;
import repository.OrderRepository;

public class OrderServiceImpl  implements OrderService{
	private OrderRepository orderRepository;
	
	@Autowired
	public void setOrderRepository(OrderRepository orderRepository) {
		this.orderRepository = orderRepository;
	}

	@Override
	public Order placeOrder(Order order) {
		// TODO Auto-generated method stub
		return (Order) orderRepository.save(order);
		//return null;
	}

	@Override
	public List<Order> getAllOrders() {
		// TODO Auto-generated method stub
		return orderRepository.findAll();
		//return null;
	}

	@Override
	public Order findOrder(Long orderId) {
		// TODO Auto-generated method stub
		return (Order) orderRepository.findById(orderId).get();
		//return null;
	}
	
	
}
