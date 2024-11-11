package com.skilldistillery.jets.entities;

public abstract class Jet {
	private String type;
	private String model;
	private int speed;
	private int range;
	private double price;

	public Jet() {
	}

	public Jet(String type, String model, int speed, int range, double price) {
		super();
		this.type = type;
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
//		int travelTime = range / speed;

	}

	public void fly() {
		System.out.println(this.model + " is flying " + speed + " MPH"); // FixMe
	}

	public double getSpeedInMach() {
		double speedOfSound = 0.00130332;
		return speed / speedOfSound;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		System.out.println(
				"|----------------------------------------------------------------------------------------------------|");
		return "|Jets:[TYPE| = " + type + " |MODEL| = " + model + " |SPEED| = " + speed + " |RANGE| = " + range
				+ " |PRICE| = " + "$" + price + "]";
	}

}
