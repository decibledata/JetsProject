package com.skilldistillery.jets.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.skilldistillery.jets.entities.CargoCarrier;
import com.skilldistillery.jets.entities.CargoJet;
import com.skilldistillery.jets.entities.FighterJet;
import com.skilldistillery.jets.entities.Jet;
import com.skilldistillery.jets.entities.PassengerJet;

public class AirField {

	private List<Jet> fleet = new ArrayList<>();

	public AirField() {
		loadJetsFromFile("jets.txt");
	}

	private void loadJetsFromFile(String fileName) {
		try (BufferedReader bufIn = new BufferedReader(new FileReader(fileName))) {
			String line;
			while ((line = bufIn.readLine()) != null) {

				String[] jetsData = line.split(":");

				String jetType = jetsData[0];
				String jetModel = jetsData[1];
				int jetSpeed = Integer.parseInt(jetsData[2]);
				int jetRange = Integer.parseInt(jetsData[3]);
				double jetPrice = Double.parseDouble(jetsData[4]);

				if (jetsData[0].equals("Cargo")) {
					Jet jet = new CargoJet(jetType, jetModel, jetSpeed, jetRange, jetPrice);
				fleet.add(jet);
				}
				else if (jetsData[0].equals("Fighter")) { 
					Jet jet = new FighterJet(jetType, jetModel, jetSpeed, jetRange, jetPrice); 
				fleet.add(jet);	
				}		
				else if (jetsData[0].equals("Passenger")) { 
					Jet jet = new PassengerJet(jetType, jetModel, jetSpeed, jetRange, jetPrice);
				fleet.add(jet);
		
			}
		}
		}catch(Exception e)
	{
		System.err.println(e);
		// TODO: handle exception
	}
	}

	public void listFleet() {
		for (int i = 0; i < fleet.size(); i++) {

			System.out.println(fleet.get(i));

		}

	}

	public void flyJets() {
		for (int i = 0; i < fleet.size(); i++) {
			fleet.get(i).fly();
		}

	}

	public Jet viewFastest() {
		Jet fastest = fleet.get(0);
		System.out.println("Fastest Jet: " + fastest);
		for (Jet jet : fleet) {
			if (jet.getSpeed() > fastest.getSpeed()) {
				fastest = jet;

			}
		}
		return fastest;
	}

	public void viewLongestRange() {
		int longestRange = 0;
		for (int i = 0; i < fleet.size(); i++) {
			int distance = fleet.get(i).getRange();
			if (distance > longestRange) {
				longestRange = distance;
				System.out.println();

			}
		}

	}

	public void loadCargo() {
		for (Jet jet : fleet) {
			if (jet instanceof CargoCarrier) {
				((CargoCarrier) jet).loadCargo();
			}
		}
	}

	public void combatReady() {
		for(Jet jet : fleet) {
			if(jet instanceof FighterJet) {
				System.out.println(jet);
				((FighterJet) jet).fight();
				
			}
		}
	}
	
	public void addJets() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("[TYPE JET TYPE]");
		String jetType = sc.nextLine();
		
		System.out.println("[TYPE JET MODEL]");
		String jetModel = sc.nextLine();
		
		System.out.println("[ENTER MAX SPEED]");
		int jetSpeed = sc.nextInt();
		
		System.out.println("[ENTER FUEL RANGE]");
		int jetRange = sc.nextInt();
		
		System.out.println("[ENTER PRICE]");
		double jetPrice = sc.nextDouble();
		
		Jet jet = switch(jetType) {
		case "Cargo"-> new CargoJet(jetType, jetModel, jetSpeed, jetRange, jetPrice);
		case "Fighter" -> new FighterJet(jetType, jetModel, jetSpeed, jetRange, jetPrice);
		case "Passenger"-> new PassengerJet(jetType, jetModel, jetSpeed, jetRange, jetPrice);
		default -> null;
		};
		
		if(jet != null) {
			fleet.add(jet);
			System.out.println("[NEW JET HAS BEEN ADDED TO THE FLEET]");
		}
		else {
			System.out.println("INVALID JET TYPE");
		}
	}

	
	public void removeJet() {
		Scanner sc = new Scanner(System.in);
		System.out.println("[CHOOSE A JET TO REMOVE FROM THE AIRFIELD]\n");
		int choice = 1;
		for (Jet jet : fleet) {
			System.out.println(choice + ": " + jet);
			choice++;
		}
		int selection = sc.nextInt();
		System.out.println("JET " + selection + " REMOVED");
		fleet.remove(selection - 1);

	}

		
	}

	