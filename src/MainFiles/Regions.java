package MainFiles;

import static Utils.Constants.*;

import java.util.Scanner;

public class Regions {

    Scanner input = new Scanner(System.in);
    
    String options = "";
    int intChoice;
    String bufferedLine;

    String[] journalText = {"Where am I? I can't seem to remember how I got here..", 
                            "Huh, this place is strange, theres a sort of.. magic to these woods", 
                            "Wasn't I with my father before this? I wonder what happened..", 
                            "There's something wrong with this lake.. Almost like a disease has overtaken it...", 
                            "What was that noise?!! Oh man I wish I wasn't here...", 
                            "That creature, it seemed to be the source of the corruption... I wonder if there are any more?..", 
                            
                            "Well for an abandoned castle this hallway seems suspiciously well-maintained...", 
                            "Jeez, I wonder when these books were last read...", 
                            "This castle is gonna be the death of me....", 
                            "Hmmm this whole place is still clean, there's no way its abandoned...", 
                            "Huh, there's markings on the wall, Radagon? who could that be?...", 
                            "These fights are not getting any easier.... I wonder how many more of these creatures there could be...", 
                            
                            "Eww, this whole area is not the best place to be, enemies are getting very strange as well", 
                            "These creatures all seem to be living in fear... Maybe if I find out why I can help them...", 
                            "There has to be some sort of chemical thats screwing with the creatures down here, that lake definately does not have water in it...", 
                            "There, I can see a clearing, I can finally get out of this disgusting toxic pit", 
                            
                            "The markings on the wall, I think Radagon is here...", 
                            "Yikes, after that bridge I've been thinking, is this really all worth it?", 
                            "Wow, I am really high up, I hope I can go home after this..", 
                            "Well, at least some of these creatures seem to be healing.. there's always more work to do around here though.", };

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
            options += "\n [2] Crumbling Window";
        }
        if(areaAccess.get(19) || (Area+1)==19){
            options += "\n [3] The Peak";
        }
        if(areaAccess.get(20) || (Area+1)==20){
            options += "\n [4] The Golden Order's Palace";
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
                    System.out.println("\n\nWelcome to this mystical forest where the trees grow backwards and there are all sorts of undiscovered wonders....");
                    bufferedLine = input.nextLine();
                    break;
                    case 2:
                    System.out.println("You enter a swampy area, your feet sink into the fragile ground as you hear sounds from creatures of all sorts....");
                    bufferedLine = input.nextLine();
                    break;
                    case 3:
                    System.out.println("Leaving the swamp you come to a field inhabited by nothing more than crops as far as the eye can see....");
                    bufferedLine = input.nextLine();
                    break;
                    case 4:
                    System.out.println("As the sun begins to set you stroll by a lake with crystal clear water and unidentifiable objects at the bottom....");
                    bufferedLine = input.nextLine();
                    break;
                    case 5:
                    System.out.println("With the sky turned dark you struggle to see through the trees, you hear noises all around you....");
                    bufferedLine = input.nextLine();
                    break;
                    case 6:
                    System.out.println("Among gravestones and the remains of ancient buildings you hear the sound of crumbling stone....");
                    bufferedLine = input.nextLine();
                    break;
                }
                
            }
            booleanDialogue.put(Area, false);
            break;
            case 2:
            Area += 6;
            if(booleanDialogue.get(Area)){
                switch(Area){
                    case 7:
                    System.out.println("\n\nAs you enter the castle you see a magnificent hallway with blood red carpets and torchlight illuminating the way....");
                    bufferedLine = input.nextLine();
                    break;
                    case 8:
                    System.out.println("You see interesting artifacts strewn among the rooms of this castle....");
                    bufferedLine = input.nextLine();
                    break;
                    case 9:
                    System.out.println("As you leave the first building winding towers that threaten their own collapse at any moment stand tall around you....");
                    bufferedLine = input.nextLine();
                    break;
                    case 10:
                    System.out.println("You enter a building that may have once been a holy place, but has clearly been abandoned and forgotten....");
                    bufferedLine = input.nextLine();
                    break;
                    case 11:
                    System.out.println("As you tread deeper through the castle you feel as if eyes are watching you from all directions....");
                    bufferedLine = input.nextLine();
                    break;
                    case 12:
                    System.out.println("Your suspicions of being watched are confirmed as a large figure looms at the end of the final hallway....");
                    bufferedLine = input.nextLine();
                    break;
                }
                
            }
            booleanDialogue.put(Area, false);
            break;
            case 3:
            Area += 12;
            if(booleanDialogue.get(Area)){
                switch(Area){
                    case 13:
                    System.out.println("\n\nAs you leave the ancient castle you path forces you into a foul smelling sewer system....");
                    bufferedLine = input.nextLine();
                    break;
                    case 14:
                    System.out.println("You come across some sort of holding tank surrounded by shadowy figures that seem to worship it....");
                    bufferedLine = input.nextLine();
                    break;
                    case 15:
                    System.out.println("Your nose seems to recede as you encounter a foul smelling lake that certainly does not contain any water....");
                    bufferedLine = input.nextLine();
                    break;
                    case 16:
                    System.out.println("Your path comes to a stop as you encounter a strange man in ritual like clothing blocking the way....");
                    bufferedLine = input.nextLine();
                    break;
                }
            }
            booleanDialogue.put(Area, false);
            break;
            case 4:
            Area += 16;
            if(booleanDialogue.get(Area)){
                switch(Area){
                    case 17:
                    System.out.println("\n\nAs you depart from the sewers you begin your accent of a winding staircase, maybe this will lead to, him....");
                    bufferedLine = input.nextLine();
                    break;
                    case 18:
                    System.out.println("AS you reach the top of the staircase you are forced to cross a bridge connecting two adjacent towers, will this be the end?....");
                    bufferedLine = input.nextLine();
                    break;
                    case 19:
                    System.out.println("With the peak of the tower reached, you can hardly grasp small everything on the ground seems....");
                    bufferedLine = input.nextLine();
                    break;
                    case 20:
                    System.out.println("Your journey ends here one way or another.... You must defeat Him......");
                    bufferedLine = input.nextLine();
                    break;
                }
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