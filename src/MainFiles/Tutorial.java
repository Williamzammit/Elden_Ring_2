package MainFiles;

import java.util.Scanner;
import static Utils.Constants.*;

public class Tutorial {
    Scanner input = new Scanner(System.in);
    String bufferedLine;
    int intChoice;
    
    public void tutorialCall(){

        System.out.println("Would you like to view the tutorial? \n[1] Yes\n[2] No");
        intChoice = input.nextInt();
        if(intChoice == 2){
            nameEntry();
        } else {

        System.out.println("Hello there traveller, lets go over a few things before we let you loose on the world");

        System.out.println("[1] View Inventory \n[2] View Skill Tree\n[3] Fight Enemy\n[4] Travel to different area\n[5] Travel to next Region\n[6] Write in Journal");
        System.out.println("These are the most common options you will have to choose from during your time here \nPress Enter to continue...");
        bufferedLine = input.nextLine();
        System.out.println("The view inventory option allows you to examine the various items you may have");
        bufferedLine = input.nextLine();
        System.out.println("The Skill tree allows you to upgrade your stats to increase your outcome during battle");
        bufferedLine = input.nextLine();
        System.out.println("You can choose to fight enemies at any time to increase your stats");
        bufferedLine = input.nextLine();
        System.out.println("You can move throughout the areas in your region to see the sights and fight certain enemies");
        bufferedLine = input.nextLine();
        System.out.println("At certain stages of the game you will be able to progress to more regions to fight tougher enemies");
        bufferedLine = input.nextLine();
        System.out.println("If you want to take in your surroundings just write in your journal and enjoy the experience");
        bufferedLine = input.nextLine();


        //Combat training
        System.out.println("\n" + "Your Turn: " + "\n" + "[1] Attack " + "\n" + "[2] Attack Buff " + "\n" + "[3] Block " + "\n" + "[4] Heal " + "\n" + "[5] Use Item " + "\n" + "[6] Flee ");
        System.out.println("These are your options during the combat sequences, \nYou can mix and match these options to develop the best strategy you can find");
        bufferedLine = input.nextLine();

        System.out.println("Remember to keep an eye on your health as you fight stronger enemies, \nAlso keep in mind that every enemy can do the same things as you besides using items and fleeing");
        bufferedLine = input.nextLine();

        nameEntry();
        }
    }
    public void nameEntry(){
        System.out.println("Before we start please enter your name below:");
        input.nextLine();
        playerName = input.nextLine();

        System.out.println("Good luck " + playerName + "!"); 
    }
}
