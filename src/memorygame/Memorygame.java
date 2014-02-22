package memorygame;

import java.util.Scanner;

/**
 * @author Eva
 */
public class Memorygame {
    
    //instance variables below
    private static Player[] playerList;
    String name;
    String instructions = "Memory is the name of this game! \n\n"
            + "The purpose of the game is to clear the board of all cards \n\n"
            + "by matching each card with its \"twin\" when the board is \n\n"
            + "clear, the game is over. Good Luck! \n\n";
                 
    public static void main(String[] args) {
        Memorygame myGame= new Memorygame();
        myGame.getName();
        myGame.displayHelp();
        
         // linking class Views to main()
        MainMenuView mainMenu= new MainMenuView();
        mainMenu.getInput();
        
        CardView cardView= new CardView("hi", 1);
        cardView.showCard();
        
        CardControl cardControl= new CardControl();
        cardControl.playGame(); 
        
        Game runBestTimeCalculation = new Game(1);
        
        Player runTotalPoints = new Player();
        
        PlayerView onePlayerObject=new PlayerView();
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
    //week6 paired programming function
    public static void setPlayerList(Player[] playerList) {
        Memorygame.playerList = playerList;
    }
    
    
}
