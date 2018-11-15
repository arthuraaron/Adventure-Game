package aaronarthur.TextBasedAdventure;

import java.util.Scanner;

public class TestingMethods {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Menu(input);
	}
	
	public static void Menu(Scanner input) {
		while (true) {
		System.out.println("1234");
		System.out.print("Choose: ");
		int choice = input.nextInt();
		if (choice == 1) {
			choice1(input);
			break;
		}
		else if (choice == 2) {
			choice2(input);
			break;
		}
		else if (choice == 3) {
			choice3(input);
			break;
		}
		else if (choice == 4) {
			choice4(input);
			break;
		}
		else {
			System.out.println("Try again.");
		}
		
		}
		
	}
	
	public static void choice1(Scanner input) {
		while (true) {
			System.out.println("1234");
			System.out.print("Choose: ");
			int choice = input.nextInt();
			if (choice == 1) {
				choice2(input);
				break;
			}
			else if (choice == 2) {
				choice4(input);
				break;
			}
			else if (choice == 3) {
				choice1(input);
				break;
			}
			else if (choice == 4) {
				choice3(input);
				break;
			}
			else {
				System.out.println("Try again.");
			}
			
			}
			
	}
	
	public static void choice2(Scanner input) {
		while (true) {
			System.out.println("1234");
			System.out.print("Choose: ");
			int choice = input.nextInt();
			if (choice == 1) {
				choice1(input);
				break;
			}
			else if (choice == 2) {
				choice2(input);
				break;
			}
			else if (choice == 3) {
				choice3(input);
				break;
			}
			else if (choice == 4) {
				choice(input);
				break;
			}
			else {
				System.out.println("Try again.");
			}
			
			}
			
	}
	
	public static void choice3(Scanner input) {
		while (true) {
			System.out.println("1234");
			System.out.print("Choose: ");
			int choice = input.nextInt();
			if (choice == 1) {
				choice1(input);
				break;
			}
			else if (choice == 2) {
				choice2(input);
				break;
			}
			else if (choice == 3) {
				choice3(input);
				break;
			}
			else if (choice == 4) {
				choice4(input);
				break;
			}
			else {
				System.out.println("Try again.");
			}
			
			}
			
	}
	
	public static void choice4(Scanner input) {
		while (true) {
			System.out.println("1234");
			System.out.print("Choose: ");
			int choice = input.nextInt();
			if (choice == 1) {
				choice1(input);
				break;
			}
			else if (choice == 2) {
				choice2(input);
				break;
			}
			else if (choice == 3) {
				choice3(input);
				break;
			}
			else if (choice == 4) {
				choice4(input);
				break;
			}
			else {
				System.out.println("Try again.");
			}
			
			}
			
	}

}
