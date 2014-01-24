/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package memorygamesw;

/**
 *
 * @author KenandEva
 */
/* this class controls the game, update and draws it on the screen*/
public class Framework {
    /* first we will have variables frame width and height that will
    be used to store a size of panel that we will use to draw the game on.
    */
    
    // variable frame width.
    public static int frameWidth;
    //variale frame height.
    public static int frameHeight;
    /* Second we will have variable that holds time of one second in nanoseconds
    that will be used to get game time*/
        //Time of one second in nanoseconds.
        //1 seocnd = 1000000000nanoseconds
    public static final long secInNanosec=1000000000L;
  /* Game_FPS variable specifies how many times 
    per second the game shoud update?"*/
    private final int GAME_FPS=60;
    
    /* Somehopw we need variable(s) that holds the state 
    of the game (high score, and time)*/
}
