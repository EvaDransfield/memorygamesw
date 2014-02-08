/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package memorygame;

/**
 *
 * @author michelewhite
 */
public class OptionsMenuControl {
    
    public OptionsMenuControl(){

    }

    public void displayOnePlayer(){
        System.out.println();
        displayOptionsBorder();
        System.out.println("\t You have selected to play a One Player Game.");
    }
    
    public void displayTwoPlayer(){
        System.out.println();
        displayOptionsBorder();
        System.out.println("\t You have selected to play a One Player Game.");
    }
    
    public void displayNumberCards(){
        System.out.println();
        displayOptionsBorder();
        System.out.println("\t You have selected to play a game using cards that \n\n "
                + "have number faces.");
    }
    
    public void displaySymbolCards(){
        System.out.println();
        displayOptionsBorder();
        System.out.println("\t You have selected to play a game using cards that \n\n"
                + "have symbol faces.");
    }
        
    public void displayOptionsBorder (){
    System.out.println(
    "\n\t-------------------------------------------------------------------------\n");
}
}