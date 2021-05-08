package Concrete;

import Abstract.OrderService;
import Entites.Order;

public class OrderManager implements OrderService {

	@Override
	public void purchase(Order order) {
		System.out.println("Yeni sipariþ eklendi. Sipariþ Id : " + order.getId() + " Sipariþ Toplamý : " + order.getTotalPrice() + 
				" Üye Kullanýcý Adý : " + order.getMember().getUsername() +" Oyun Adý: " + order.getGame().getName());
		
	}

	@Override
	public void updateOrder(Order order) {
		System.out.println("Mevcut sipariþ bilgileri güncellendi. Sipariþ Id : " + order.getId());
		
	}

	@Override
	public void deleteOrder(Order order) {
		System.out.println("Bir sipariþ sistemden silindi. Sipariþ Id: " + order.getId());
		
	}

}
