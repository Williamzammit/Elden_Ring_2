package MainFiles;

import static Utils.Constants.*;
import java.util.Scanner;

public class Combat {
    Scanner startCombat = new Scanner(System.in);
    Entities selectedEnemy;
    Entities[] enemies =  {new Entities("FortniteMan", 10, 5), new Entities("nuts", 20, 1), new Entities("lol", 7, 2), new Entities("Tutorial Enemy", 15, 2)};
    Player playerStats = new Player(playerName, playerHealth, playerDamage);
    boolean playerTurn = true, enemyTurn = true, combatTurn = true;
    public Entities getEnemy() {
    selectedEnemy = enemies[(int) (Math.random()*3)];

        return selectedEnemy;
    }
    
    public void initiateCombat(Entities enemy) {
        int enemyMaxHealth = enemy.health;
        int enemyDamageDealt = enemy.damage;
        int damageDealt = playerStats.playerDamage;
        int maxPlayerHealth = playerHealth;
        boolean playerBuff = false;
        int chance; 
        String text = "YOU DIED ";
        int i;

        while (combatTurn) {
        System.out.println("\033[1n" + playerName + "\033[0m" + "\n" + "Health: " + playerStats.playerHealth + "\n" + "Damage: " + playerDamage + "\n");
        System.out.println("\033[1n" + enemy.name + "\033[0m" + "\n" + "Health: " + enemy.health + "\n" + "Damage:" + enemyDamageDealt + "\n");
        System.out.println("Press \033[3mEnter\033[0m to continue");
        String startCombatInput = startCombat.nextLine();
        Scanner combatMove = new Scanner(System.in);
          
        if (playerHealth > 0) {
        while (playerTurn) {
        System.out.println("Your Turn: " + "\n" + "[1] Attack " + "\n" + "[2] Attack Buff " + "\n" + "[3] Block " + "\n" + "[4] Heal " + "\n" + "[5] Use Item " + "\n" + "[6] Flee ");
        char combatMoveInput = combatMove.next(".").charAt(0);
        if (combatMoveInput == '1'){
            (enemy.health) -= (damageDealt);
            System.out.println("You attack for " + damageDealt + " damage! ");
            playerDamage = damageDealt;
            enemy.damage = enemyDamageDealt;
            playerBuff = false;
            playerTurn = false;
            enemyTurn = true;
        }
        else if (combatMoveInput == '2'){
            damageDealt *= 1.2;
            playerBuff = true;
            System.out.println("You sharpen your weapon for 20% increased damage! ");
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
            maxPlayerHealth *= 0.2 + playerStats.playerHealth;
            if (playerStats.playerHealth >= maxPlayerHealth) {
                playerStats.playerHealth = maxPlayerHealth;
            }
            System.out.println("You heal 20% of your Health");
            playerTurn = false;
            enemyTurn = true;
        }
        else if (combatMoveInput == '5'){
            System.out.println("test5");
            playerTurn = false;
            enemyTurn = true;
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
                playerTurn = false;
                enemyTurn = false;
                combatTurn = false;
            }
          }
    }
    if (enemy.health > 0) {
    while (enemyTurn) {

    if ((int)(enemyMaxHealth/4) > enemy.health && playerBuff == false) {
        //if the enemies health is below 25% and the player has not buffed their attack
        System.out.println("The enemy has healed 20% of their health! ");
        enemyMaxHealth *= 0.2 + enemy.health;
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
            System.out.println("The enemy attacks for " + enemyDamageDealt + " damage! ");
            playerStats.playerHealth -= enemyDamageDealt;
            damageDealt = playerDamage;
            enemyDamageDealt = enemy.damage;
        }
        else {
            System.out.println("The enemy has sharped their weapon for 20% more damage! ");
            enemyDamageDealt *= 1.2;
        }
        enemyTurn = false;
        playerTurn = true;
    }
    else if ((int)(enemyMaxHealth/2) >= enemy.health && playerBuff == false) {
        //if the enemies health is below 50% and the player has not buffed their attack
        chance = (int)(Math.random()*3);
        if (chance == 1) {
            System.out.println("The enemy has healed 20% of their health! ");
            enemy.health *= 1.2;
            if (enemy.health >= enemyMaxHealth) {
                enemy.health = enemyMaxHealth;
            }
        }
        else if (chance == 2) {
            System.out.println("The enemy attacks for " + enemyDamageDealt + " damage! ");
            playerStats.playerHealth -= enemyDamageDealt;
            damageDealt = playerDamage;
            enemyDamageDealt = enemy.damage; 
        }
        else {
            System.out.println("The enemy has sharped their weapon for 20% more damage! ");
            enemyDamageDealt *= 1.2;
        }
        enemyTurn = false;
        playerTurn = true;
    }
    else if ((int)(enemyMaxHealth/4) > enemy.health && playerBuff == true) {
        //if the enemies health is below 25% and the player has buffed their attack
        chance = (int)(Math.random()*2);
        if (chance == 1) {
            System.out.println("The enemy has healed 20% of their health! ");
            enemy.health *= 1.2;
            if (enemy.health >= enemyMaxHealth) {
                enemy.health = enemyMaxHealth;
            }
        }
        else {
            System.out.println("The enemy is ready to block the next attack for 40% of its damage! ");
            damageDealt /= 1.4; 
        }
        enemyTurn = false;
        playerTurn = true;
   }
   else if ((int)(enemyMaxHealth/2) <= enemy.health && playerBuff == true) {
        //iff the enemies health is above 50% and the player has buffed their attack
        chance = (int)(Math.random()*2);
        if (chance == 1) {
            System.out.println("The enemy is ready to block the next attack for 40% of its damage! ");
            damageDealt /= 1.4; 
        }
        else {
            System.out.println("The enemy attacks for " + enemyDamageDealt + " damage! ");
            playerStats.playerHealth -= enemyDamageDealt;
            damageDealt = playerDamage;
            enemyDamageDealt = enemy.damage; 
        }
        enemyTurn = false;
        playerTurn = true;
   }
   else if ((int)(enemyMaxHealth/2) >= enemy.health && playerBuff == true) {
        //if the enemies health us below 50% and the player has buffed their attack
        chance = (int)(Math.random()*3);
        if (chance == 1) {
            System.out.println("The enemy has healed 20% of their health! ");
            enemy.health *= 1.2;
            if (enemy.health >= enemyMaxHealth) {
                enemy.health = enemyMaxHealth;
            }
        }
        else if (chance == 2) {
            System.out.println("The enemy attacks for " + enemyDamageDealt + " damage! ");
            playerStats.playerHealth -= enemyDamageDealt;
            damageDealt = playerDamage;
            enemyDamageDealt = enemy.damage; 
        }
        else {
            System.out.println("The enemy is ready to block the next attack for 40% of its damage! ");
            damageDealt /= 1.4;
        }
        enemyTurn = false;
        playerTurn = true;
   }
}
    }
    else {
        System.out.println("Foe Vanquished! ");
        enemyTurn = false;
        playerTurn = false;
        combatTurn = false;
    }
}
}
}
