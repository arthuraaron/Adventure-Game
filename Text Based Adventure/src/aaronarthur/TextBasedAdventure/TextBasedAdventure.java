package aaronarthur.TextBasedAdventure;

/* Aaron Arthur
 * 11/18 
 * Text Based Adventure game
 */

import java.util.Scanner;

public class TextBasedAdventure {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Initialize Variables
		
		// Traits
		int health = 0;
		int attack = 0;
		int defense = 0;
		int dexterity = 0;
		int luck = 0;
		int magic = 0;
		
		// Race traits
		int raceHp = 0;
		int raceAtk = 0;
		int raceDef = 0;
		int raceDex = 0;
		int raceLuck = 0;
		int raceMgc = 0;
		
		// Class traits
		int classHp = 0;
		int classAtk = 0;
		int classDef = 0;
		int classDex = 0;
		int classLuck = 0;
		int classMgc = 0;
		
		// Modifiers
		int healthMod = 0;
		int attackMod = 0;
		int defenseMod = 0;
		int dexterityMod = 0;
		int luckMod = 0;
		int magicMod = 0;
		
		// Names
		String playerName = "null";
		String playerClass = "null";
		String playerRace = "null";
		
		// Action
		int action = 0;
		
		// Title Screen
		System.out.print("Welcome to an unnamed game!\n");
		System.out.println("                              /\\  //\\\\\r\n" + 
				"                       /\\    //\\\\///\\\\\\        /\\\r\n" + 
				"                      //\\\\  ///\\////\\\\\\\\  /\\  //\\\\\r\n" + 
				"         /\\          /  ^ \\/^ ^/^  ^  ^ \\/^ \\/  ^ \\\r\n" + 
				"        / ^\\    /\\  / ^   /  ^/ ^ ^ ^   ^\\ ^/  ^^  \\\r\n" + 
				"       /^   \\  / ^\\/ ^ ^   ^ / ^  ^    ^  \\/ ^   ^  \\       *\r\n" + 
				"      /  ^ ^ \\/^  ^\\ ^ ^ ^   ^  ^   ^   ____  ^   ^  \\     /|\\\r\n" + 
				"     / ^ ^  ^ \\ ^  _\\___________________|  |_____^ ^  \\   /||o\\\r\n" + 
				"    / ^^  ^ ^ ^\\  /______________________________\\ ^ ^ \\ /|o|||\\\r\n" + 
				"   /  ^  ^^ ^ ^  /________________________________\\  ^  /|||||o|\\\r\n" + 
				"  /^ ^  ^ ^^  ^    ||___|___||||||||||||___|__|||      /||o||||||\\       \r\n" + 
				" / ^   ^   ^    ^  ||___|___||||||||||||___|__|||          | |           \r\n" + 
				"/ ^ ^ ^  ^  ^  ^   ||||||||||||||||||||||||||||||oooooooooo| |ooooooo  \r\n" + 
				"ooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo\r\n");
		
		// Menu 
		int menu = 0;
		while (menu == 0) {
			
			MainMenu();
			int menuInput = input.nextInt();
		
		
		// Main game
		if (menuInput == 1) {
		
		// Choose name
		System.out.print("\nWhat is your name?: ");
		Scanner inputX = new Scanner(System.in);
		playerName = inputX.nextLine();
	
		
		// Select race
		int raceMenu = 0;

		
		while (raceMenu == 0)  {
		System.out.print("\nRaces: Dwarf, Elf, Human\nChoose a race: ");
		Scanner inputY = new Scanner(System.in);
		playerRace = inputY.nextLine();
		
		if (playerRace.equalsIgnoreCase("Dwarf")) {
			raceHp = 0;
			raceAtk = 0;
			raceDef = 0;
			raceDex = 0;
			raceLuck = 0;
			raceMgc = 0;
			raceMenu = 1;
		}
		else if (playerRace.equalsIgnoreCase("Elf")) {
			raceHp = 0;
			raceAtk = 0;
			raceDef = 0;
			raceDex = 0;
			raceLuck = 0;
			raceMgc = 0;
			raceMenu = 1;
		}
		else if (playerRace.equalsIgnoreCase("Human")) {
			raceHp = 0;
			raceAtk = 0;
			raceDef = 0;
			raceDex = 0;
			raceLuck = 0;
			raceMgc = 0;
			raceMenu = 1;
		}
		else {
			System.out.println("\nInvalid Input, try again.");	
		}
			
		}
		
		// Select class
		int classMenu = 0;
		while (classMenu == 0) {
		
		System.out.println("\nClasses: Knight, Wizard, Demon");	
		System.out.print("Choose a class: ");
		Scanner inputZ = new Scanner(System.in);
		playerClass = inputZ.nextLine();
		
		if (playerClass.equalsIgnoreCase("Knight")) {
			classHp = 0;
			classAtk = 0;
			classDef = 0;
			classDex = 0;
			classLuck = 0;
			classMgc = 0;
			classMenu = 1;
		}
		else if (playerClass.equalsIgnoreCase("Wizard")) {
			classHp = 0;
			classAtk = 0;
			classDef = 0;
			classDex = 0;
			classLuck = 0;
			classMgc = 0;
			classMenu = 1;
		}
		else if (playerClass.equalsIgnoreCase("Demon")) {
			classHp = 0;
			classAtk = 0;
			classDef = 0;
			classDex = 0;
			classLuck = 0;
			classMgc = 0;
			classMenu = 1;
		}
		else {
			System.out.println("Invalid Input, try again.");	
		}

		}
		
		
		
		
		// Create Character profile
		System.out.println("\nCharacter Profile: \nName: " + playerName + 
				"\nRace: " + playerRace + "\nClass: " + playerClass);
		
		// Add stats
		health = raceHp + classHp + healthMod;
		attack = raceAtk + classAtk + attackMod;
		defense = raceDef + classDef + defenseMod;
		dexterity = raceDex + classDex + dexterityMod;
		luck = raceLuck + classLuck + luckMod;
		magic = raceMgc + classMgc + magicMod;
		
		// Display stats
		System.out.println("\nStats: "
				+ "\nHealth: " + health
				+ "\nAttack: " + attack
				+ "\nDefense: " + defense
				+ "\nDexterity: " + dexterity
				+ "\nLuck: " + luck
				+ "\nMagic: " + magic);
		
		// Start story
		System.out.println("\nWe are ready to start our adventure. ");
		
		
		System.out.println("\nYou wake up on a path in a forest." 
				+ "\nIt is dim, but you can see a light coming from ahead in the path.");
		System.out.println("1: Follow the path\n2: Go into the forest");
		System.out.print("What do you do?: ");
		action = input.nextInt();
		
		if (action == 1) {
			Path1(input);
		}
		else if (action == 2) {
			Forest1(input);
		}
		else {
			System.out.println("Invalid input. Choosing choice 1. ");
			Path1(action, input);
		}
		
		
		if (action == 1) {
			
		}
		else if (action == 2) {
			
		}
		
		
		
		
			
			
		}
		// Options
		else if (menuInput == 2) {
			int optionMenu = 0;
			while (optionMenu == 0) {
			System.out.println("\nOptions: ");
			System.out.print("1: Change health of character"
					+ "\n2: Change attack of character" 
					+ "\n3: Change defense of character"
					+ "\n4: Change dexterity of character"
					+ "\n5: Change luck of character"
					+ "\n6: Change magic of character"
					+ "\n7: Return"
					+ "\nWhat do you choose?: ");
			int optionsInput = input.nextInt();
			
			if (optionsInput == 1) {
				System.out.print("Choose a health modifier: ");
				healthMod = input.nextInt();
			}
			else if (optionsInput == 2) {
				System.out.print("Choose an attack modifier: ");
				attackMod = input.nextInt();	
			}
			else if (optionsInput == 3) {
				System.out.print("Choose a defense modifier: ");
				defenseMod = input.nextInt();
			}
			else if (optionsInput == 4) {
				System.out.print("Choose a dexterity modifier: ");
				dexterityMod = input.nextInt();
			}
			else if (optionsInput == 5) {
				System.out.print("Choose a luck modifier: ");
				luckMod = input.nextInt();
			}
			else if (optionsInput == 6) {
				System.out.print("Choose a magic modifier: ");
				magicMod = input.nextInt();
			}
			else {
				optionMenu = 1;
			}
			
			}
			
		}
		// Credits
		else if (menuInput == 3) {
			System.out.println("\nCoding by: Aaron Arthur");
		}
		// Exit
		else if (menuInput == 4) {
			System.out.print("\nExiting Program. ");
			System.exit(0);
			
		}
		// Invalid input
		else {
			System.out.println("\nInvalid input. \nExiting Program");
			System.exit(0); 
		}
		
		
		}
		
	}
	
	public static void MainMenu() {
		System.out.print("\nMenu:\n1: Play game\n2: Options\n3: Credits\n4: Exit game\n"
				+ "What do you choose?: ");
	}
	
	public static void Forest1(Scanner input) {
		System.out.println("\nYou have entered the forest."
				+ "\nAfter trudging through the forest for a bit, you reach a clearing."
				+ "\nYou can see a trapdoor on the ground, and an opening on the other side of the clearing."
				+ "\n1: Enter the trapdoor."
				+ "\n2: Go to the opening in the clearing.");
		System.out.print("What do you do?: ");
		int action = input.nextInt();

		if (action == 1) {
			Cave1(input);
		}
		else if (action == 2) {
			Town1(input);
		}
		
	}
	
	 
	public static void Path1(Scanner input) {
		System.out.println("\nYou have followed the path. "
				+ "\nYou follow the path until you approach a fork."
				+ "\nTo the left you see a swamp, and the right a desert. "
				+ "\n1: Go left into the swamp. "
				+ "\n2: Go right into the desert. "
				+ "\n3: Kill yourself. ");
		System.out.print("What do you do?: ");
	}
	
	public static void Swamp1(Scanner input) {
		
	}
	
	public static void Desert1(Scanner input) {
		
	}
	
	public static void Cave1(Scanner input) {
		
	}
	
	public static void Town1(Scanner input) {
		
	}
	
	
	
	
}
