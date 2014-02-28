/* This class creates the card board array mentioned in the CardDeck class
*  I'm not sure what else it will need to do.
*/
package memorygame;

/**
 * @author Cope-Michele
 */

public class CardView {
    
    boolean showing;// true or false if the hidden card is showing
    boolean matched; // tells whether or not a card is matched
    String back; // the hiden symbol at the back of the card
    int front; //The font of the card 
    //private String symbol;
  
    // constractor 
    public CardView(String theBack, int theFront) {
        showing = false; // showing refers to the back of the cards matching symbol
        matched = false;
        back = theBack;
        front = theFront;
    }
       
    public void showCard(){
        if (showing)
        System.out.print(String.format("\t%10s","["+back+"]"));
    else
        System.out.print(String.format("\t%10s","["+front+"]"));
    }
    
    public void setShowingStatus(){// this method flips the card from showing to not showing
        if (showing)
        showing=false;
    else 
        showing = true;
    }
}