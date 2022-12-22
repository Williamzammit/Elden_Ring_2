package MainFiles;

import static Utils.Constants.*;
import java.util.Scanner;

public class Skills {
    public static int healthLevel;
    public static int damageLevel;
    public static int healthIncrease = 2;
    public static int damageIncrease = 2;
    public static int healthCost = 3;
    public static int damageCost = 4;

    Scanner input = new Scanner(System.in);
    public int intChoice;
    String bufferedLine;

    public void viewStats(){

        System.out.println("\nHealth: " + playerHealth + "\n Level: "+ healthLevel);
        System.out.println("Damage: " + playerDamage + "\n Level: "+ damageLevel + "\n");
        System.out.println("Your Skill Points: "+ playerSkillPoints);
    }

    public void upgradeStats(){
        System.out.println("[1] Current Health = " + playerHealth);
        System.out.println("Cost of upgrading = " + healthCost);
        System.out.println("[2] Current Damage = " + playerDamage);
        System.out.println("Cost of upgrading = " + damageCost);

        System.out.println("\nYour Skill Points: "+ playerSkillPoints);

        System.out.println("What would you like to upgrade?");

        intChoice = input.nextInt();

        switch(intChoice){
            case 1:
                if(playerSkillPoints >= healthCost){
                    playerSkillPoints -= healthCost;
                    playerHealth += healthIncrease;
                    healthIncrease += 2;
                    healthCost += 1;
                    System.out.println("New Health: " + playerHealth);
                } else {System.out.println("\n Not Enough Skill Points!");}
            break;
            case 2:
                if(playerSkillPoints >= damageCost){
                    playerSkillPoints -= damageCost;
                    playerDamage += damageIncrease;
                    damageIncrease += 2;
                    damageCost += 1;
                    System.out.println("New Damage: " + playerDamage);
                } else {System.out.println("\n Not Enough Skill Points!");bufferedLine = input.nextLine();bufferedLine = input.nextLine();}
            break;
        }
    }
    
}