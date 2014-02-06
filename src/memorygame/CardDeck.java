/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package memorygame;

import java.lang.reflect.Array;

/**
 *
 * @author michelewhite
 */
public class CardDeck {
    private Array cards;
    private int numberOfCards = 30;
   
    public CardDeck() {
        
    }
    
    public CardDeck(int numberOfCards) {
        this.numberOfCards = numberOfCards;
    }

    /**
     * @return the cards
     */
    public Array getCards() {
        return cards;
    }

    /**
     * @return the numberOfCards
     */
    public int getNumberOfCards() {
        return numberOfCards;
    }

    /**
     * @param numberOfCards the numberOfCards to set
     */
    public void setNumberOfCards(int numberOfCards) {
        this.numberOfCards = numberOfCards;
    }
}
