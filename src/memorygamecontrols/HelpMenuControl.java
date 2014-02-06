/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package memorygamecontrols;

/**
 *
 * @author Eva
 */
public class HelpMenuControl {
    /*don't know what this line is for ?*/ public HelpMenuControl(){
        
    }
    public void displayGameObjective(){
 System.out.println();
 displayHelpBorder();
 System.out.println(
         "\t The objective of this game is trying to find matches.\n\n"
         +"for each cards by memorizing them );
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
         "\t You compete against the computer.\n\n"
         +"The one that have the most matches at the nd of the game wins!\n\n"
       );
 displayHelpBorder();
}
 public void displayHelpBorder(){
 System.out.println(
 "\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
}
}

