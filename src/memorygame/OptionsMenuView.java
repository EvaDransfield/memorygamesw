/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
        {"1","Play A One-Player Game"},
        {"2","Play A Two-Player Game"},    
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
                case "1":
                    this.optionsMenuControl.displayOnePlayer();
                    break;
                case "2":
                    this.optionsMenuControl.displayTwoPlayer();
                    break;
                case "N":
                    this.optionsMenuControl.displayNumberCards();
                    break;
                case "S":
                    this.optionsMenuControl.displaySymbolCards();
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
        System.out.println("\n\t-------------------------------------------------------------------------\n");
        System.out.println("\n Enter the letter associated with one of the commands.");
        
        for (int i = 0; i < OptionsMenuView.menuChoices.length; i++) {
            System.out.println("\t " +menuChoices[i][0] + "\t" + menuChoices [i][1]);
        }         
        System.out.println("\n\t-------------------------------------------------------------------------\n");        
    }
}

