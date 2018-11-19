package aaronarthur.TextBasedAdventure;
 
/* Aaron Arthur
 * 11/18
 * Text Based Adventure game
 * Edited in Git
 */
 
import java.util.Scanner;
 
public class TextBasedAdventure {
 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        // Initialize Variables
       
        // Traits
        int health = 0;
        int damage = 0;
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
       
        // Enemy variables
        String enemyName = "null";
        int enemyHp = 0;
        int enemyAtk = 0;
        int enemyDef = 0;
        int enemyDex = 0;
        int enemyLuck = 0;
        int enemyMgc = 0;
       
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
        damage = raceAtk + classAtk + attackMod;
        defense = raceDef + classDef + defenseMod;
        dexterity = raceDex + classDex + dexterityMod;
        luck = raceLuck + classLuck + luckMod;
        magic = raceMgc + classMgc + magicMod;
       
        // Display stats
        System.out.println("\nStats: "
                + "\nHealth: " + health
                + "\nAttack: " + damage
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
            Path1(input, health, damage, defense, dexterity, luck, magic, enemyHp, enemyAtk, enemyDef, enemyDex, enemyLuck, enemyMgc, enemyName);
        }
        else if (action == 2) {
            Forest1(input, health, damage, defense, dexterity, luck, magic, enemyHp, enemyAtk, enemyDef, enemyDex, enemyLuck, enemyMgc, enemyName);
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
   
    public static void Combat(Scanner input, int health, int damage, int defense,  int dexterity, int luck, int magic, int enemyHp, int enemyAtk, int enemyDef, int enemyDex, int enemyLuck, int enemyMgc, String enemyName) {
        // Local Combat variables
    	int tempHp = health;
    	
    	while (enemyHp > 0) {
    	
    	System.out.println("\n[1: ATTACK]\t[2: SPECIAL]\t[3: ITEM]\t[4: RETREAT]");
       
        System.out.print("Choice: ");
        int action = input.nextInt();
       
        if (action == 1) {
           
            if (dexterity >= enemyDex) {
                System.out.println("You get the first strike, attacking the " + enemyName + " dealing " + damage + " damage!");
                enemyHp -= damage;
                
                if (enemyHp > 0) {
                System.out.println("The " + enemyName + " strikes back, dealing " + enemyAtk + " damage!");
                tempHp -= enemyAtk;
                }
                
            }
            else {
                System.out.println("The " + enemyName + " strikes first, attacking you for " + enemyAtk + " damage!");
                tempHp -= enemyAtk;
                
                System.out.println("You strike back, dealing the " + damage + " damage!");
                enemyHp -= damage;
            }
           
           
        }
        else if (action == 2) {
           
        }
        else if (action == 3) {
           
        }
        else if (action == 4) {
           
        }
       
    	}
       
       
    }
   
    public static void Forest1(Scanner input, int health, int damage, int defense,  int dexterity, int luck, int magic, int enemyHp, int enemyAtk, int enemyDef, int enemyDex, int enemyLuck, int enemyMgc, String enemyName) {
        System.out.println("\nYou have entered the forest."
                + "\nAfter trudging through the forest for a bit, you reach a clearing."
                + "\nYou can see a trapdoor on the ground, and an opening on the other side of the clearing."
                + "\n1: Enter the trapdoor."
                + "\n2: Go to the opening in the clearing.");
        System.out.print("What do you do?: ");
        int action = input.nextInt();
 
        if (action == 1) {
            Cave1(input, health, damage, defense, dexterity, luck, magic, enemyHp, enemyAtk, enemyDef, enemyDex, enemyLuck, enemyMgc, enemyName);
        }
        else if (action == 2) {
            Town1(input, health, damage, defense, dexterity, luck, magic, enemyHp, enemyAtk, enemyDef, enemyDex, enemyLuck, enemyMgc, enemyName);
        }
       
    }
   
     
    public static void Path1(Scanner input, int health, int damage, int defense,  int dexterity, int luck, int magic, int enemyHp, int enemyAtk, int enemyDef, int enemyDex, int enemyLuck, int enemyMgc, String enemyName) {
        System.out.println("\nYou have followed the path. "
                + "\nYou follow the path until you approach a fork."
                + "\nTo the left you see a swamp, and the right a desert. "
                + "\n1: Go left into the swamp. "
                + "\n2: Go right into the desert. "
                + "\n3: Kill yourself. ");
        System.out.print("What do you do?: ");
        int action = input.nextInt();
       
        if (action == 1) {
            Swamp1(input, health, damage, defense, dexterity, luck, magic, enemyHp, enemyAtk, enemyDef, enemyDex, enemyLuck, enemyMgc, enemyName);
        }
        else if (action == 2) {
            Desert1(input, health, damage, defense, dexterity, luck, magic, enemyHp, enemyAtk, enemyDef, enemyDex, enemyLuck, enemyMgc, enemyName);
        }
        else if (action == 3) {
            System.out.println("\nYou kill yourself.. That wasnt a very good idea, was it?");
            System.exit(0);
        }
       
    }
   
    public static void Swamp1(Scanner input, int health, int damage, int defense,  int dexterity, int luck, int magic, int enemyHp, int enemyAtk, int enemyDef, int enemyDex, int enemyLuck, int enemyMgc, String enemyName) {
        System.out.println("\nYou follow the path into the swamp to find an ogre.");
       
       
        System.out.println("                           __,='`````'=/__\r\n" +
                "                          '//  (o) \\(o) \\ `'         _,-,\r\n" +
                "                          //|     ,_)   (`\\      ,-'`_,-\\\r\n" +
                "                        ,-~~~\\  `'==='  /-,      \\==```` \\__\r\n" +
                "                       /        `----'     `\\     \\       \\/\r\n" +
                "                    ,-`                  ,   \\  ,.-\\       \\\r\n" +
                "                   /      ,               \\,-`\\`_,-`\\_,..--'\\\r\n" +
                "                  ,`    ,/,              ,>,   )     \\--`````\\\r\n" +
                "                  (      `\\`---'`  `-,-'`_,<   \\      \\_,.--'`\r\n" +
                "                   `.      `--. _,-'`_,-`  |    \\\r\n" +
                "                    [`-.___   <`_,-'`------(    /\r\n" +
                "                    (`` _,-\\   \\ --`````````|--`\r\n" +
                "                     >-`_,-`\\,-` ,          |\r\n" +
                "                   <`_,'     ,  /\\          /\r\n" +
                "                    `  \\/\\,-/ `/  \\/`\\_/V\\_/\r\n" +
                "                       (  ._. )    ( .__. )\r\n" +
                "                       |      |    |      |\r\n" +
                "                        \\,---_|    |_---./\r\n" +
                "                        ooOO(_)    (_)OOoo");
       
        enemyName = "Shrek";
        enemyHp = 0;
        enemyAtk = 0;
        enemyDef = 0;
        enemyDex = 0;
        enemyLuck = 0;
        enemyMgc = 0;
       
        Combat(input, health, damage, defense, dexterity, luck, magic, enemyHp, enemyAtk, enemyDef, enemyDex, enemyLuck, enemyMgc, enemyName);
       
       
       
    }
   
    public static void Desert1(Scanner input, int health, int damage, int defense,  int dexterity, int luck, int magic, int enemyHp, int enemyAtk, int enemyDef, int enemyDex, int enemyLuck, int enemyMgc, String enemyName) {
       
    }
   
    public static void Cave1(Scanner input, int health, int damage, int defense,  int dexterity, int luck, int magic, int enemyHp, int enemyAtk, int enemyDef, int enemyDex, int enemyLuck, int enemyMgc, String enemyName) {
       
    }
   
    public static void Town1(Scanner input, int health, int damage, int defense,  int dexterity, int luck, int magic, int enemyHp, int enemyAtk, int enemyDef, int enemyDex, int enemyLuck, int enemyMgc, String enemyName) {
       
    }
   
   
   
   
}
