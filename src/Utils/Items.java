package Utils;

public class Items {
    
    public int evaluateItemType(String selectedItem) {
        switch (selectedItem) {
            //Healing items
            case ("Health Potion 1"):
            return 2;
            case ("Health Potion 2"):
            return 2;
            case ("Apple"):
            return 2;
            case ("Golden Apple"):
            return 2;
            case ("Lemon Pie"):
            return 2;
            case ("Enchanted Golden Apple"):
            return 2;

            //Damage items
            case ("Strength Potion 1"):
            return 1;

        }
        return 2;
    }

    public double evaluateItem(String selectedItem){
        switch (selectedItem) {
        case ("Health Potion 1"):
        System.out.println("TEST");
        return 0.4;
        
        }
        return 0;
    }
    public void useHealthItem(String itemName, int healingMultiplier){
        System.out.println("You have healed for " + healingMultiplier + " damage!");
    }
    public void useDamageItem(String itemName, int damageMultiplier){
        System.out.println("You have increased your damage by " + damageMultiplier + "!");
    }
}