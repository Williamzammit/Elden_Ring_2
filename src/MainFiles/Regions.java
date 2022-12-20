package MainFiles;

import static Utils.Constants.*;

import java.util.Scanner;

public class Regions {

    Scanner input = new Scanner(System.in);
    
    String options = "";
    int intChoice;

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

        options = "";
        System.out.println("");
        switch(currentRegion[0]){
        case 1:
        numberOfAreas = 6;
        if(areaAccess.get(1)){
            options += "\n [1] Dirt Path";
        }
        if(areaAccess.get(2) || (currentRegion[1]+1)==2){
            options += "\n [2] Old Oak Tree";
        }
        if(areaAccess.get(3) || (currentRegion[1]+1)==3){
            options += "\n [3] Desolate Cave";
        }
        if(areaAccess.get(4) || (currentRegion[1]+1)==4){
            options += "\n [4] Area 4";
        }
        if(areaAccess.get(5) || (currentRegion[1]+1)==5){
            options += "\n [5] Area 5";
        }
        if(areaAccess.get(6) || (currentRegion[1]+1)==6){
            options += "\n [6] Area 6";
        }

            System.out.println(options);
            System.out.println("Which area would you like to travel to?");

            intChoice = input.nextInt();
            if(intChoice > 0 && intChoice <= numberOfAreas){
                return intChoice;
            }
            break;
        case 2:
        numberOfAreas = 6;
        if(areaAccess.get(7)){
            options += "\n [1] Dirt Path";
        }
        if(areaAccess.get(8) || (currentRegion[1]+1)==8){
            options += "\n [2] Old Oak Tree";
        }
        if(areaAccess.get(9) || (currentRegion[1]+1)==9){
            options += "\n [3] Desolate Cave";
        }
        if(areaAccess.get(10) || (currentRegion[1]+1)==10){
            options += "\n [4] Area 4";
        }
        if(areaAccess.get(11) || (currentRegion[1]+1)==11){
            options += "\n [5] Area 5";
        }
        if(areaAccess.get(12) || (currentRegion[1]+1)==12){
            options += "\n [6] Area 6";
        }

            System.out.println(options);
            System.out.println("Which area would you like to travel to?");

            intChoice = input.nextInt();
            if(intChoice > 0 && intChoice <= numberOfAreas){
                return intChoice;
            }
            break;
        case 3:
        numberOfAreas = 4;
        if(areaAccess.get(13)){
            options += "\n [1] Dirt Path";
        }
        if(areaAccess.get(14) || (currentRegion[1]+1)==14){
            options += "\n [2] Old Oak Tree";
        }
        if(areaAccess.get(15) || (currentRegion[1]+1)==15){
            options += "\n [3] Desolate Cave";
        }
        if(areaAccess.get(16) || (currentRegion[1]+1)==16){
            options += "\n [4] Area 4";
        }

            System.out.println(options);
            System.out.println("Which area would you like to travel to?");

            intChoice = input.nextInt();
            if(intChoice > 0 && intChoice <= numberOfAreas){
                return intChoice;
            }
            break;
        case 4:
        numberOfAreas = 6;
        if(areaAccess.get(17)){
            options += "\n [1] Dirt Path";
        }
        if(areaAccess.get(18) || (currentRegion[1]+1)==18){
            options += "\n [2] Old Oak Tree";
        }
        if(areaAccess.get(19) || (currentRegion[1]+1)==19){
            options += "\n [3] Desolate Cave";
        }
        if(areaAccess.get(20) || (currentRegion[1]+1)==20){
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
        }
        currentRegion[1] = newArea;
    }

    public void areaStartup(int Region, int Area) {
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
                System.out.println("1");
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
                    currentRegion[0] = intChoice;
                } else {System.out.println("You cannot travel to this region!");}
            }
            else if(intChoice == 2){
                if(bossesKilled.get(1) && Region != 2 && (regionAccess.get(2) || (Region+1) == 2)){
                    currentRegion[0] = intChoice;
                } else {System.out.println("You cannot travel to this region!");}
            }
            else if(intChoice == 3){
                if(bossesKilled.get(2) && Region != 3 && (regionAccess.get(3) || (Region+1) == 3)){
                    currentRegion[0] = intChoice;
                } else {System.out.println("You cannot travel to this region!");}
            }
            else if(intChoice == 4){
                if(bossesKilled.get(3) && Region != 4 && (regionAccess.get(4) || (Region+1) == 4)){
                    currentRegion[0] = intChoice;
                } else {System.out.println("You cannot travel to this region!");}
            } else {System.out.println("You cannot travel to this region!");}

        } else {System.out.println("This Region does not Exist!");}
        }
    }
}