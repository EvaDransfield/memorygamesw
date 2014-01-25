/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memorygamesw;
import javax.swing.JFrame;


/**
 *
 * @author KenandEva
 */

public class Board {
    
    
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
    public static void main(String args[]){
      Board canvas = new Board();
      JFrame frame= new JFrame (canvas.TITLE);
      
         
    }
}