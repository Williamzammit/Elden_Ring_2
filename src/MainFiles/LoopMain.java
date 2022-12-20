package MainFiles;

import static Utils.Constants.*;

import java.util.Scanner;

public class LoopMain {

    Inventory m_inventory = new Inventory();
    Shop m_shop = new Shop();
    Scanner input = new Scanner(System.in);
    Combat m_combat = new Combat();
    Regions m_region = new Regions();

    int intChoice;
    String options;

    public void mainLoop() {

    //Creates the inventory
    for (int i = 1; i <= 10; i++){
        inventory.put("Slot" + i, "Empty");
    }
    //Creates the "booleanDialogue" hashmap
    for (int i = 1; i <= 20; i++){
        booleanDialogue.put(i, true);
    }
    //Creates areaAccess hashmap
    for(int i = 1; i <= 20; i++){
        areaAccess.put(i, false);
    }
    //Creates regionAccess hashmap
    for(int i = 1; i <= 4; i++){
        regionAccess.put(i, false);
    }
    for(int i = 1; i <= 3; i++){
        bossesKilled.put(i, false);
    }
        
        //All code within this while loop
        while (gameState){
        
        
        m_region.areaStartup(currentRegion[0], currentRegion[1]);

        //Begin code for asking player what to do
        options = "";
        options += "\n" + "[1] View Inventory";
        options += "\n" + "[2] View Skill Tree";
        options += "\n" + "[3] Fight Enemy";
        options += "\n" + "[4] Travel to different area";
        options += "\n" + "[5] Travel to next Region";
        if(true){
        options+= "\n" + "[6] Write in Journal";
        } else {options += "\n";}

        System.out.println(options);
        intChoice = input.nextInt();

        if(intChoice == 1){
            m_inventory.viewInventory();
        }
        else if(intChoice == 2){

        }
        else if(intChoice == 3){
            m_combat.initiateCombat(m_combat.getEnemy());
        }
        else if(intChoice == 4){
            m_region.moveToNewArea(currentRegion[0], m_region.regionIdentifier());
        }
        else if(intChoice == 5){
            m_region.moveToNewRegion(currentRegion[0]);
        }
        else if(true && intChoice == 6){

        }
        //Backup code to stop infinite loop
        //Will be replaced by other methods that end the game once they are created*/

        }
    }
}