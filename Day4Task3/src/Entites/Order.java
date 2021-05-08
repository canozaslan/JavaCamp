package Entites;

import Abstract.Entity;

public class Order implements Entity {
	private int id;
	private Member member;
	private Game game;
	private Campaign campaign;
	private int quantity;
	private double totalPrice;
	
	public Order() {
		
	}

	public Order(int id, Member member, Game game, Campaign campaign, int quantity) {
		this.id = id;
		this.member = member;
		this.game = game;
		this.campaign = campaign;
		this.quantity = quantity;
		this.totalPrice = (game.getUnitPrice() - (game.getUnitPrice()*campaign.getDiscountRate())) * quantity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}

	public Campaign getCampaign() {
		return campaign;
	}

	public void setCampaign(Campaign campaign) {
		this.campaign = campaign;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getTotalPrice() {
		return totalPrice;
	}
	
}
