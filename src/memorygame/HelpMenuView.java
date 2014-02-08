/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package memorygame;

import java.util.Scanner;



/**
 * @author michelecope
 */
public class HelpMenuView  {
        
    private final static String[][] menuItems = {
        {"O", "The Objective"},
        {"1", "The One Player Game"}, 
        {"2", "The Two Player Game"},        
        {"Q", "Quit Help"}        
    };
    //instance of Help Menu
    private HelpMenuControl helpMenuControl = new HelpMenuControl();
    
    //constructor
    public HelpMenuView() {
        
    } 
    
    // displays HelpMenuControl, gets user input
    public void getInput() {       
              
        String userCommand;
        Scanner inFile = new Scanner(System.in);
        
        do {
            
            this.display(); // display the menu
            
            // get commaned entered
            userCommand = inFile.nextLine();
            userCommand = userCommand.trim().toUpperCase();
            
            switch (userCommand) {
                case "O":
                    this.helpMenuControl.displayGameObjective();
                    break;
                case "1":
                    this.helpMenuControl.displayOnePlayerHelp();
                    break;
                case "2":
                    this.helpMenuControl.displayTwoPlayerHelp();
                    break;                   
                case "Q": 
                    break;
                default: 
                    new MemoryGameError().displayError("Invalid command. Please enter a valid command.");
                    continue;
            }
        } while (!userCommand.equals("Q"));  
        
         return;
    }

        // displays for the help menu
    public final void display() {
        System.out.println("\n\t-------------------------------------------------------------------------");
        System.out.println("\tEnter the letter associated with one of the following commands:");

        for (int i = 0; i < HelpMenuView.menuItems.length; i++) {
            System.out.println("\t   " + menuItems[i][0] + "\t" + menuItems[i][1]);
        }
        System.out.println("\t-------------------------------------------------------------------------\n");
    }
  
}
/*
 * @author Cope-Michele
 */
