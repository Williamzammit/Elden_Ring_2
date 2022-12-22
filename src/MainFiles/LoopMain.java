package MainFiles;

import static Utils.Constants.*;

import java.util.Scanner;

public class LoopMain {

    Inventory m_inventory = new Inventory();
    Scanner input = new Scanner(System.in);
    Combat m_combat = new Combat();
    Regions m_region = new Regions();
    Skills m_skills = new Skills();

    String inputBuffer;
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
    //Creates the bossesKilled hashmap
    for(int i = 1; i <= 4; i++){
        bossesKilled.put(i, false);
    }
    //Creates the journalEntries HashMap
    for(int i = 1; i <= 20; i++){
        journalEntries.put(i, true);
    }
        
        //All code within this while loop
        while (gameState){
        
        System.out.println("(Press Enter)");
        input.nextLine();
        m_region.areaStartup(currentRegion[0], currentRegion[1]);


        if(m_region.bossFight(currentRegion[0], currentRegion[1]) && !(bossesKilled.get(currentRegion[0]))){

            System.out.println("A Powerful Foe Approaches! \n (Press Enter To Continue)");
            input.nextLine();
            m_combat.initiateCombat(m_combat.getEnemy(true));
        } else{


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
        try{
        intChoice = input.nextInt();
        }
        catch (Exception e) {
            System.out.println("Invalid input!");
        }
        
        input.nextLine();
        if(intChoice == 1){
            m_inventory.viewInventory();
            intChoice = 0;
        }
        else if(intChoice == 2){
            System.out.println("[1] View Stats \n[2] Upgrade Stats");
            System.out.println("\nSelect an option\n");
            intChoice = input.nextInt();
            switch(intChoice){
                case 1:
                m_skills.viewStats();
                break;
                case 2:
                m_skills.upgradeStats();
                break;
                default:
                System.out.println("Invalid Option");
            }
            intChoice = 0;
        }
        else if(intChoice == 3){
            m_combat.initiateCombat(m_combat.getEnemy(false));
            intChoice = 0;
        }
        else if(intChoice == 4){
            m_region.moveToNewArea(currentRegion[0], m_region.regionIdentifier());
            intChoice = 0;
        }
        else if(intChoice == 5){
            m_region.moveToNewRegion(currentRegion[0]);
            intChoice = 0;
        }
        else if(true && intChoice == 6){
            m_region.journalEntry(currentRegion[0], currentRegion[1]);
            intChoice = 0;
        }
        //Backup code to stop infinite loop
        //Will be replaced by other methods that end the game once they are created*/
    }
        }
    }
}