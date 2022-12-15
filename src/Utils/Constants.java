package Utils;

/*for (int i = 1; i <= 10; i++){

}
for loop easy copy*/

import java.util.TreeMap;
import java.util.HashMap;

public class Constants {
  
  public static boolean gameState = true;

  public static HashMap<String, String> inventory = new HashMap<String, String>();
  public static TreeMap items = new TreeMap();

  //Player stats will be here
  //Values not finalized
  public static String playerName = "Joe";
  public static int playerHealth = 20;
  public static double playerDamage = 5;
  
}