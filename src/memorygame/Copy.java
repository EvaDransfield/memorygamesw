/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication2;

/**
 *
 * @author Mpianatra
 */

    public class Carde {
    boolean showing;// true of false if the hiden card is showing
    String back; // the hiden symbol at the back of the card
    int front; //The font of the card 
    //private String symbol;
    
    
    
    // constractor 
    public Carde(String theBack, int theFront)
    {showing=false; // hidden symbole showing the back
    back=theBack;
    front=theFront;
    }
    public void showCard()
    {if (showing)
        System.out.print(String.format("%10s",back));
    else
        System.out.print(String.format("%10s","["+front+"]"));
    
    }
    public void setShowingStatus()// this method flips the card from showing to not showing
    {if (showing)
        showing=false;
    else 
        showing = true;

    }
    
}
//////////////////////////////////////////////////////////////
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication2;

import java.lang.reflect.Array;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Mpianatra
 */
public class MemoryGame {
       // declare here 
    private Carde[][]board;
    private String[]words={"Blue","Blue","Red","Red","Green","Green","Yellow","Yellow","Pink","Pink","Purple","Purple","Mena","Mena","Maintso","Maintso"};
    private Random r;
    private Scanner reader;
    int a;
       
     // initialize here
   MemoryGame()
   { 
       r=new Random();
       reader =new Scanner(System.in);
       board=new Carde[4][4];// create a 4x4 matrix that can hold Carde Objects
       shuffle();
       setCells ();
       printCells();
       playGame();
   }
   public void playGame()
   {
       choosePairOfCards();
   }
   public void choosePairOfCards()
   {
       int cardChoice, row1, col1, row2, col2;
       System.out.println();
       System.out.println("Enter the number on the card.");
       System.out.print("First Card Choice?>");
       cardChoice =getInputAsInt();
       row1=cardChoice/4 ;
       col1=cardChoice%4;
       board[row1][col1].setShowingStatus();
       
       System.out.print('\u000C'); // Clear the screen
       printCells();
       // check the card to see if the "cards" match
       // if they don't call each card's setShowingStatus to "fip" them
   
                   
   }
   public void setCells ()
   {
   //int a=0;
   for (int row=0; row<board.length;row++)
   {
   for (int col=0; col<board[0].length;col++)
    {
       {
           board[row][col]=new Carde (words[a],a); // create a new card object
           a++;
       }
     }
   }
   }
   public void printCells()
   {
       Carde aCard;
       for (int row=0; row<board.length;row++)
       {
           for (int col=0; col<board[0].length;col++)
           {
                 aCard=board[row][col];
                 aCard.showCard();
           
            }
       System.out.println();
       }
           
    }

public void shuffle()
{
     
for (int a=0; a<words.length;a++);
{
    int pos = r.nextInt(words.length);
    String temp = words[a];
    words[a]=words[pos];
    words[pos]=temp;
    
}
}


public int getInputAsInt()
{
    String temp = reader.nextLine();
    return Integer.parseInt(temp); // example Integer.parseInt("34")returns the value of 34 integer
   

}
public String getInputAsString(){
    return reader.nextLine();
}           
    
}
