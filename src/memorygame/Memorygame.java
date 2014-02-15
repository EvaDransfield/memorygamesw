/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package memorygame;

import java.util.Scanner;

/**
 *
 * @author Eva
 */
public class Memorygame {
    // created two instance variables (or attributes) below
    String name;
    String instructions = "Memory is the name of this game! \n\n"
            + "The purpose of the game is to clear the board of all cards \n\n"
            + "by matching each card with its \"twin\" when the board is \n\n"
            + "clear, the game is over. Good Luck! \n\n";
                 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Memorygame myGame= new Memorygame();
        myGame.getName();
        myGame.displayHelp();
        
       
        
         // linking MainmenuView class to main
        MainMenuView mainMenu= new MainMenuView();
        mainMenu.getInput();
        CardView cardView= new CardView("hi", 1);
        cardView.showCard();
        CardControl cardControl= new CardControl();
        cardControl.playGame();
        
        //linking the HelpMenuView class to main
        HelpMenuView helpMenu= new HelpMenuView();
        helpMenu.getInput();
        
        //linking the OptionsMenuView class to main
        OptionsMenuView optionsMenu= new OptionsMenuView();
        helpMenu.getInput();
        
        
        
        Game runBestTimeCalculation = new Game(1);
        
         //linking the Player class to main.
        Player onePlayerObject=new Player();
        onePlayerObject.getWinningScore(200,false);
        
       

    }
   
    public void getName() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        this.name = input.next(); 
    }
    
    public void displayHelp() {
        System.out.println("\nWelcome " + this.name + "\n");
        System.out.println(this.instructions);
    }
}
