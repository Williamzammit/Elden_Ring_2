package MainFiles;

import static Utils.Constants.*;

import java.util.Scanner;

public class LoopMain {

    Inventory m_inventory = new Inventory();
    Scanner input = new Scanner(System.in);

    int intChoice;

    public void mainLoop(){
        
        while (gameState == true){
        //All code within this while loop

        for (int i = 1; i <= 10; i++){
            m_inventory.addItem("Health Potion 1");
        }

        System.out.println("[1] Open Inventory");
        intChoice = input.nextInt();
            m_inventory.viewInventory();

            m_inventory.addItem("Mace of Light");

            //Backup code to stop infinite loop
            //Will be replaced by other methods that end the game once they are created
            gameState = false;

        }
    }
}