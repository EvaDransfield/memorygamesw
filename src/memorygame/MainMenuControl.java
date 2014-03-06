/*
 * This class is done!
 */

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
    
    public void startGame(long noPlayers) {
                
        if (noPlayers != 1  &&  noPlayers != 2) {
            new MemoryGameError().displayError("startGame - invalid number of players specified.");
            return;
        }
        
        Game game;
        if (noPlayers == 1) {
         new OptionsMenuView().getInput();
            //game = this.createGame(Game.ONE_PLAYER_GAME);
        }
        else {
            game = this.createGame(Game.TWO_PLAYER_GAME);
        }

     /*   GameMenuView gameMenu = new GameMenuView(game);
        gameMenu.getInput();*/
    }
    
        private Game createGame(String gameType) {
        Game game = null;
        Player playerA = null;
        Player playerB = null;
        
        if (gameType == null) {
            new MemoryGameError().displayError("MainCommands - create: gameType is null");
            return null;
        }
        
        if (gameType.equals(Game.ONE_PLAYER_GAME)) {
            game = new Game(Game.ONE_PLAYER_GAME);
            playerA = new Player(Player.MAIN_USER);
            playerA.name = "Player 1";
        }
        else if (gameType.equals(Game.TWO_PLAYER_GAME)) {
            game = new Game(Game.TWO_PLAYER_GAME);
            playerA = new Player(Player.MAIN_USER);
            playerA.name = "Player 1";
            playerB = new Player(Player.SECOND_USER);
            playerB.name = "Player 2";

        }

        // save the two players created as the default players of the game
        game.playerA = playerA;
        game.playerB = playerB; 
        
        // set the game status to game not yet in playing mode
        game.status = Game.NO_ACTIVE_GAME;
        
        return game;
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
    
   /* public void displayOptionsMenu() {
        OptionsMenuView optionsMenuView = new OptionsMenuView();
        optionsMenuView.getInput();
    }
    */
    
    public void displayStatistics(){
        Game game = new Game();
        game.getTotalPoints();
    }
}

