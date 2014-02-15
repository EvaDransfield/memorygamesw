/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package memorygame;

/**
 *
 * @author Cope-Michele
 */
public class CardView {
    
    boolean showing;// true of false if the hiden card is showing
    String back; // the hiden symbol at the back of the card
    int front; //The font of the card 
    //private String symbol;
    
    
    
    // constractor 
    public CardView(String theBack, int theFront)
    {
        showing = false; // hidden symbole showing the back
        back = theBack;
        front = theFront;
    }
    
    private final CardControl cardControl = new CardControl(); 
    
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
    
    /*private int width = 2;
    private int height = 3;
    private String symbol;
   

    
    public CardView(String symbol) {
        this.symbol = symbol;
    }

    /**
     * @return the width
     */
    /*public int getWidth() {
    //    return width;
    }
    */

    /**
     * @param width the width to set
     */
    /*public void setWidth(int width) {
    //    this.width = width;
    }
`   */
    /**
     * @return the height
     */
    /*public int getHeight() {
    //    return height;
    }
*/
    /**
     * @param height the height to set
     */
    /*public void setHeight(int height) {
    //    this.height = height;
    }
*/
    /**
     * @return the symbol
     */
    /*public String getSymbol() {
    //    return symbol;
    }
*/
    /**
     * @param symbol the symbol to set
     */
    /* public void setSymbol(String symbol) {
    //    this.symbol = symbol;
    }

}
*/