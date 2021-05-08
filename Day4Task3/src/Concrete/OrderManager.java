package Concrete;

import Abstract.OrderService;
import Entites.Order;

public class OrderManager implements OrderService {

	@Override
	public void purchase(Order order) {
		System.out.println("Yeni sipari� eklendi. Sipari� Id : " + order.getId() + " Sipari� Toplam� : " + order.getTotalPrice() + 
				" �ye Kullan�c� Ad� : " + order.getMember().getUsername() +" Oyun Ad�: " + order.getGame().getName());
		
	}

	@Override
	public void updateOrder(Order order) {
		System.out.println("Mevcut sipari� bilgileri g�ncellendi. Sipari� Id : " + order.getId());
		
	}

	@Override
	public void deleteOrder(Order order) {
		System.out.println("Bir sipari� sistemden silindi. Sipari� Id: " + order.getId());
		
	}

}
