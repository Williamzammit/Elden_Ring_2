package MainFiles;

import static Utils.Constants.*;

import java.util.Scanner;

public class LoopMain {

    Inventory inventory = new Inventory();
    Scanner input = new Scanner(System.in);

    public void mainLoop(){
        
        while (gameState == true){

            inventory.viewInventory();

            //Backup code to stop infinite loop
            gameState = false;

        }
    }
}