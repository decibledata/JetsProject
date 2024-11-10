package com.skilldistillery.jets.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

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
				// Convert line into array
				String[] jetsData = line.split(", ");
				// manipulate data as needed from that array
				String jetModel = jetsData[0];
				int jetSpeed = Integer.parseInt(jetsData[1]);
				int jetRange = Integer.parseInt(jetsData[2]);
				double jetPrice = Double.parseDouble(jetsData[3]);
				// construct object
				Jet jet;
				jet = (jetsData[4].equals("Cargo")) ? new CargoJet(jetModel, jetSpeed, jetRange, jetPrice)
						: (jetsData[4].equals("Fighter")) ? new FighterJet(jetModel, jetSpeed, jetRange, jetPrice)
								: (jetsData[4].equals("Passenger"))
										? new PassengerJet(jetModel, jetSpeed, jetRange, jetPrice)
										: null;
				fleet.add(jet);
			}
		} catch (Exception e) {
			System.err.println(e);
			// TODO: handle exception
		}
	}

	public void listFleet() {
		for (Jet jet : fleet) {
			System.out.println(jet);
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
			if((int) jet.getRange() > longestRange ) {
				longestRange = jet.getRange();
				
			}
	}
	
	}
	
	public void loadCargo {
		
	}
	
	
	public void removeJet() {

	}
}