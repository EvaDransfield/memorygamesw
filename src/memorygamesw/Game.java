/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//Paired Programming Assignment function is called calculateBestTime()

package memorygamesw;

import java.lang.reflect.Array;

/*
 * @author michelecope
 */
public class Game {

    public Board gameBoard;
    public CardDeck gameDeck;
    public Help gameRules;
    public Array gamePlayers;
    
    public Game(int numberOfPlayers){ //start game

        this.setUpGameBoard(); //create board
        this.setUpCardDeck(); //set up cards on board 
        this.setUpGameRules(); 
        this.calculateBestTime(55.55,235.55);  
         /* EVA!!! you should be able to replace the numbers in 
        the parenthesis with any numbers and our function should output correctly, run it to check.
        */
    }
    
    public void setUpGameBoard(){
        
    }
    
    public void setUpCardDeck(){
        
    }
    
    public void setUpGameRules() {
        
    }
    
 //paired programming assignment
    
//    int recordBest = 120; set 120 seconds as record time so we could test this function
//    int newTime = 90; set the new game time as 90
//    int secondsBehind; used to calculate how many seconds behind best record the new game time is
//    int secondsAhead; used to calculate how many seconds ahead best record the new game time is
 
 
 public void calculateBestTime(double recordBest, double newTime) {
    
    int secondsBehind;
    int secondsAhead;
    
    if(((recordBest <= 0)&&(newTime <= 0))||(newTime <= 0)) 
        System.out.println("Invalid Time. \n");
    
    else if (recordBest == 0) {
        System.out.println(+newTime + " Game Time \n");
        System.out.println("New Record!");
    }
    
    else if (recordBest < newTime) {
        secondsBehind = (int) (newTime - recordBest);
        System.out.println(+newTime + " Game Time \n");
        System.out.println(+ secondsBehind+ " seconds behind the current record time. \n");
    }
    
    else if (recordBest > newTime) {
       secondsAhead = (int) (recordBest - newTime);
       System.out.println(+newTime + " Game Time \n");
       System.out.println("New Record! " +secondsAhead+ " seconds ahead of previous record time. \n");
    }
    
    else if (recordBest == newTime) {
        System.out.println(+newTime + " Game Time \n");
        System.out.println("Tied Game Record! \n");
    }
  
 }
}

