/*
 * 1.Paired Programming Assignment function is called calculateBestTime()
 * 2.We need to add all functions that run our actual game to this class.
 * 3. We need to make sure the function to playGame works
 * 4. Create function that checks to see if a match has been made
 * 5. We need to create a timer so that we can get statistics for our game.
 */

package memorygame;

import java.lang.reflect.Array;
import java.util.Random;
import java.util.Scanner;

/*
 * @author michelecope
 */

public class Game {  
    // What are all of these strings for?
    public static final String EXIT = "EXIT";
    public static final String PLAYING = "PLAYING"; 
    public static final String QUIT = "QUIT"; 
    public static final String ONE_PLAYER = "ONE_PLAYER";
    public static final String TWO_PLAYER = "TWO_PLAYER";
    
    public CardDeck gameDeck;
    public HelpMenuView gameRules;
    public Array gamePlayers;
    private final CardView[][]board;
    private final String[] words={"RED","RED","ORANGE","ORANGE","YELLOW","YELLOW","GREEN","GREEN","BLUE","BLUE","PURPLE","PURPLE","INDIGO","INDIGO","BLACK","BLACK","WHITE","WHITE","GRAY","GRAY","BROWN","BROWN","PINK","PINK","GRASS GREEN","GRASS GREEN","SKY BLUE","SKY BLUE","MAROON","MAROON"};
    private final Random randomCard;
    private final Scanner getInput;
    int a;//what does a refer to?
    int gameMove=0;// guess the player move
    
    public Game(){ //start game
        randomCard = new Random();
        getInput = new Scanner(System.in);
        board = new CardView[4][4];// create a 4x4 matrix that can hold CardControl Objects
        shuffle();
        setCells ();
        printCells();
        playGame();
        this.calculateBestTime(55.55,235.55);
         /* EVA!!! you should be able to replace the numbers in 
        the parenthesis with any numbers and our function should output correctly, run it to check.
        */
        //this.calculateFactorial(5);
        //this.calculateHappiness(12, 4);
    }
    
    //this function will call all functions to play the game
    public void playGame(){
       choosePairOfCards();
    }
    
    public void choosePairOfCards(){
        int cardChoice, row1, col1, row2, col2;
        System.out.println();
        System.out.println("Enter the number on the card.");
        System.out.print("First Card Choice?>");
        cardChoice =getInputAsInt();
        gameMove++; //
        row1=cardChoice/4 ;
        col1=cardChoice%4;
        board[row1][col1].setShowingStatus();
        System.out.print("Second CardView Choice?>");
        cardChoice =getInputAsInt();
        row2=cardChoice/4 ;
        col2=cardChoice%4;
        board[row2][col2].setShowingStatus();
       
        System.out.print('\u000C'); // Clear the screen
        printCells();
        // check the card to see if the "cards" match
        // if they don't call each card's setShowingStatus to "fip" them
    }
   
   public void setCells (){
       a = 0;//the front of the card
       for (int row=0; row<board.length;row++){
           for (int col=0; col<board[0].length;col++){
               {
               board[row][col]=new CardView (words[a],a); // create a new card object
               a++;
               }
           }
       }
   }

   public void printCells(){
       for (int row=0; row<board.length;row++){
           for (int col=0; col<board[0].length;col++){
                board[row][col].showCard();
            }
       System.out.println();
       }    
   }
    
    //Eva individual assignment lesson 6   
    public void shuffle(){
        for(int a=0; a < words.length;a++);{
            int pos = randomCard.nextInt(words.length);
            String temp = words[a];
            words[a] = words[pos];
            words[pos] = temp;
        }
    }

    public int getInputAsInt(){
        String temp = getInput.nextLine();
        return Integer.parseInt(temp); // example Integer.parseInt("34")returns the value of 34 integer
    }

    public String getInputAsString(){
        return getInput.nextLine();
    }
    
    // Paired Programming Assignment
    public void calculateBestTime(double recordBest, double newTime){
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
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 /*public void calculateFactorial(int number) {
 *    if (number < 0 || number > 70) {
 *        System.out.println("Invalid number.");
 *    }
 *   if (number < 70 && number > 0) {
 *        long num = (long) (number);
 *        long factorial = 1;
 *        
 *        for(int i = 1; i < number; i++) {
 *            if(i == 1) {
 *                factorial = num * (num - i);
 *            } else {
 *                factorial *= num - i;
 *            }
 *        }
 *
 *
 *        System.out.println("The factorial is: " + factorial);
 *    }
 *}
 *
 *public void calculateHappiness(int totalWins, int totalLosses) {
 *    if (totalWins == 0 || totalLosses == 0) {
 *        System.out.println("Insufficient Data.");
 *   } else if (totalWins > totalLosses) {
 *        System.out.println("Yay! You're winning more than you're losing, you "
 *                + "must be happy.\nTotal wins: " + totalWins);
 *    } else if (totalWins < totalLosses) {
 *        System.out.println("You're losing more games than you're winning, you "
 *                + "must be sad.");
 *   } else if (totalWins == totalLosses) {
 *        System.out.println("Games won: " + totalWins +"\nTotal Lost: " 
 *                + totalLosses + "\nIts a tie!");
 *    }
 *}
 */
}

