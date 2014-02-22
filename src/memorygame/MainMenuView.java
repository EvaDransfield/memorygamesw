/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memorygame;
import java.util.Scanner;




/**
 *
 * @author Eva
 */
// first appears to the screen
// this is what you see when first open the program
// the main menu will have: Easy, Normal, and hard option
public class MainMenuView {
    
    
       // create frame for the window,
    // I use static final because those varibale will never gonna change 
    
    public static final int width=320;// can be changed 
    
    public static final int height= width/12*9;
    
    public static final int scale = 2;
    
    private static final String[][] menuItems = {
        {"N", "Enter player names"},
        {"1", "One player game"},
        {"2", "Two player game"},
        {"H", "Help"},
        {"O", "Options"},
        {"X", "Exit Memory Game"},
    }; 
    
  // instance of main menu
   MainMenuControl mainMenuControl=new MainMenuControl();
   
   // construtor
   public MainMenuView(){  }
   
   // get user input
   public void getInput()   {
       String command;
       Scanner inFile=new Scanner(System.in);
       do {
           this.display();//display the menu 
           
           // get command entered
           command= inFile.nextLine();
           command=command.trim().toUpperCase();
          
           
           switch (command) {
                case "N":
                    this.mainMenuControl.createPlayerList();
                    break;
                case "1":
                    this.mainMenuControl.startGameOnePlayer();
                    break;
                case "2":
                    this.mainMenuControl.startGameTwoPlayer();
                    break;
                case "H":
                    this.mainMenuControl.displayHelpMenu();
                    break;
                case "O":
                    this.mainMenuControl.displayOptionsMenu();
                    break;
                case "X":
                    this.mainMenuControl.quitGame();
                    break;
                 
                default: 
                    new MemoryGameError().displayError("Invalid command. Please enter a valid command.");
                 continue;                    
            }
        } while (!command.equals("X"));

        return;
   }
      public final void display() {
        System.out.println("\n\t-------------------------------------------------------------------------");
        System.out.println("\tEnter the letter associated with one of the following commands:");

        for (int i = 0; i < MainMenuView.menuItems.length; i++) {
            System.out.println("\t   " + menuItems[i][0] + "\t" + menuItems[i][1]);
        }
        System.out.println("\t-------------------------------------------------------------------------\n");
    }
}
        
       
   
    

