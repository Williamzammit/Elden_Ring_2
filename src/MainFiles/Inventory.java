package MainFiles;

import static Utils.Constants.*;

import java.util.InputMismatchException;
import java.util.Scanner;
import Utils.Items;

class Inventory extends Combat{
    Scanner input = new Scanner(System.in);
    int choice;
    Items m_items = new Items();

    
    public Inventory() {
        
    }

    public void viewInventory(){
        System.out.println("\n" + "***** Inventory *****" + "\n");
        int i2 = 1;
        for(int i = 1; i <= 10; i++){
        System.out.println("[" +i2 + "] " + inventory.get("Slot" + i));
        i2++;
        }
        
    }

    public void addItem(String newItem){
        for(int i = 1; i <= 10; i++){
            if(inventory.get("Slot" + i) == "Empty"){
                inventory.put("Slot" + i, newItem);
                i = 11;
            }
            if(i == 10 && inventory.get("Slot" + i) != "Empty"){
                System.out.println("Inventory full would you like to delete an item?");
                System.out.println("[1] Yes");
                System.out.println("[2] No");
                choice = input.nextInt();
                if(choice == 1){
                    viewInventory();
                    System.out.println("[11] Discard new Item");
                    System.out.println("Select an option");
                    choice = input.nextInt();
                    switch (choice){
                    case 1:
                    inventory.put("Slot1", newItem);
                    break;
                    case 2:
                    inventory.put("Slot2", newItem);
                    break;
                    case 3:
                    inventory.put("Slot3", newItem);
                    break;
                    case 4:
                    inventory.put("Slot4", newItem);
                    break;
                    case 5:
                    inventory.put("Slot5", newItem);
                    break;
                    case 6:
                    inventory.put("Slot6", newItem);
                    break;
                    case 7:
                    inventory.put("Slot7", newItem);
                    break;
                    case 8:
                    inventory.put("Slot8", newItem);
                    break;
                    case 9:
                    inventory.put("Slot9", newItem);
                    break;
                    case 10:
                    inventory.put("Slot10", newItem);
                    break;
                    }
                    if(choice < 11 && choice > 0){
                        System.out.println("Item added");
                    } else {
                        System.out.println("Slot not found, would you like to keep the item?" + "\n" + "(Yes, 1) (No, 2)");
                        choice = input.nextInt();
                        if(choice == 1){
                            addItem(newItem);
                        }
                        else{
                            System.out.println("Item discarded");
                        }
                    }
                } else {
                    System.out.println("Item Deleted");
                }
            }
        }   
        
    }

    public void deleteItem(String selectedItem){
        for (int i = 1; i <= 10; i++){
            if(inventory.get("Slot" + i).contains(selectedItem)){
                inventory.put("Slot" + i, "Empty");
                i = 10;
            }
            if(i == 10 && inventory.get("Slot" + i).contains(selectedItem)){
            System.out.println("Item Not Found");
            }
        }
        
    }
    public int getInput() {
        try{
            choice = input.nextInt();
            return choice;
        } catch (InputMismatchException e){
            getInput();
            return choice;
        }
    }

    public void useItem() {
        String selectedItem;
        viewInventory();
        System.out.println("Select an Item to use (1-10)");

        choice = input.nextInt();
        
        selectedItem = inventory.get("Slot" + choice);
        if(m_items.evaluateItemType(selectedItem) == 1){
            //Damage Item
            damageDealt *= m_items.evaluateItem(selectedItem);
            inventory.put("Slot" + choice, "Empty");
            System.out.println("You have increased your damage using " + selectedItem);
        } else if(m_items.evaluateItemType(selectedItem) == 2){
            //Health Item
            currentPlayerHealth += maxPlayerHealth*m_items.evaluateItem(selectedItem);
            inventory.put("Slot" + choice, "Empty");
            System.out.println("You have healed yourself using " + selectedItem);
        }
    }


    
    

    public String selectItem(){
        String selectedItem;
        viewInventory();
        System.out.println("Select an Item to use (1-10)");

        choice = input.nextInt();
        selectedItem = inventory.get("Slot" + choice);

        return selectedItem;
    }
    
}