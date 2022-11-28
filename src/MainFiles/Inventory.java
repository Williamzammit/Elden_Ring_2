package MainFiles;

import static Utils.Constants.*;

public class Inventory {
    
    public Inventory(){
        for (int i = 1; i <= 10; i++){
            inventory.put("Slot" + i, "Empty");
        }
    }

    public void viewInventory(){
        for(Object i:inventory.values()){
        System.out.println(i);
        }
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
    
}