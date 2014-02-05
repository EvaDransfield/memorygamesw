/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package memorygamecontrols;

import java.util.Scanner;
import memorygameviews.HelpMenuView;
/**
 *
 * @author KenandEva
 */
public class Memorygamesw {
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
        Memorygamesw myGame = new Memorygamesw();
       
        myGame.getName();
        myGame.displayHelp();
        Game runBestTimeCalculation = new Game(1); /* this line makes our game capable of running
        the calculateBestTime function */
 
         //Eva is linking the onePlayer class to main.
        SelectPlayerControl2 onePlayerObject=new SelectPlayerControl2();
        onePlayerObject.getWinningScore(200,false);
        // HelpMenucntrol class linking
         HelpMenuControl rundisplayGameObjective= new HelpMenuControl();
        
    }
    
    //The method or function below asks the SelectPlayerControl2 to input their name
    public void getName() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        this.name = input.next(); 
    }
    
    //The method or funtion below displays the Players name 
    //along with the game instructions.
    public void displayHelp() {
        System.out.println("+\nWelcome " + this.name + "\n");
        System.out.println(this.instructions);
    }
}
