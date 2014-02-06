/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*package memorygame.views;
import java.util.Scanner;
import javax.swing.JFrame;
import memorygame.controls.MainMenuControl;
import memorygame.controls.MemoryGameError;


/**
 *
 * @author KenandEva
 */
// first appears to the screen
// this is what you see when first open the program
// the main menu will have: Easy, Normal, and hard option
    //public class MainMenuView {
    
    
       // create frame for the window,
    // I use static final because those varibale will never change 
    /*
    public static final int width=320;// can be changed 
    
    public static final int height= width/12*9;
    
    public static final int scale = 2;
    
    private static final String[][] menuItems = {
        {"N", "Enter Name"},
        {"1", "One player game"},
        {"2", "Two player game"},
        {"E","Easy"},
        {"M","Medium"},
        {"A", "Advance"},
        {"H", "Help"},
        {"X", "Exit Memory Game"},
    }; 
  
   MainMenuControl mainMenuControl=new MainMenuControl();
   public MainMenuView(){
       
   }
   public void getInput()   {
       string command;
       Scanner inFile=new Scanner(System.in);
       do {
           this.display();//display the menu 
           
           // get command entered
           command= inFile.nextLine();
           command=command.trim().toUpperCase;
           
           
           switch (command) {
                case "N":
                    this.mainMenuControl.createPlayerList();
                    break;
                case "1":
                    this.mainMenuControl.startGame(1);
                    break;
                case "2":
                    this.mainMenuControl.startGame(2);
                    break;
                 case "E":
                    this.mainMenuControl.startGame();
                    break; 
                 case "M":
                    this.mainMenuControl.startGame();
                    break; 
                 case "A":
                    this.mainMenuControl.startGame();
                    break;
                case "H":
                    this.mainMenuControl.displayHelpMenu();            
                    break;
                case "X":
                    break;
                default: 
                    new MemoryGameError().displayError("Invalid command. Please enter a valid command.");
                 continue;                    
            }
        } while (!command.equals("X"));

        return;
   }
}
    */
