package Utils;

/*for (int i = 1; i <= 10; i++){

}
for loop easy copy*/

import java.util.HashMap;

public class Constants {
  
  public static boolean gameState = true;

  public static HashMap<String, String> inventory = new HashMap<String, String>();

  //Player stats will be here
  //Values not finalized
  public static String playerName = "Joe";
  public static double playerHealth = 20;
  public static double playerDamage = 5;

  //Region variables
  public static int[] currentRegion = {1, 1};
  public static HashMap<Integer, Boolean> booleanDialogue = new HashMap<Integer, Boolean>();
  public static HashMap<Integer, Boolean> areaAccess = new HashMap<Integer, Boolean>();
  public static HashMap<Integer, Boolean> regionAccess = new HashMap<Integer, Boolean>();
  public static HashMap<Integer, Boolean> bossesKilled = new HashMap<Integer, Boolean>();
}