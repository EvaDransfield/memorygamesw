/*
 * This class is done!
 */

package memorygame;

import java.util.Scanner;

/*
 * @author michelewhite
 */

public class OptionsMenuView {
    
    private final static String[][] menuChoices = {
        /*not sure if the game will have player choose number of players in main
        menu or options menu so I added it hear as well.*/    
        {"N","Play With Numbers On Cards"},
        {"S","Play With Symbols On Cards"},
        {"Q","Quit Options Menu"},
    };
    
    private OptionsMenuControl optionsMenuControl = new OptionsMenuControl();
    
    public OptionsMenuView(){
    
    }
    
    public void getInput(){
    
        String userCommand;
        Scanner inFile = new Scanner(System.in);
        
        do {
            this.display();
            
            userCommand = inFile.nextLine();
            userCommand = userCommand.trim().toUpperCase();
            
            switch (userCommand) {

                case "N":
                    this.optionsMenuControl.displayNumberCards();
                    break;
                case "C":
                    this.optionsMenuControl.displayColorCards();
                    break;
                case "Q":
                    break;
                default: 
                    new MemoryGameError().displayError(" You Entered an Invalid command. Please enter a valid command.");
                    continue;
            
            }
        } while (!userCommand.equals("Q"));  
             return;
    }
    
    public void display() {
        System.out.println("\n\t______________________________________________________________________");
        System.out.println("\n\tEnter the letter associated with one of the commands.\n");
        
        for (int i = 0; i < OptionsMenuView.menuChoices.length; i++) {
            System.out.println("\n\t " +menuChoices[i][0] + "\t" + menuChoices [i][1]);
        }         
        System.out.println("\n\t______________________________________________________________________");        
    }
}

