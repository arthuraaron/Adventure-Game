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
        int dexterity = 0;
        int luck = 0;
        int magic = 0;
       
        // Race traits
        int raceHp = 0;
        int raceAtk = 0;
        int raceDex = 0;
        int raceLuck = 0;
        int raceMgc = 0;
       
        // Class traits
        int classHp = 0;
        int classAtk = 0;
        int classDex = 0;
        int classLuck = 0;
        int classMgc = 0;
       
        // Modifiers
        int healthMod = 100;
        int attackMod = 0;
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
            raceHp = 5;
            raceAtk = 4;
            raceDex = 3;
            raceLuck = 5;
            raceMgc = 3;
            raceMenu = 1;
        }
        else if (playerRace.equalsIgnoreCase("Elf")) {
            raceHp = 3;
            raceAtk = 3;
            raceDex = 5;
            raceLuck = 4;
            raceMgc = 5;
            raceMenu = 1;
        }
        else if (playerRace.equalsIgnoreCase("Human")) {
            raceHp = 4;
            raceAtk = 5;
            raceDex = 4;
            raceLuck = 3;
            raceMgc = 4;
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
            classHp = 5;
            classAtk = 4;
            classDex = 4;			
            classLuck = 4;
            classMgc = 3;
            classMenu = 1;
        }
        else if (playerClass.equalsIgnoreCase("Wizard")) {
            classHp = 3;
            classAtk = 3;
            classDex = 5;			
            classLuck = 4;
            classMgc = 5;
            classMenu = 1;
        }
        else if (playerClass.equalsIgnoreCase("Demon")) {
            classHp = 4;
            classAtk = 5;
            classDex = 3;			
            classLuck = 4;
            classMgc = 4;
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
        dexterity = raceDex + classDex + dexterityMod;
        luck = raceLuck + classLuck + luckMod;
        magic = raceMgc + classMgc + magicMod;
       
        // Display stats
        System.out.println("\nStats: "
                + "\nHealth: " + health
                + "\nAttack: " + damage
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
            Path1(input, health, damage,   dexterity, luck, magic, enemyHp, enemyAtk, enemyDex, enemyLuck, enemyMgc, enemyName);
        }
        else if (action == 2) {
            Forest1(input, health, damage,   dexterity, luck, magic, enemyHp, enemyAtk, enemyDex, enemyLuck, enemyMgc, enemyName);
        }
       
           
           
        }
        // Options
        else if (menuInput == 2) {
            int optionMenu = 0;
            while (optionMenu == 0) {
            System.out.println("\nOptions: ");
            System.out.print("1: Change health of character"
                    + "\n2: Change attack of character"
                    + "\n3: Change dexterity of character"
                    + "\n4: Change luck of character"
                    + "\n5: Change magic of character"
                    + "\n6: Return"
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
                System.out.print("Choose a dexterity modifier: ");
                dexterityMod = input.nextInt();
            }
            else if (optionsInput == 4) {
                System.out.print("Choose a luck modifier: ");
                luckMod = input.nextInt();
            }
            else if (optionsInput == 5) {
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
   
    public static void Combat(Scanner input, int health, int damage, int dexterity, int luck, int magic, int enemyHp, int enemyAtk, int enemyDex, int enemyLuck, int enemyMgc, String enemyName) {
        // Local Combat variables
    	int tempHp = health;
    	int escape = 0;
    	
    	while (tempHp > 0 && enemyHp > 0 && escape == 0) {
    		
    	System.out.println("\n[1: ATTACK]\t[2: SPECIAL]\t[3: HEAL]\t[4: RETREAT]");
       
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
                
                if (tempHp > 0) {
                System.out.println("You strike back, dealing the " + damage + " damage!");
                enemyHp -= damage;
                }
                
            }
           
           
        }
        else if (action == 2) {
        	int special = 0;
        	System.out.println("\nSpecial attack Menu: \n1: Heavy Blow \n2: Fireball");
        	System.out.print("What do you choose?: ");
        	special = input.nextInt();
        	
        	if (enemyDex > dexterity) {
        		System.out.println("\nThe " + enemyName + " strikes first, dealing " + enemyAtk + " damage. ");
        		tempHp -= enemyAtk;
        	}
        	
        	if (special == 1) {
        		System.out.println("\nYou use a heavy blow. ");
        		int heavyRoll = (int) (Math.random() * 50);
        		heavyRoll += luck;
        		
        		if (heavyRoll >= 30) {
        			System.out.println("\nThe blow strikes true, dealing " + (damage * 2) + " damage. ");
        		}
        		else {
        			System.out.println("\nIt misses completely.");
        		}
        		
        	}
        	else if (special == 2) {
        		System.out.println("\nYou throw a fireball at the " + enemyName + " dealing " + magic + " damage. ");
        		enemyHp -= magic;
        		
        	}
        	
        	if (enemyHp > 0 && enemyDex <= dexterity) {
        	System.out.println("\nThe " + enemyName + " strikes back, dealing " + enemyAtk + " damage. ");
            tempHp -= enemyAtk;
        	}
        	
           
        }
        else if (action == 3) {
        	tempHp += dexterity;
        	if (tempHp > health) {
        		tempHp = health;
        	}
        	
        	System.out.println("You heal yourself for " + dexterity + ", going to " + tempHp + " health. ");
        	
        	if (enemyHp > 0) {
            	System.out.println("The " + enemyName + " takes his chance to attack, dealing " + enemyAtk + " damage. ");
                tempHp -= enemyAtk;
            	}
           
        }
        else if (action == 4) {
           System.out.println("You attempt to run like a coward. ");
           int escapeRoll = (int) (Math.random() * 100);
           escapeRoll += dexterity;
           if (escapeRoll >= 80) {
        	   System.out.println("You have successfully escaped!");
        	   escape = 1;
           }
           else {
        	   System.out.println("Your attempt to flee fails. The " + enemyName + " strikes you, doing " + enemyAtk + " damage. ");
           }
        	
        }
       
    	}
    	
    	if (tempHp <= 0) {
    		System.out.println("\nYou have been slain. ");
    		System.exit(0);
    	}
       
       
    }
   
    public static void Forest1(Scanner input, int health, int damage, int dexterity, int luck, int magic, int enemyHp, int enemyAtk, int enemyDex, int enemyLuck, int enemyMgc, String enemyName) {
        System.out.println("\nYou have entered the forest."
                + "\nAfter trudging through the forest for a bit, you reach a clearing."
                + "\nYou can see a trapdoor on the ground, and an opening on the other side of the clearing."
                + "\n1: Enter the trapdoor."
                + "\n2: Go to the opening in the clearing.");
        System.out.print("What do you do?: ");
        int action = input.nextInt();
 
        if (action == 1) {
            Cave1(input, health, damage, dexterity, luck, magic, enemyHp, enemyAtk, enemyDex, enemyLuck, enemyMgc, enemyName);
        }
        else if (action == 2) {
            Town1(input, health, damage, dexterity, luck, magic, enemyHp, enemyAtk, enemyDex, enemyLuck, enemyMgc, enemyName);
        }
       
    }
   
     
    public static void Path1(Scanner input, int health, int damage, int dexterity, int luck, int magic, int enemyHp, int enemyAtk, int enemyDex, int enemyLuck, int enemyMgc, String enemyName) {
        System.out.println("\nYou have followed the path. "
                + "\nYou follow the path until you approach a fork."
                + "\nTo the left you see a swamp, and the right a desert. "
                + "\n1: Go left into the swamp. "
                + "\n2: Go right into the desert. "
                + "\n3: Kill yourself. ");
        System.out.print("What do you do?: ");
        int action = input.nextInt();
       
        if (action == 1) {
            Swamp1(input, health, damage, dexterity, luck, magic, enemyHp, enemyAtk, enemyDex, enemyLuck, enemyMgc, enemyName);
        }
        else if (action == 2) {
            Desert1(input, health, damage, dexterity, luck, magic, enemyHp, enemyAtk, enemyDex, enemyLuck, enemyMgc, enemyName);
        }
        else if (action == 3) {
            System.out.println("\nYou kill yourself.. That wasnt a very good idea, was it?");
            System.exit(0);
        }
       
    }
   
    public static void Swamp1(Scanner input, int health, int damage,   int dexterity, int luck, int magic, int enemyHp, int enemyAtk, int enemyDex, int enemyLuck, int enemyMgc, String enemyName) {
        System.out.println("\nYou follow the path into the swamp to find an ogre.");
       
       
        System.out.println("                         __,='`````'=/__\r\n" +
                "                        '//  (o) \\(o) \\ `'         _,-,\r\n" +
                "                        //|     ,_)   (`\\      ,-'`_,-\\\r\n" +
                "                      ,-~~~\\  `'==='  /-,      \\==```` \\__\r\n" +
                "                     /        `----'     `\\     \\       \\/\r\n" +
                "                  ,-`                  ,   \\  ,.-\\       \\\r\n" +
                "                 /      ,               \\,-`\\`_,-`\\_,..--'\\\r\n" +
                "                ,`    ,/,              ,>,   )     \\--`````\\\r\n" +
                "                (      `\\`---'`  `-,-'`_,<   \\      \\_,.--'`\r\n" +
                "                 `.      `--. _,-'`_,-`  |    \\\r\n" +
                "                  [`-.___   <`_,-'`------(    /\r\n" +
                "                  (`` _,-\\   \\ --`````````|--`\r\n" +
                "                   >-`_,-`\\,-` ,          |\r\n" +
                "                 <`_,'     ,  /\\          /\r\n" +
                "                  `  \\/\\,-/ `/  \\/`\\_/V\\_/\r\n" +
                "                     (  ._. )    ( .__. )\r\n" +
                "                     |      |    |      |\r\n" +
                "                      \\,---_|    |_---./\r\n" +
                "                      ooOO(_)    (_)OOoo");
       
        enemyName = "ogre";
        enemyHp = 15;
        enemyAtk = 3;
        enemyDex = 5;
        enemyLuck = 5;
        enemyMgc = 5;
       
        Combat(input, health, damage, dexterity, luck, magic, enemyHp, enemyAtk, enemyDex, enemyLuck, enemyMgc, enemyName);
        
        System.out.println("The ogre has been killed.\n");
        
        System.out.print("\nAfter defeating the ogre, you find yourself looking around. \n" 
        		+ "You can make out the silhouette of a town in the background. \n"
        		+ "1: Go to the town\n"
        		+ "2: Stay in the swamp\n"
        		+ "What do you do?: ");
        int action = 0;
        action = input.nextInt();
        
        if (action == 1) {
        	Town1(input, health, damage, dexterity, luck, magic, enemyHp, enemyAtk, enemyDex, enemyLuck, enemyMgc, enemyName);
        }
        else {
        	Swamp2(input, health, damage, dexterity, luck, magic, enemyHp, enemyAtk, enemyDex, enemyLuck, enemyMgc, enemyName);
        }

    }
    
    public static void Swamp2(Scanner input, int health, int damage, int dexterity, int luck, int magic, int enemyHp, int enemyAtk, int enemyDex, int enemyLuck, int enemyMgc, String enemyName) {
    	System.out.print("\nYou trudge through the swamp, coming across a potion on the ground."
    			+ "\nThe bottle looks like it was sealed tightly, and it contains a reddish liquid inside."
    			+ "\n1: Drink the potion" 
    			+ "\n2: Don't drink the potion"
    			+ "\nWhat do you do?: ");
    	int choice = 0;
    	choice = input.nextInt();
    	
    	if (choice == 1) {
    		System.out.println("\nYou decide to drink the potion. ");
    		
    		// Determine what the potion does
    		int potionRoll = (int) (Math.random() * 100);
    		potionRoll += luck;
    		
    		if (potionRoll > 50) {
    			System.out.println("You feel yourself becoming stronger.");
    			health += 1;
    			System.out.println("Your health increses. It is now " + health + ".");
    		}
    		else {
    			System.out.println("The potion tastes a little funny. You feel yourself become weaker.");
    			damage -= 1;
    			System.out.println("Your attack decreases. It is now " + damage + ".");
    		}
    		
    		Swamp3(input, health, damage, dexterity, luck, magic, enemyHp, enemyAtk, enemyDex, enemyLuck, enemyMgc, enemyName);
    		
    	}
    	else {
    		System.out.println("\nYou pass up the potion and keep moving along. ");
    		Swamp3(input, health, damage, dexterity, luck, magic, enemyHp, enemyAtk, enemyDex, enemyLuck, enemyMgc, enemyName);
    	}
    	
    }
    
    public static void Swamp3(Scanner input, int health, int damage, int dexterity, int luck, int magic, int enemyHp, int enemyAtk, int enemyDex, int enemyLuck, int enemyMgc, String enemyName) {
    	System.out.print("\nYou continue to move through the swamp, becoming hungry and tired quite quickly." 
    			+ "\n1: Hunt for food. "
    			+ "\n2: Find a place to sleep. "
    			+ "\nWhat do you do?: ");
    	
    	int choice = 0;
    	choice = input.nextInt();
    	
    	if (choice == 1) {
    		System.out.println("You go on the hunt for some food. "
    				+ "\nAfter looking for what seems like hours, you come across a chipmunk.");
    		
    		System.out.println("               _ _\r\n" + 
    				"    |\\__/|  .~    ~.\r\n" + 
    				"    /  o `./      .'\r\n" + 
    				"   {o__,   \\    {\r\n" + 
    				"     / .  . )    \\\r\n" + 
    				"     `-` '-' \\    }  \r\n" + 
    				"    .(   _(   )_.'\r\n" + 
    				"   '---.~_ _ _|");
    		enemyName = "chipmunk";
            enemyHp = 100;
            enemyAtk = 1;
            enemyDex = 1000;
            enemyLuck = 0;
            enemyMgc = 0;
            
            Combat(input, health, damage, dexterity, luck, magic, enemyHp, enemyAtk, enemyDex, enemyLuck, enemyMgc, enemyName);
            
            System.out.println("The chipmunk dies. ");
            
            System.out.println("\nAfter what seems like forever, you finally have taken down the chipmunk!");
            System.out.println("You cook and eat it, then find a cave to sleep in.");
            
            try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            
            Swamp4(input, health, damage, dexterity, luck, magic, enemyHp, enemyAtk, enemyDex, enemyLuck, enemyMgc, enemyName);
            
    	}
    	else {
    		System.out.println("You find a cave and go to sleep.");
    		
    		try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    		
    		Swamp4(input, health, damage, dexterity, luck, magic, enemyHp, enemyAtk, enemyDex, enemyLuck, enemyMgc, enemyName);
    		
    	}
    	
    }
   
    
    public static void Swamp4(Scanner input, int health, int damage, int dexterity, int luck, int magic, int enemyHp, int enemyAtk, int enemyDex, int enemyLuck, int enemyMgc, String enemyName) {
    	System.out.println("\nAfter a long night of sleep, you wake up feeling refreshed. ");
    	System.out.println("You go to exit the cave only to find a dragon blocking your way. ");
    	System.out.println("                                             __----~~~~~~~~~~~------___\r\n" + 
    			"                                  .  .   ~~//====......          __--~ ~~\r\n" + 
    			"                  -.            \\_|//     |||\\\\  ~~~~~~::::... /~\r\n" + 
    			"               ___-==_       _-~o~  \\/    |||  \\\\            _/~~-\r\n" + 
    			"       __---~~~.==~||\\=_    -_--~/_-~|-   |\\\\   \\\\        _/~\r\n" + 
    			"   _-~~     .=~    |  \\\\-_    '-~7  /-   /  ||    \\      /\r\n" + 
    			" .~       .~       |   \\\\ -_    /  /-   /   ||      \\   /\r\n" + 
    			"/  ____  /         |     \\\\ ~-_/  /|- _/   .||       \\ /\r\n" + 
    			"|~~    ~~|--~~~~--_ \\     ~==-/   | \\~--===~~        .\\\r\n" + 
    			"         '         ~-|      /|    |-~\\~~       __--~~\r\n" + 
    			"                     |-~~-_/ |    |   ~\\_   _-~            /\\\r\n" + 
    			"                          /  \\     \\__   \\/~                \\__\r\n" + 
    			"                      _--~ _/ | .-~~____--~-/                  ~~==.\r\n" + 
    			"                     ((->/~   '.|||' -_|    ~~-/ ,              . _||\r\n" + 
    			"                                -_     ~\\      ~~---l__i__i__i--~~_/\r\n" + 
    			"                                _-~-__   ~)  \\--______________--~~\r\n" + 
    			"                              //.-~~~-~_--~- |-------~~~~~~~~\r\n" + 
    			"                                     //.-~~~--\\");
    	enemyName = "dragon";
        enemyHp = 30;
        enemyAtk = 4;
        enemyDex = 4;
        enemyLuck = 0;
        enemyMgc = 0;
        
        Combat(input, health, damage, dexterity, luck, magic, enemyHp, enemyAtk, enemyDex, enemyLuck, enemyMgc, enemyName);
        
        System.out.println("\nThe dragon dies.");
        
        System.out.println("\nCONGRATULATIONS! The dragon was the last foe in your path. You go and live your life out in peace. ");
        System.exit(0);
        
    }
    
    public static void Desert1(Scanner input, int health, int damage, int dexterity, int luck, int magic, int enemyHp, int enemyAtk, int enemyDex, int enemyLuck, int enemyMgc, String enemyName) {
       System.out.println("\nYou turn right, entering the desert.");
       System.out.println("\nTo the left, you can see a massive pyramid towering over the... cacti.");
       System.out.println("To the right, you cant see anything except for small dunes of sand.");
       System.out.println("1: Go into the pyramid.");
       System.out.println("2: Go to the dunes. ");
       System.out.print("What do you do?: ");
       
       int action = 0;
       action = input.nextInt();
       
       if (action == 1) {
    	   Pyramid1(input, health, damage, dexterity, luck, magic, enemyHp, enemyAtk, enemyDex, enemyLuck, enemyMgc, enemyName);
       }
       else {
    	   Desert2(input, health, damage, dexterity, luck, magic, enemyHp, enemyAtk, enemyDex, enemyLuck, enemyMgc, enemyName);
       }
       
    }
    
    
    public static void Pyramid1(Scanner input, int health, int damage, int dexterity, int luck, int magic, int enemyHp, int enemyAtk, int enemyDex, int enemyLuck, int enemyMgc, String enemyName) {
    	System.out.println("\nAs you walk up to the pyramid, you can see a sphynx blocking the entrance. ");
    	System.out.println("                              .sSSSSSSSs\r\n" + 
    			"                              sSS=\"\"^^^\"s\r\n" + 
    			"                  /\\       , /  \\_\\_\\|_/_)\r\n" + 
    			"                 /';;     /| \\\\\\/.-. .-./\r\n" + 
    			"                / \\;|    /. \\,S'  -   - |\r\n" + 
    			"               / -.;|    | '.SS     _|  ;\r\n" + 
    			"              ; '-.;\\,   |'-.SS\\   __  /S\r\n" + 
    			"              | _  ';\\\\.  \\' SSS\\_____/SS\r\n" + 
    			"              |  '- ';\\\\.  \\_SSS[_____]SS\r\n" + 
    			"              \\ '--.-';;-. __SSS/\\    SSS\r\n" + 
    			"               \\  .--' ';;'.=SSS`\\\\_\\_SSS\r\n" + 
    			"                `._ .-'` _';;..=.=.=.\\.=\\\r\n" + 
    			"                   ;-._-'  _.;\\.=.=.=.|.=|\r\n" + 
    			"         ,     _.-'    `\"=._  ;\\=.=__/__/\r\n" + 
    			"         )\\ .'`   __        \".;|.=.=.=./\r\n" + 
    			"         (_\\   .-`  '.   |    \\/=.=.=/`\r\n" + 
    			"          /\\\\         \\-,|     |.--'|\r\n" + 
    			"         /  \\`,       //  \\    | |  |\r\n" + 
    			"        ( (__) )  _.-'--,  \\   | |  '--,\r\n" + 
    			"         ;----' -'--,__}}}  \\  '--, __}}}\r\n" + 
    			"         \\_________}}}       \\___}}}");
    	System.out.println("YOU MUST ANSWER MY RIDDLE BEFORE YOU CAN ENTER INTO THE PYRAMID!");
    	System.out.println("A man is standing in front of a painting of a man, and he tells us the following:"
    			+ " \"Brothers and sisters have I none, but this man's father is my father's son\". Who is on the painting?");
    	System.out.println("1: His father");
    	System.out.println("2: He himself ");
    	System.out.println("3: His son ");					// Correct answer
    	System.out.print("What is your answer?: ");
    	
    	int action = 0;
    	action = input.nextInt();
    	
    	if (action == 3) {
    		System.out.println("\nVERY GOOD, YOU MAY NOW ENTER THE PYRAMID!");
    		
    		Pyramid2(input, health, damage, dexterity, luck, magic, enemyHp, enemyAtk, enemyDex, enemyLuck, enemyMgc, enemyName);
    		
    	}
    	else {
    		System.out.println("\nAfter answering the riddle incorrectly, the sphinx kills you. ");
    		System.out.println("THE END");
    		System.exit(0);
    	}
    	
    	
    	
    }
    
    public static void Pyramid2(Scanner input, int health, int damage, int dexterity, int luck, int magic, int enemyHp, int enemyAtk, int enemyDex, int enemyLuck, int enemyMgc, String enemyName) {
    	
    }
    
    public static void Desert2(Scanner input, int health, int damage, int dexterity, int luck, int magic, int enemyHp, int enemyAtk, int enemyDex, int enemyLuck, int enemyMgc, String enemyName) {
    	
    }
    
    public static void Cave1(Scanner input, int health, int damage, int dexterity, int luck, int magic, int enemyHp, int enemyAtk, int enemyDex, int enemyLuck, int enemyMgc, String enemyName) {
       
    }
   
    public static void Town1(Scanner input, int health, int damage, int dexterity, int luck, int magic, int enemyHp, int enemyAtk, int enemyDex, int enemyLuck, int enemyMgc, String enemyName) {
       
    }
    
    
   
   
   
   
}
