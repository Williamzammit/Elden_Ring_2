package MainFiles;

import static Utils.Constants.items;
import java.util.TreeMap;
import java.util.Scanner;

public class Shop {
    int choice;
    Scanner input = new Scanner(System.in);
    Inventory m_Inventory = new Inventory();
    String selectedItem;
    
    public void viewItems(int regionID){

        //Will have code here to get possible items based on region and display stats including price

        System.out.println("Would you like to purchase an Item?" + "\n" + "[1] Yes" + "\n" + "[2] No");
        choice = input.nextInt();
        if(choice == 1){
            purchaseItems(regionID);
        }
    }

    public void purchaseItems(int regionID){

        //Will have code here to get possible items based on region and display stats including price as well as a [number]
        // in front of it to allow selection

        m_Inventory.addItem(selectedItem);
    }
}
