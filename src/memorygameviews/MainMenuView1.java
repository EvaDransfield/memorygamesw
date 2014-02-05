/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memorygameviews;
import javax.swing.JFrame;


/**
 *
 * @author KenandEva
 */
// first appears to the screen
// this is what you see when first open the program
// the main menu will have: Easy, Normal, and hard option
public class MainMenuView1 {
    
    
       // create frame for the window,
    // I use static final because those varibale will never gonna change 
    public static final int width=320;// can be changed 
    public static final int height= width/12*9;
    public static final int scale = 2;
    public final String TITLE = "MEMORY GAME";
       
   // private or public start, stop, and pause.  I changed run to pause because I think run and start are the same thing. MC
  
    private void start(){
}
    private void stop(){
}
    private void pause(){
            
}
}