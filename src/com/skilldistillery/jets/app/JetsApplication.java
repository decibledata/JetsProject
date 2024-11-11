package com.skilldistillery.jets.app;

import java.util.Scanner;

public class JetsApplication {

	private AirField airField= new AirField();
	private static Scanner sc;
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Welcome to George's Air Field!");
		System.out.println("         _\n"
				+ "         -=\\`\\\n"
				+ "     |\\ ____\\_\\__\n"
				+ "   -=\\c`\"\"\"\"\"\"\" \"`)>---\n"
				+ "      `~~~~~/ /~~`\n"
				+ "        -==/ /\n"
				+ "          '-'");
		System.out.println("CHOOSE TO BEGIN");
		JetsApplication app = new JetsApplication();
		app.launch();
	}
	
	private void launch() {
		//TODO Loop;
		boolean keepGoing = true; 
		
		
		while(keepGoing) {
		displayUserMenu();
		System.out.println("\n[Enter a number to Load Commands] \n");
		int choice = sc.nextInt();
		System.out.println();
		
		switch (choice) {
		
		case 1: 
			airField.listFleet();
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
			airField.combatReady();
			break;
			
		case 7:
			airField.addJets();
			break;
			
		case 8:
			airField.removeJet();
			break;
			
		case 9:
			System.out.println("Command List Closed.\nGoodbye");
			keepGoing = false;
			break;	
			
			
		}
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
