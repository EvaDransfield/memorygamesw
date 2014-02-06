/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package memorygame;

/**
 *
 * @author KenandEva
 */
/* this class controls the game, update and draws it on the screen*/

// I changed the class name to onePlayer, we can move back later.
// When paying with one player users will compete with the time.
// the Game will set for 100 seconds
// The game is a win if time: t<50
// The game is a ties if time : 50<t<100
// The game is a lose if time : t>100

// Eva's individual assignment lesson 3
public class SelectPlayerControl {
    double startingPoints=115.00;
    int gameMove;
    boolean cards;// true if cards matches, false if not.
    
  

    public void setGameMove(int gameMove) {
        this.gameMove = gameMove;
    }

    public void setCards(boolean cards) {
        this.cards = cards;
    }
    
       
    public void getWinningScore(int gameMove, boolean cards){
        
        int score= (int) (startingPoints)-gameMove;// cast double to int
                    if ((cards==true)&&(gameMove==15)){
        System.out.println("you win perfect score!: " +score+" points\n");
        }
        else if  ((cards==true) && (gameMove<115)){
            System.out.println("you win  "+score+" points\n");
                }
                
        else if((cards==false) && (gameMove==115)){
            System.out.println("you loose! "+ score+" points\n");
                }
        else if((cards==true) && (gameMove<=0)){
            System.out.println("invalid input\n");
                }
        else if((cards==false) && (gameMove>115)){
            System.out.println("invalid input\n");
                }
                    
    }
}
