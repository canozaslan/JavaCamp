package Entites;

import Abstract.Entity;

public class Campaign implements Entity {
	
	private int id;
	private String name;
	private Game[] games;
	private double discountRate;
	
	public Campaign() {
		
	}

	public Campaign(int id, String name, Game[] games, double discountRate) {
		super();
		this.id = id;
		this.name = name;
		this.games = games;
		this.discountRate = discountRate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Game[] getGame() {
		return games;
	}

	public void setGameName(Game[] games) {
		this.games = games;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

}
