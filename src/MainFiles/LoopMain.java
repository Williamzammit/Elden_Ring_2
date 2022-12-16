package MainFiles;

import static Utils.Constants.*;

import java.util.Scanner;

public class LoopMain {

    Inventory m_inventory = new Inventory();
    Shop m_shop = new Shop();
    Scanner input = new Scanner(System.in);
    Combat combat = new Combat();

    int intChoice;

    

    public void mainLoop() {
    for (int i = 1; i <= 10; i++){
        inventory.put("Slot" + i, "Empty");
    }
        while (gameState){
        //All code within this while loop
        for (int i = 1; i <= 10; i++){
            inventory.put("Slot" + i, "Health Potion 1");
            System.out.println("HELLOW");
        }
        combat.initiateCombat(combat.getEnemy());

       m_inventory.viewInventory();

        /*System.out.println("[1] Open Inventory");
        intChoice = input.nextInt();
            

            m_inventory.addItem("Mace of Light");

            //Backup code to stop infinite loop
            //Will be replaced by other methods that end the game once they are created*/
            gameState = false; 

        }
    }
}