package Entites;

import Abstract.Entity;

public class Game implements Entity {
	private int id;
	private String name;
	private double unitPrice;
	private String company;
	
	public Game() {
		
	}

	public Game(int id, String name, double unitPrice, String company) {
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.company = company;
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

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	
}
