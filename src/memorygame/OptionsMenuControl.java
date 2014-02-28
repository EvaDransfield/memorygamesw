/*
 * This class is done!
 */

package memorygame;

/**
 * @author michelewhite
 */
    public class OptionsMenuControl {
    
        public OptionsMenuControl(){
    
        }
    
        public void displayNumberCards(){
            System.out.println();
            displayOptionsBorder();
            System.out.println("\t You have selected to play a game using cards that have number faces.\n");
             new Game().playGame(); 
            // game = this.createGame(Game.ONE_PLAYER_GAME);
        }
    
        public void displayColorCards(){
            System.out.println();
            displayOptionsBorder();
            System.out.println("\t You have selected to play a game using cards that have color faces.\n");
        }
        
        public void displayOptionsBorder (){
            System.out.println(
            "\n\t______________________________________________________________________");
    }
}