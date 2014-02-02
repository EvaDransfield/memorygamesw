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
        this.calculateFactorial(5);
        this.calculateHappiness(12, 4);
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
 
 public void calculateFactorial(int number) {
     if (number < 0 || number > 70) {
         System.out.println("Invalid number.");
     }
     if (number < 70 && number > 0) {
         long num = (long) (number);
         long factorial = 1;
         
         for(int i = 1; i < number; i++) {
             if(i == 1) {
                 factorial = num * (num - i);
             } else {
                 factorial *= num - i;
             }
         }
         
         System.out.println("The factorial is: " + factorial);
     }
 }
 
 public void calculateHappiness(int totalWins, int totalLosses) {
     if (totalWins == 0 || totalLosses == 0) {
         System.out.println("Insufficient Data.");
     } else if (totalWins > totalLosses) {
         System.out.println("Yay! You're winning more than you're losing, you "
                 + "must be happy.\nTotal wins: " + totalWins);
     } else if (totalWins < totalLosses) {
         System.out.println("You're losing more games than you're winning, you "
                 + "must be sad.");
     } else if (totalWins == totalLosses) {
         System.out.println("Games won: " + totalWins +"\nTotal Lost: " 
                 + totalLosses + "\nIts a tie!");
     }
 }
}

