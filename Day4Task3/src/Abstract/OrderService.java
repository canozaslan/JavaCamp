package Abstract;

import Entites.Order;

public interface OrderService {
	
	void purchase(Order order);
	void updateOrder(Order order);
	void deleteOrder(Order order);
	
}
