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

    //start game
    //create board
    //set up cards on board
    //start timer
    //player plays game
}

