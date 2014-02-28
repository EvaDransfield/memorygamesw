package memorygame;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author michelewhite
 */
public class GameMenuView {
    
    private Game game;
    private MainMenuControl mainMenuControl ;

    private final static String[][] menuItems = {
        {"T","Take your turn"},
        {"D", "Display the board"},
        {"N", "New Game"},
        {"H", "Help"},
        {"Q", "QUIT"}
    };

    public GameMenuView(Game game) {
        this.game = game;
        this.mainMenuControl = new MainMenuControl();
    }

    
    
    public void getInput() {
   
        String command;
        Scanner inFile = new Scanner(System.in);

        do {    
            this.display(); // display the menu

            // get commaned entered
            command = inFile.nextLine();
            command = command.trim().toUpperCase();
            
            switch (command) {
                case "T":
                    this.game.choosePairOfCards();
                    break;
                case "D":
                    this.game.printCells();
                    break;
                case "N":
                    this.mainMenuControl.startGame(1);
                    break;
                case "H":
                    this.mainMenuControl.displayHelpMenu();
                    break;
                case "Q":                   
                    break;
                default: 
                    new MemoryGameError().displayError("Invalid command. Please enter a valid command.");
                    continue;                              
            }
        } while (!command.equals("Q"));

        return;
    }
    


    public final void display() {
        System.out.println("\n\t______________________________________________________________________");
        System.out.println("\tEnter the letter associated with one of the following commands:");

        for (int i = 0; i < GameMenuView.menuItems.length; i++) {
            System.out.println("\t   " + menuItems[i][0] + "\t" + menuItems[i][1]);
        }
        System.out.println("\n\t______________________________________________________________________");
    }
  
}


