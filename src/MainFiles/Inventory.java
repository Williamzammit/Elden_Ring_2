package MainFiles;

import static Utils.Constants.*;

public class Inventory {
    
    public Inventory(){
        for (int i = 1; i <= 10; i++){
            inventory.put("Slot" + i, "Empty");
        }
    }

    public void viewInventory(){
        int i2 = 1;
        for(Object i:inventory.values()){
        System.out.println("[" +i2 + "] " + i);
        }
        i2++;
    }

    public void addItem(String newItem){
        for(int i = 1; i <= 10; i++){
            if(inventory.get("Slot" + i) == "Empty"){
                inventory.put("Slot" + i, newItem);
                i = 11;
            }
            if(i == 10 && inventory.get("Slot" + i) != "Empty"){
                System.out.println();
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
    
}