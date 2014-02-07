package memorygame;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author Mpianatra
 */
public class MainMenuControl {
    


   public void startGameOnePlayer() {
       System.out.println("\n\t A game for one player will show here");                
              }
   public void startGameTwoPlayer(){
       System.out.println("\n\t A game for two player will show here");
  }      
   public String quitGame() {
        System.out.println("\n\tAre you sure you want to quit? (Y or N)");
        Scanner inFile = new Scanner(System.in);
        String answer = inFile.next().trim().toUpperCase();
        if (answer.equals("Y")) {
            return Game.EXIT;
        }

        return Game.PLAYING;
    }
    
    
    /*
     * Display help menu action
     */
    public void displayHelpMenu() {
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.getInput();
    }

    
}

