/*
 * This class needs to display everything related to the Player class, statistics
 * player names, ect.  I'm not sure what else this needs to do
 */

package memorygame;

import java.util.Scanner;

/**
 *
 * @author KenandEva
 */
/* this class controls the game, update and draws it on the screen*/

// I changed the class name to onePlayer, we can move back later.
// When paying with one player users will compete with the time.
// the Game will set for 100 seconds
// The game is a win if time: t<50
// The game is a ties if time : 50<t<100
// The game is a lose if time : t>100

// Eva's individual assignment lesson 3
public class PlayerView {
    
    public String[] playerNameList = new String[2];
    double startingPoints=115.00;
    int gameMove;
    boolean cards;// true if cards matches, false if not.
    
    public void setGameMove(int gameMove) {
        this.gameMove = gameMove;
    }

    public void setCards(boolean cards) {
        this.cards = cards;
    }
     
    public void getWinningScore(int gameMove, boolean cards){
       int score= (int) (startingPoints)-gameMove;// cast double to int
                    if ((cards==true)&&(gameMove==15)){
        System.out.println("you win perfect score!: " +score+" points\n");
        }
        else if  ((cards==true) && (gameMove<115)){
            System.out.println("you win  "+score+" points\n");
                }
                
        else if((cards==false) && (gameMove==115)){
            System.out.println("you loose! "+ score+" points\n");
                }
        else if((cards==true) && (gameMove<=0)){
            System.out.println("invalid input\n");
                }
        else if((cards==false) && (gameMove>115)){
            System.out.println("invalid input\n");
                }              
    }

    // Paired Programming Assignment Week 6 - get list of players for multiperson game
    public void PlayerList() {
        
    }
    public String[] getInput() {
        
        Scanner inFile = new Scanner(System.in);
        
        System.out.println("\n\t________________________________________________________________________");
        System.out.println("\n\t You must enter names for two players before starting a two player game.");
        System.out.println("\n\t________________________________________________________________________");
        
        int playerIndex = 0;
        boolean listComplete = false;
        while (playerIndex < 2 && !listComplete) {
            System.out.println("\n\t Please Enter a name for this player, or \'Q\' to quit.");
            String playerName;
            playerName = inFile.nextLine();
            playerName = playerName.trim();
            
            if (playerName.length() < 1) {
                new MemoryGameError().displayError("\n\t A name must be at least "
                        + "one character long. Try again or \'Q\' to quit.");
                continue;
            }
            
            if (playerName.equals("computer")) {
                new MemoryGameError().displayError(
                        "\n\t Memory, is a mind training game, you cannot play against a computer."
                        + " please enter another name, or \'Q\' to quit.");
                continue;
            }
            
            if (alreadyListed(playerNameList, playerName)) {
                new MemoryGameError().displayError(
                        "\n\t That name has already been entered. Please enter another"
                        + " name, or \'Q\' to quit.");
                continue;
            }
            
            if (playerName.toUpperCase().equals("Q")) { // quit?
                listComplete = true;
                break;
            }
            
            this.playerNameList[playerIndex] = playerName;
            playerIndex++;

        }
        
                String[] newNameList = new String[playerIndex];
        for (int i = 0; i < playerIndex; i++) {
            newNameList[i] = this.playerNameList[i];          
        }
        

        newNameList = this.sortList(newNameList);
        this.displayNameList(newNameList); // display the list of names
        
        return newNameList;
    }
    
    public String[] sortList(String[] names) {
           
        String tempName;
        boolean complete = false;
        while(complete) {
            
            complete = true; // assume that you done
            for (int i = 0; i < names.length-1; i++) {
                int compareResult = names[i].compareTo(names[i+1]);
                if (compareResult > 0) {
                    // swap names
                    tempName = names[i];
                    names[i] = names[i+1];
                    names[i+1] = tempName;
                    complete = true;
                } 
            }
        } 
        return names;
    }
    
    private boolean alreadyListed (String[] list, String value) {
        
        for (String valueListed : list) {
            if (value.equals(valueListed)) {
                return true;
            }           
        }
        return false;
    }
    
    public void displayNameList(String[] names) {
        System.out.println("\n\t______________________________________________________________________");
        System.out.println("\n\tHere are the two players in this game.");

        for (int i = 0; i < names.length; i++) {
            if (names[i] == null) {
                break;
            }
                
            int namesList = i+1;
            System.out.println("\n\t   " + namesList + "\t" + names[i]);
        }
        System.out.println("\n\t______________________________________________________________________");
    }
}

