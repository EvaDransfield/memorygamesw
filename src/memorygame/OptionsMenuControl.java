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
    
    public void displayNumberCards(){
        System.out.println();
        displayOptionsBorder();
        System.out.println("\t You have selected to play a game using cards that have number faces.\n");
    }
    
    public void displayColorCards(){
        System.out.println();
        displayOptionsBorder();
        System.out.println("\t You have selected to play a game using cards that have color faces.\n");
    }
        
    public void displayOptionsBorder (){
    System.out.println(
    "\n\t-------------------------------------------------------------------------\n");
}
}