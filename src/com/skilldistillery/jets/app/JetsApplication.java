package com.skilldistillery.jets.app;

import java.util.Scanner;

public class JetsApplication {

	private AirField airField= new AirField();
	private static Scanner sc;
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Welcome to George's Air Field!");
		JetsApplication app = new JetsApplication();
		app.launch();
	}
	
	private void launch() {
		//TODO Loop;
		displayUserMenu();
		//Displayusermenu()
		//get choice from scanner
		System.out.println("Enter a number to Load Commands: ");
		int choice = sc.nextInt();
		// act on choice
		
		switch (choice) {
		
		case 1: 
			airField.listFleet();
			displayUserMenu();
			break;
			
		case 2:
			airField.flyJets();
			break;
			
		case 3:
			airField.viewFastest();
			break;
			
		case 4:
			airField.viewLongestRange();
			break;
			
		case 5:
			airField.loadCargo();
			break;
			
		case 6:
			airField.dogFight();
			break;
			
		case 7:
			
			break;
			
		case 8:
			airField.listFleet();
			System.out.println("Choose a jet to remove");
			int selection = sc.nextInt();
			airField.removeJet();
			break;
			
		case 9:
			System.out.println("Command List Closed.\nGoodbye");
			break;	
			
			
			
			
		}
	}
	
	private void displayUserMenu() {
		System.out.println();
		System.out.println("+=============== COMMANDS ============+");
		System.out.println("|                                     |");
		System.out.println("| 1. List fleet                       |");
		System.out.println("| 2. Fly all Jets                     |");
		System.out.println("| 3. View Fastest Jet                 |");
		System.out.println("| 4. View jet with longest range      |");
		System.out.println("| 5. Load all Cargo Jets              |");
		System.out.println("| 6. DOGFIGHT!                        |");
		System.out.println("| 7. Add a Jet to Fleet               |");
		System.out.println("| 8. Remove a Jet from fleet          |");
		System.out.println("| 9. Exit                             |");
		System.out.println("|                                     |");
		System.out.println("+=====================================+");
		System.out.println();
		
	}
		
	
	
}
