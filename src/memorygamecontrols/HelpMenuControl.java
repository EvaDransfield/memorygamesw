/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// paired pogram

package memorygamecontrols;

/**
 *
 * @author Mpianatra
 */
public class HelpMenuControl {
    public HelpMenuControl(){
            }
    

public void displayGameObjective(){
System.out.println();
this.displayHelpBorder();
System.out.println(
             "\t Memory is the name of this game! \n\n"
            + "The purpose of the game is to clear the board of all cards \n\n"
            + "by matching each card with its \"twin\" when the board is \n\n"
            + "clear, the game is over. Good Luck! \n\n");
displayHelpBorder();
    
}
public void displayOnePlayerHelp(){
 System.out.println();
 displayHelpBorder();
 System.out.println(
         "\t You have 115 points.\n\n"
         +"Your points is substructed when you make a move\n\n"
         +"Try to finish the game with just a few moves");
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


