/*
 * 1.Paired Programming Assignment function is called calculateBestTime()
 * 2.Make a loop so that player can take a new turn.
 * 3.Make board sizes within the Board class, and call them into our Game.
 * 4. We need to create a timer so that we can get statistics for our game.
 */

package memorygame;

import java.lang.reflect.Array;
import java.util.Random;
import java.util.Scanner;

/*
 * @author michelecope
 */

public class Game {  

    public static final String ONE_PLAYER_GAME = "ONE_PLAYER";
    public static final String TWO_PLAYER_GAME = "TWO_PLAYER";
    
    public static final String NO_ACTIVE_GAME = "NO_GAME_STARTED";
    public static final String NEW_GAME = "NEW_GAME";
    public static final String PLAYING = "PLAYING"; 
    public static final String WINNER = "WINNER"; 
    public static final String TIE = "TIE"; 
    public static final String QUIT = "QUIT"; 
    public static final String ERROR = "ERROR";
    public static final String EXIT = "EXIT";
    
    public String gameType;
    public Player playerA;
    public Player playerB;
    public Player currentPlayer;
    public Player otherPlayer;
    public Player winner;
    public Player loser;
    public String status;
    public HelpMenuView gameRules;
    public Array gamePlayers;
    private final CardView[][]board;
    private final String[] words={"RED","RED","ORANGE","ORANGE","YELLOW","YELLOW","GREEN","GREEN","BLUE","BLUE","PURPLE","PURPLE","INDIGO","INDIGO","BLACK","BLACK","WHITE","WHITE","GRAY","GRAY","BROWN","BROWN","PINK","PINK","TURQOUISE","TURQOUISE","AQUA","AQUA","MAROON","MAROON","LIME","LIME","VIOLET","VIOLET","AMBER","AMBER"};
    private final Random randomCard;
    private final Scanner getInput;
    int card;
    int cardChoice1;
    int cardChoice2;
    int gameMove=0;// the player move
    boolean matched = false;
    
    public Game(){ //start game
        randomCard = new Random();
        getInput = new Scanner(System.in);
        board = new CardView[6][6];// create a 4x4 matrix that can hold CardControl Objects
        shuffle();
        setCells ();
        printCells();
        playGame();
        //this.calculateBestTime(55.55,235.55);
         /* EVA!!! you should be able to replace the numbers in 
        the parenthesis with any numbers and our function should output correctly, run it to check.
        */
        //this.calculateFactorial(5);
        //this.calculateHappiness(12, 4);
    }
    
    public Game(String gameType) {
        randomCard = new Random();
        getInput = new Scanner(System.in);
        board = new CardView[6][6];// create game "board"
        playerA = new Player();
        playerB = new Player();
        shuffle();
        setCells ();
        printCells();
        playGame();
        //this.calculateBestTime(55.55,235.55);
    }
      
    //this function will call all functions to play the game
    public void playGame(){
       choosePairOfCards();
    }
    
    public void choosePairOfCards(){
        int row1, col1, row2, col2;
        System.out.println();
        System.out.println("Enter the number on the card.");
        System.out.print("First Card Choice?>");
        cardChoice1 =getInputAsInt();
        gameMove++; //
        row1=cardChoice1/6;
        col1=cardChoice1%6;
        board[row1][col1].setShowingStatus();
        System.out.print("Second CardView Choice?>\n");
        cardChoice2 =getInputAsInt();
        row2=cardChoice2/6 ;
        col2=cardChoice2%6;
        board[row2][col2].setShowingStatus();
       
        System.out.print('\u000C'); // Clear the screen
        printCells();
        matchedCards(row1, col1, row2, col2);
        
    }
    
        // check the card to see if the "cards" match
        // if they don't call each card's setShowingStatus to "flip" them
    public void matchedCards(int row1, int col1, int row2, int col2){
        if(board[row1][col1].back == board[row2][col2].back){
            matched = true;
            board[row1][col1].matched = true;
            board[row2][col2].matched = true;
            System.out.println("You made a match!");
            board[row1][col1].setShowingStatus();
            board[row2][col2].setShowingStatus();
        }
        else 
            board[row1][col1].setShowingStatus();
            board[row2][col2].setShowingStatus();
   }
   
   public void setCells (){
       card = 0;//the front of the card
       for (int row=0; row<board.length;row++){
           for (int col=0; col<board[0].length;col++){
               {
               board[row][col]=new CardView (words[card],card); // create a new card object
               card++;
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
            String temp = words[card];
            words[card] = words[pos];
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

