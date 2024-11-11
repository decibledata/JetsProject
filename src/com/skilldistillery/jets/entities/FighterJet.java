package com.skilldistillery.jets.entities;

import java.util.Scanner;

public class FighterJet extends Jet{

	public FighterJet(String type, String model, int speed, int range, double price) {
		super(type, model, speed, range, price);
		// TODO Auto-generated constructor stub
	}

	public FighterJet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void fight() {
		Scanner sc = new Scanner(System.in);
		System.out.println("[MISSLES ARMED]\n");
		System.out.println("[TARGET LOCKED]\n");
		System.out.println("[[LAUNCH]]\n ['F']");
		sc.nextLine();
		System.out.println("TARGET DESTROYED");
		return;
	}
}

