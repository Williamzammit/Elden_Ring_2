package MainFiles;

import static Utils.Constants.*;
import java.util.Scanner;

public class Combat {
    
    Scanner startCombat = new Scanner(System.in);
    Scanner input = new Scanner(System.in);
    int intChoice;
    Entities selectedEnemy = null;
    
    Player playerStats = new Player(playerName, playerHealth, playerDamage);
    
    static double damageDealt;
    static double maxPlayerHealth;
    static double currentPlayerHealth;


    public Entities getEnemy() {
    Entities[][] enemies = {{new Entities("Goblin", 10, 3, 1), new Entities("Fragile Spirit", 11, 6, 4), new Entities("Living Stone", 20, 4, 5), new Entities("Wolf-man", 18, 5, 7)}, 
                            {new Entities("Guard", 20, 8, 5), new Entities("Ancient Spirit", 17, 10, 4), new Entities("Famed Archer", 15, 12, 6), new Entities("Orc Warrior", 18, 9, 4)}, 
                            {new Entities("Overgrown Lobster", 24, 11, 9), new Entities("Forgotten Spirit", 22, 13, 8), new Entities("Mold Slime", 21, 8, 6), new Entities("Silent Serpent", 24, 9, 7)}, 
                            {new Entities("Dragon", 34, 14, 15), new Entities("Celestial Spirit", 28, 16, 14), new Entities("Wind Giant", 32, 13, 11), new Entities("Night Raven", 27, 13, 12)}};
    selectedEnemy = enemies[(currentRegion[0]-1)][(int) (Math.random()*4)];
        return selectedEnemy;
    }
    
    public void initiateCombat(Entities enemy) {
        boolean playerTurn = true, enemyTurn = true, combatTurn = true;
        Inventory m_inventory = new Inventory();
        double enemyMaxHealth = enemy.health;
        double enemyDamageDealt = enemy.damage;
        damageDealt = playerStats.playerDamage;
        maxPlayerHealth = playerStats.playerHealth;
        currentPlayerHealth = maxPlayerHealth;
        boolean playerBuff = false, enemyBuff = false;
        int chance; 
        String text = "YOU DIED ", text2 = "FOE VANGUISHED";
        int i;

        while (combatTurn) {
        System.out.println("------------------------------------------------------------------");
        System.out.println(playerName + "\n" + "Health: " + (int)currentPlayerHealth + "\n" + "Damage: " + (int)playerDamage + "\n");
        System.out.println(enemy.name + "\n" + "Health: " + (int)enemy.health + "\n" + "Damage:" + (int)enemyDamageDealt + "\n");
        System.out.println("Press \033[3mEnter\033[0m to continue");
        String startCombatInput = startCombat.nextLine();
        Scanner combatMove = new Scanner(System.in);
          
        if ((int)(currentPlayerHealth) > 0) {
            playerTurn();
        while (playerTurn) {
        System.out.println("\n" + "Your Turn: " + "\n" + "[1] Attack " + "\n" + "[2] Attack Buff " + "\n" + "[3] Block " + "\n" + "[4] Heal " + "\n" + "[5] Use Item " + "\n" + "[6] Flee ");
        char combatMoveInput = combatMove.next(".").charAt(0);
        if (combatMoveInput == '1'){
            if(playerBuff) {
                (enemy.health) -= ((int)(damageDealt*1.25))+1;
                System.out.println("You attack for " + (int)((damageDealt*1.25)+1) + " damage! ");
            } else {
                (enemy.health) -= (damageDealt);
                System.out.println("You attack for " + damageDealt + " damage! ");
            }
            
            
            damageDealt = playerStats.playerDamage;
            playerBuff = false;
            playerTurn = false;
            enemyTurn = true;
        }
        else if (combatMoveInput == '2'){
            playerBuff = true;
            System.out.println("You sharpen your weapon for 25% increased damage on the next turn! ");
            damageDealt *= 1.25;
            playerTurn = false;
            enemyTurn = true;
        }
        else if (combatMoveInput == '3'){
            enemyDamageDealt /= 1.4;
            System.out.println("You are ready to block the next attack for 40% of its damage! ");
            playerTurn = false;
            enemyTurn = true;
        }
        else if (combatMoveInput == '4'){
            currentPlayerHealth += maxPlayerHealth*0.4;
            if (currentPlayerHealth >= maxPlayerHealth) {
                currentPlayerHealth = maxPlayerHealth;
            }
            System.out.println("You heal 40% of your Health");
            
            playerTurn = false;
            enemyTurn = true;
        }
        else if (combatMoveInput == '5'){
            for(int i2 = 1; i2 <= 10; i2++){
                if(inventory.get("Slot" + i2) != "Empty"){
                    i2 = 11;
                    m_inventory.useItem();
                    if(currentPlayerHealth > maxPlayerHealth){
                        currentPlayerHealth = maxPlayerHealth;
                    }
                    playerTurn = false;
                    enemyTurn = true;
                } else if (i2 == 10 && inventory.get("Slot"+i2) == "Empty"){
                    System.out.println("You have no usable items! :(");
                    playerTurn = true;
                    enemyTurn = false;
                }
            
            
            }
        }       
        else if (combatMoveInput == '6'){
            chance = (int)(Math.random()*2);
            if (chance == 1){
                System.out.println("You have successfully fleed! ");
                playerTurn = false;
                enemyTurn = false;
                combatTurn = false;
            }
            else {
            System.out.println("You failed to flee!");
            playerTurn = false;
            enemyTurn = true;
            }
        }
        else {
            playerTurn = true;
        }
    }
    }
    else {
        for (i = 0; i < text.length(); i++){
            System.out.printf("%c", text.charAt(i));
            try{
              Thread.sleep(125);
            }catch(InterruptedException ex){
              Thread.currentThread().interrupt();
            }
          }
          playerTurn = false;
            enemyTurn = false;
            combatTurn = false;
            currentRegion[1] = 1;
    }

    //Enemy Section
    if ((int)(enemy.health) > 0) {
    while (enemyTurn) {

    if ((int)(enemyMaxHealth/4) > enemy.health && playerBuff == false) {
        //if the enemies health is below 25% and the player has not buffed their attack
        System.out.println("The enemy has healed 40% of their health! ");
        enemyMaxHealth *= 0.4 + enemy.health;
        if (enemy.health >= enemyMaxHealth) {
            enemy.health = enemyMaxHealth;
        }
        enemyTurn = false;
        playerTurn = true;
    }
    else if ((int)(enemyMaxHealth/2) <= enemy.health && playerBuff == false) {
        //if the enemies health is above 50% and the player has not buffed their attack
        chance = (int)(Math.random()*2);
        if (chance == 1){
            System.out.println("The enemy attacks for " + (int)enemyDamageDealt + " damage! ");
            currentPlayerHealth -= enemyDamageDealt;
            damageDealt = playerDamage;
            enemyDamageDealt = enemy.damage;
            enemyBuff = false;
        }
        else {
            if (enemyBuff == false) {
            System.out.println("The enemy has sharped their weapon for 25% more damage! ");
            enemyDamageDealt *= 1.25;
            enemyBuff = true;
            }
            else {
                System.out.println("The enemy attacks for " + (int)enemyDamageDealt + " damage! ");
            currentPlayerHealth -= enemyDamageDealt;
            damageDealt = playerDamage;
            enemyDamageDealt = enemy.damage;
            enemyBuff = false;
            }
        }
        enemyTurn = false;
        playerTurn = true;
    }
    else if ((int)(enemyMaxHealth/2) >= enemy.health && playerBuff == false) {
        //if the enemies health is below 50% and the player has not buffed their attack
        chance = (int)(Math.random()*3);
        if (chance == 1) {
            System.out.println("The enemy has healed 40% of their health! ");
        enemy.health += enemyMaxHealth*0.4;
        if (enemy.health >= enemyMaxHealth) {
            enemy.health = enemyMaxHealth;
        }
        }
        else if (chance == 2) {
            System.out.println("The enemy attacks for " + (int)enemyDamageDealt + " damage! ");
            currentPlayerHealth -= enemyDamageDealt;
            enemyDamageDealt = enemy.damage; 
            enemyBuff = false;
        }
        else {
            if (enemyBuff == false) {
            System.out.println("The enemy has sharped their weapon for 25% more damage! ");
            enemyDamageDealt *= 1.25;
            enemyBuff = true;
            }
            else {
                System.out.println("The enemy attacks for " + (int)enemyDamageDealt + " damage! ");
            currentPlayerHealth -= enemyDamageDealt;
            enemyDamageDealt = enemy.damage;
            enemyBuff = false;
            }
        }
        enemyTurn = false;
        playerTurn = true;
    }
    else if ((int)(enemyMaxHealth/4) > enemy.health && playerBuff == true) {
        //if the enemies health is below 25% and the player has buffed their attack
        chance = (int)(Math.random()*2);
        if (chance == 1) {
            System.out.println("The enemy has healed 40% of their health! ");
            enemy.health += enemyMaxHealth*0.4;
        if (enemy.health >= enemyMaxHealth) {
            enemy.health = enemyMaxHealth;
        }
        }
        else {
            System.out.println("The enemy is ready to block the next attack for 40% of the next attacks damage! ");
            damageDealt /= 1.4; 
        }
        enemyTurn = false;
        playerTurn = true;
   }
   else if ((int)(enemyMaxHealth/2) <= enemy.health && playerBuff == true) {
        //iff the enemies health is above 50% and the player has buffed their attack
        chance = (int)(Math.random()*2);
        if (chance == 1) {
            System.out.println("The enemy is ready to block the next attack for 40% of the next attacks damage! ");
            damageDealt /= 1.4; 
        }
        else {
            System.out.println("The enemy attacks for " + (int)enemyDamageDealt + " damage! ");
            currentPlayerHealth -= enemyDamageDealt;
            enemyDamageDealt = enemy.damage; 
            enemyBuff = false;
        }
        enemyTurn = false;
        playerTurn = true;
   }
   else if ((int)(enemyMaxHealth/2) >= enemy.health && playerBuff == true) {
        //if the enemies health us below 50% and the player has buffed their attack
        chance = (int)(Math.random()*3);
        if (chance == 1) {
            System.out.println("The enemy has healed 40% of their health! ");
            enemy.health += enemyMaxHealth*0.4;
        if (enemy.health >= enemyMaxHealth) {
            enemy.health = enemyMaxHealth;
        }
        }
        else if (chance == 2) {
            System.out.println("The enemy attacks for " + (int)enemyDamageDealt + " damage! ");
            currentPlayerHealth -= enemyDamageDealt;
            enemyDamageDealt = enemy.damage; 
            enemyBuff = false;
        }
        else {
            System.out.println("The enemy is ready to block the next attack for 40% of the next attacks damage! ");
            damageDealt /= 1.4;
            enemyBuff = true;
        }
        enemyTurn = false;
        playerTurn = true;
   }
}
    }
    else {
        for (i = 0; i < text2.length(); i++){
            System.out.printf("%c", text2.charAt(i));
            try{
              Thread.sleep(125);
            }catch(InterruptedException ex){
              Thread.currentThread().interrupt();
            }
          }
          playerTurn = false;
            enemyTurn = false;
            combatTurn = false;
            playerSkillPoints += enemy.skillPoints;
            if(enemy.name == boss1){
                bossesKilled.put(1, true);
                System.out.println("You can now progress to the next region!");
            }
            else if(enemy.name == boss2){
                bossesKilled.put(2, true);
                System.out.println("You can now progress to the next region!");
            }
            else if(enemy.name == boss3){
                bossesKilled.put(3, true);
                System.out.println("You can now progress to the next region!");
            }
            else if(enemy.name == boss4){
                System.out.println("Congratulations! \nYou have defeated the final boss! \nWould you like to continue playing?");
                System.out.println("[1] Yes \n[2] No");

                intChoice = input.nextInt();
                if(intChoice == 2){
                    gameState = false;
                    System.out.println("Thanks for Playing!");
                }
            }
    }
}
}
    public void playerTurn(){

    }
    public void enemyTurn(){

    }
}
