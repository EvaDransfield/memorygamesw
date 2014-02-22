package memorygame;

/**
 * @author KenandEva
 * this class creates our Player Object, kind of like the little silver pieces 
 * used to mark a player on the board in Monopoly
 */

// Eva's individual assignment lesson 3
public class Player {
    
    public String name;
    
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
