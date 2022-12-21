package Utils;

import MainFiles.Entities;
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

  public static int playerSkillPoints = 0;


  //Boss Names
  public static final String boss1 = "Gargoyle";
  public static final String boss2 = "Margit";
  public static final String boss3 = "Reformed Orthodox Rabbi Billy";
  public static final String boss4 = "Radagon of the Golden Order";

  //Region variables
  public static int[] currentRegion = {1, 1};
  public static HashMap<Integer, Boolean> booleanDialogue = new HashMap<Integer, Boolean>();
  public static HashMap<Integer, Boolean> areaAccess = new HashMap<Integer, Boolean>();
  public static HashMap<Integer, Boolean> regionAccess = new HashMap<Integer, Boolean>();
  public static HashMap<Integer, Boolean> bossesKilled = new HashMap<Integer, Boolean>();
  public static HashMap<Integer, Boolean> journalEntries = new HashMap<Integer, Boolean>();

  public static boolean[] bosses = {true, true, true, true};
  public static Entities[] bossArray = {new Entities(boss1, 40, 5, 10), new Entities(boss2, 80, 10, 15), new Entities(boss3, 150, 8, 20), new Entities(boss4, 200, 20, 25)};
}