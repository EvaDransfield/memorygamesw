/*
 * This class is done!
 */

package memorygame;

import java.util.Scanner;

/**
 * @author Eva
 */

public class Memorygame {
    
    //instance variables below
    private static Player[] playerList;
    String name;
    String instructions = "\n\t______________________________________________________________________"
                        + "\n\tMemory is the name of this game!"
                        + "\n\tThe purpose of the game is to clear the board of all cards by matching"
                        + "\n\teach card with its \"twin\" when the board is clear the game is over."
                        + "\n\tGood Luck!"
                        + "\n\t______________________________________________________________________";
                 
    public static void main(String[] args) {
        Memorygame myGame= new Memorygame();
        myGame.getName();
        myGame.displayHelp();
        
         // linking class Views to main()
        MainMenuView mainMenu= new MainMenuView();
        mainMenu.getInput();
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
    //week6 paired programming function
    public static void setPlayerList(Player[] playerList) {
        Memorygame.playerList = playerList;
    }    
}
