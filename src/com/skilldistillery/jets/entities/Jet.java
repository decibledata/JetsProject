package com.skilldistillery.jets.entities;

public abstract class Jet {
	private String model;
	private int speed;
	private int range;
	private double price;
	
	public Jet() {}
	
	public Jet(String model, int speed, int range, double price) {
		super();
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
	
	}
	public void fly() {
		//override in each subclass
		System.out.println(this.model + " flying"); //FixMe
	}
	
	public double getSpeedInMach( ) {
		//TODO loop up how to convert MPH into Mach.
		//no need to override
		return 0.0;
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
		return "Jets [model=" + model + ", speed=" + speed + ", range=" + range + ", price=" + price + "]";
	}

		
}
