package memorygame;

import java.util.Scanner;

/**
 * @author Mpianatra
 */
public class MainMenuControl {
    
    public void createPlayerList() {
        PlayerView playerView = new PlayerView();
        String[] playerNameList = playerView.getInput();
        
        // creates and adds players to list
        Player[] playerList = new Player[playerNameList.length];
                               
        for (int i = 0; i < playerList.length; i++) {
            String playersName = playerNameList[i];
            Player newPlayer = new Player();
            newPlayer.name = playersName;
            playerList[i] = newPlayer;          
        }
        
        Memorygame.setPlayerList(playerList);
        
    }

   public void startGameOnePlayer() {       
        this.displayCard();                
        }
   public void startGameTwoPlayer(){
        System.out.println("\n\t A game for two player will show here");
        }      
   public String quitGame() {
        System.out.println("\n\tAre you sure you want to quit? (Y or N)");
        Scanner inFile = new Scanner(System.in);
        String answer = inFile.next().trim().toUpperCase();
        if (answer.equals("Y")) {
            return Game.EXIT;
        }

        return Game.PLAYING;
    }
    
   //displays other menu's
    public void displayHelpMenu() {
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.getInput();
    }
    
    public void displayOptionsMenu() {
        OptionsMenuView optionsMenuView = new OptionsMenuView();
        optionsMenuView.getInput();
    }
    public void displayStatistics(){
        Player player = new Player();
        player.getTotalPoints();
    }
    public void displayCard(){
    CardView cardView=new CardView();
    cardView.showCard();
    }
}

