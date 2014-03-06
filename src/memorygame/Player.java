/*
 * This class should include all of the statistic functions because those are all 
 * dependant on instances of the Player class.  So we need to make sure to 
 * move and statistic functions that are in other classes to this class.
 */

package memorygame;

import java.io.Serializable;
/**
 * @author KenandEva
 * this class creates our Player Object, kind of like the little silver pieces 
 * used to mark a player on the board in Monopoly
 */

// Eva's individual assignment lesson 3
// Paired Programming Assignment Lesson 8
public class Player implements Serializable {
    
    public static final String MAIN_USER = "USER_ONE";
    public static final String SECOND_USER = "USER_TWO";
    public String name;
        
    private int gameMove;
    private String playerType;
    private long wins = 0;
    private long losses = 0;
    private long ties = 0;
    
    public Player(){
//        this.getTotalPoints();
        
    }
    
    public Player (String userType){
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGameMove() {
        return gameMove;
    }

    public void setGameMove(int gameMove) {
        this.gameMove = gameMove;
    }

    public String getPlayerType() {
        return playerType;
    }

    public void setPlayerType(String playerType) {
        this.playerType = playerType;
    }

    public long getWins() {
        return wins;
    }

    public void setWins(long wins) {
        this.wins = wins;
    }

    public long getLosses() {
        return losses;
    }

    public void setLosses(long losses) {
        this.losses = losses;
    }

    public long getTies() {
        return ties;
    }

    public void setTies(long ties) {
        this.ties = ties;
    }

}