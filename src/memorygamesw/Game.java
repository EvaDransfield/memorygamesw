/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package memorygamesw;

import java.lang.reflect.Array;

/**
 *
 * @author michelecope
 */
public class Game {
    public Board gameBoard;
    public CardDeck gameDeck;
    public Help gameRules;
    public Array gamePlayers;
    
    public Game(int numberOfPlayers){
        this.setUpGameBoard();
        this.setUpCardDeck();
        this.setUpGameRules();
    }
    
    public void setUpGameBoard(){
        
    }
    
    public void setUpCardDeck(){
        
    }
    
    public void setUpGameRules() {
        
    }

 //paired programming assignment
 private static int recordBest = 120;
 private static int newTime = 90;
 private int newRecordBest;
 
 public static void calculateBestTime (recordBest, newTime) {
    if (recordBest &&|| newTime == 0 || newTime < 0) 
    System.out.println("Invalid Time."); 
    
    if (recordBest > newTime)
    System.out.println("____ behind the current record time.");
    
    if (recordBest < newTime)
    System.out.println("New Record! ____ ahead of previous record time.");
    
    if (recordBest is N/A)
    System.out.println("New Record! 0 ahead of previous record time.");
    
    if (recordBest == newTime)
    System.out.println("New Record!");
}      
    //start game
    //create board
    //set up cards on board
    //start timer
    //player plays game
}

