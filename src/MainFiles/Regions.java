package MainFiles;

import static Utils.Constants.*;

import java.util.Scanner;

public class Regions {

    Scanner input = new Scanner(System.in);
    
    String options = "";
    int intChoice;
    String bufferedLine;

    String[] journalText = {"test1", "test2", "test3", "test4", "test5", "test6", "test7", "test8", "test9", "test10", "test11", "test12", "test13", "test14", "test15", "test16", "test17", "test18", "test19", "test20", };

    public boolean lastAreaInRegion(){
        if(currentRegion[0] == 1 && currentRegion[1] == 6){
            return true;
        } else if (currentRegion[0] == 2 && currentRegion[1] == 6) {
            return true;
        } else if (currentRegion[0] == 3 && currentRegion[1] == 4) {
            return true;
        }else {
            return false;
        }
    }

    public int regionIdentifier(){
        int numberOfAreas;
        int Area = currentRegion[1];

        options = "";
        System.out.println("");
        switch(currentRegion[0]){
        case 1:
        numberOfAreas = 6;
        if(areaAccess.get(1)){
            options += "\n [1] Moisty Mire";
        }
        if(areaAccess.get(2) || (currentRegion[1]+1)==2){
            options += "\n [2] Slurppy Swamp";
        }
        if(areaAccess.get(3) || (currentRegion[1]+1)==3){
            options += "\n [3] Frenzy Fields";
        }
        if(areaAccess.get(4) || (currentRegion[1]+1)==4){
            options += "\n [4] Loot Lake";
        }
        if(areaAccess.get(5) || (currentRegion[1]+1)==5){
            options += "\n [5] Wild Thicket";
        }
        if(areaAccess.get(6) || (currentRegion[1]+1)==6){
            options += "\n [6] Gargoyles Soil";
        }

            System.out.println(options);
            System.out.println("Which area would you like to travel to?");

            intChoice = input.nextInt();
            if(intChoice > 0 && intChoice <= numberOfAreas){
                return intChoice;
            }
            break;
        case 2:
        Area += 6;
        numberOfAreas = 6;
        if(areaAccess.get(7)){
            options += "\n [1] The Great Hall";
        }
        if(areaAccess.get(8) || (Area+1)==8){
            options += "\n [2] Bed Chambers";
        }
        if(areaAccess.get(9) || (Area+1)==9){
            options += "\n [3] Tilted Towers";
        }
        if(areaAccess.get(10) || (Area+1)==10){
            options += "\n [4] The Chapel";
        }
        if(areaAccess.get(11) || (Area+1)==11){
            options += "\n [5] The Basement";
        }
        if(areaAccess.get(12) || (Area+1)==12){
            options += "\n [6] Margits Gatehouse";
        }

            System.out.println(options);
            System.out.println("Which area would you like to travel to?");

            intChoice = input.nextInt();
            if(intChoice > 0 && intChoice <= numberOfAreas){
                return intChoice;
            }
            break;
        case 3:
        Area += 12;
        numberOfAreas = 4;
        if(areaAccess.get(13)){
            options += "\n [1] Main Gutter";
        }
        if(areaAccess.get(14) || (Area+1)==14){
            options += "\n [2] Septic Tank";
        }
        if(areaAccess.get(15) || (Area+1)==15){
            options += "\n [3] Toxic Lake";
        }
        if(areaAccess.get(16) || (Area+1)==16){
            options += "\n [4] Billy's Drainpipe Labyrinth";
        }

            System.out.println(options);
            System.out.println("Which area would you like to travel to?");

            intChoice = input.nextInt();
            if(intChoice > 0 && intChoice <= numberOfAreas){
                return intChoice;
            }
            break;
        case 4:
        Area += 16;
        numberOfAreas = 6;
        if(areaAccess.get(17)){
            options += "\n [1] Winding Staircase";
        }
        if(areaAccess.get(18) || (Area+1)==18){
            options += "\n [2] Old Oak Tree";
        }
        if(areaAccess.get(19) || (Area+1)==19){
            options += "\n [3] Desolate Cave";
        }
        if(areaAccess.get(20) || (Area+1)==20){
            options += "\n [4] Area 4";
        }

            System.out.println(options);
            System.out.println("Which area would you like to travel to?");

            intChoice = input.nextInt();
            if(intChoice > 0 && intChoice <= numberOfAreas){
                return intChoice;
            }
            break;
        }
        return 0;
    }

    public void moveToNewArea(int Region, int newArea){
        if(newArea == 0){
            System.out.println("INVALID REGION DESTINATION");
        } else{
        currentRegion[1] = newArea;
    }}

    public void areaStartup(int Region, int Area) {
        System.out.println("*****************************************");
        int placeHolder = Area;
        regionAccess.put(Region, true);

        switch(Region){
            case 1:
            areaAccess.put(Area, true);
            break;
            case 2:
            Area += 6;
            areaAccess.put(Area, true);
            break;
            case 3:
            Area += 12;
            areaAccess.put(Area, true);
            break;
            case 4:
            Area +=16;
            areaAccess.put(Area, true);
            break;
        }
        
        Area = placeHolder;
        switch(Region){
            case 1:
            if(booleanDialogue.get(Area)){
                switch(Area){
                    case 1:
                    System.out.println("\n\nWelcome to this mystical forest where the trees grow backwards and there are all sorts of undiscovered wonders.");
                    bufferedLine = input.nextLine();
                    break;
                    case 2:
                    System.out.println("");
                    bufferedLine = input.nextLine();
                    break;
                    case 3:
                    System.out.println("");
                    bufferedLine = input.nextLine();
                    break;
                    case 4:
                    System.out.println("");
                    bufferedLine = input.nextLine();
                    break;
                    case 5:
                    System.out.println("");
                    bufferedLine = input.nextLine();
                    break;
                    case 6:
                    System.out.println("");
                    bufferedLine = input.nextLine();
                    break;
                }
                
            }
            booleanDialogue.put(Area, false);
            break;
            case 2:
            Area += 6;

            if(booleanDialogue.get(Area)){
                System.out.println("2");
            }
            booleanDialogue.put(Area, false);
            break;
            case 3:
            Area += 12;
            if(booleanDialogue.get(Area)){
                System.out.println("3");
            }
            booleanDialogue.put(Area, false);
            break;
            case 4:
            Area += 16;
            if(booleanDialogue.get(Area)){
                System.out.println("4");
            }
            booleanDialogue.put(Area, false);
            break;
        }
        Area = placeHolder;
        System.out.println("You are in \nRegion "+Region+", \nArea "+Area);
    }

    public void moveToNewRegion(int Region){
        options = "";
        if(regionAccess.get(1) && Region != 1){
            options += "\n [1] Travel to the Forest";
        }
        if(bossesKilled.get(1) == true && Region != 2 && (regionAccess.get(2) || (Region+1) == 2)){
            options += "\n [2] Travel to the Castle";
        }
        if(bossesKilled.get(2) && Region != 3 && (regionAccess.get(3) || (Region+1) == 3)){
            options += "\n [3] Travel to the Sewers";
        }
        if(bossesKilled.get(3) && Region != 4 && (regionAccess.get(4) || (Region+1) == 4)){
            options += "\n [4] Travel to the High Tower";
        }

        if(options == ""){
        System.out.println("Defeat the final boss of the Region to Progress!");
        } else{
        System.out.println(options);
        System.out.println("Select the Region you would like to travel to!");
        intChoice = input.nextInt();

        if(intChoice > 0 && intChoice <= 4){
            if(intChoice == 1){
                if(regionAccess.get(1) && Region != 1){
                    currentRegion[0] = intChoice; currentRegion[1] = 1;
                } else {System.out.println("You cannot travel to this region!");}
            }
            else if(intChoice == 2){
                if(bossesKilled.get(1) && Region != 2 && (regionAccess.get(2) || (Region+1) == 2)){
                    currentRegion[0] = intChoice; currentRegion[1] = 1;
                } else {System.out.println("You cannot travel to this region!");}
            }
            else if(intChoice == 3){
                if(bossesKilled.get(2) && Region != 3 && (regionAccess.get(3) || (Region+1) == 3)){
                    currentRegion[0] = intChoice; currentRegion[1] = 1;
                } else {System.out.println("You cannot travel to this region!");}
            }
            else if(intChoice == 4){
                if(bossesKilled.get(3) && Region != 4 && (regionAccess.get(4) || (Region+1) == 4)){
                    currentRegion[0] = intChoice; currentRegion[1] = 1;
                } else {System.out.println("You cannot travel to this region!");}
            } else {System.out.println("You cannot travel to this region!");}

        } else {System.out.println("This Region does not Exist!");}
        }
    }

    public boolean bossFight(int Region, int Area){
        switch(Region){
            case 1:
                if((Area == 6) && bosses[Region-1]){
                    return true;
                }
            break;
            case 2:
                if(Area == 6 && bosses[Region-1]){
                    return true;
                }
            break;
            case 3:
                if(Area == 4 && bosses[Region-1]){
                    return true;
                }
            break;
            case 4:
                if(Area == 4 && bosses[Region-1]){
                    return true;
                }
            break;

        }
            return false;
        
        
    }

    public void journalEntry(int Region, int Area){
        System.out.println("*****************************************");

        switch(Region){
            case 1:
                if(journalEntries.get(Area)){
                    System.out.println(journalText[Area-1]);
                    journalEntries.put(Area, false);
                }
            break;
            case 2:
            Area+=6;
            if(journalEntries.get(Area)){
                System.out.println(journalText[Area-1]);
                journalEntries.put(Area, false);
            }
            break;
            case 3:
            Area+=12;
            if(journalEntries.get(Area)){
                System.out.println(journalText[Area-1]);
                journalEntries.put(Area, false);
            }
            break;
            case 4:
            Area+=16;
            if(journalEntries.get(Area)){
                System.out.println(journalText[Area-1]);
                journalEntries.put(Area, false);
            }
            break;
        }

    }
}