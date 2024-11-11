package com.skilldistillery.jets.entities;

public class CargoJet extends Jet implements CargoCarrier {

	public CargoJet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CargoJet(String type, String model, int speed, int range, double price) {
		super(type, model, speed, range, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void loadCargo() {
		// TODO Auto-generated method stub
		System.out.println("Loading cargo: " + this.getModel());
		
	}

}
