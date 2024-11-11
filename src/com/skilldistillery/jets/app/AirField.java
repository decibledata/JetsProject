package com.skilldistillery.jets.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

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

				String jetModel = jetsData[0];
				String jetType = jetsData[1];
				int jetSpeed = Integer.parseInt(jetsData[2]);
				int jetRange = Integer.parseInt(jetsData[3]);
				double jetPrice = Double.parseDouble(jetsData[4]);

				if (jetsData[0].equals("Cargo")) {
					Jet jet = new CargoJet(jetType, jetSpeed, jetRange, jetPrice);
				fleet.add(jet);
				}
				else if (jetsData[0].equals("Fighter")) { 
					Jet jet = new FighterJet(jetType, jetSpeed, jetRange, jetPrice); 
				fleet.add(jet);	
				}		
				else if (jetsData[0].equals("Passenger")) { 
					Jet jet = new PassengerJet(jetType, jetSpeed, jetRange, jetPrice);
				fleet.add(jet);
		
			}
		}
		}catch(

	Exception e)
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

	public void viewFastest() {
		Jet viewFastest = fleet.get(0);
		for (Jet jet : fleet) {
			if (jet.getSpeed() > viewFastest.getSpeed()) {
				viewFastest = jet;

			}
		}

	}

	public void viewLongestRange() {
		int longestRange = 0;
		for (Jet jet : fleet) {
			if ((int) jet.getRange() > longestRange) {
				longestRange = jet.getRange();

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

	}

	public void addJets() {

	}

	public void removeJet() {
		fleet.remove(0);

	}

}