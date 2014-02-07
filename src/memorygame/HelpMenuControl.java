/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package memorygame;

/**
 *
 * @author Eva
 */
public class HelpMenuControl {
    // Constructor 
   public HelpMenuControl(){
        
    }
 
 public void displayGameObjective(){
    System.out.println();
    displayHelpBorder();
    System.out.println(
         "\t The objective of this game is to try and find \n\n"
         + "the match for each cards by memorizing them");
    displayHelpBorder();
    }
 
 
 public void displayOnePlayerHelp(){
    System.out.println();
    displayHelpBorder();
    System.out.println(
         "\t You have 115 points.\n\n"
         +"Your points is substructed when you make a move\n\n"
         +"Try to finish the game with just few moves");
    displayHelpBorder();
    }
    
public void displayTwoPlayerHelp(){
    System.out.println();
    displayHelpBorder();
    System.out.println(
         "\t You compete against the computer. The one that\n\n"
         +"has the most matches at the nd of the game wins!\n\n"
       );
 displayHelpBorder();
}

 public void displayHelpBorder(){
    System.out.println(
    "\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
}
 
}

