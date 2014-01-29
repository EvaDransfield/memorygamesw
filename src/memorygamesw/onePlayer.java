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
//


// I changed the class name to onePlayer, we can move back later.
// When paying with one player users will compete with the time.
// the Game will set for 100 seconds
// The game is a win if time: t<50
// The game is a ties if time : 50<t<100
// The game is a lose if time : t>100

public class onePlayer {
    int time=30;
    boolean cards=true;// true if cards matches, false if not.
    int player;// 1 or 2 user inmput.
 
    public double getWinningTime(time){
                // the player will win the game if the game is finished in 160seconds
              
        if ((50<time)&&(cards=true)){
        System.out.println("you win the the game in" +time+"seconds");
     }
       
        if ((time>50)&&(time<100)&&(card=true)
        System.out.println("you win the the game in" +time+"seconds");
    }  
         // the player will lose the gane if the game isn't finished 
        //and the time is out
        if ((time>=160)&&(cars=false)){
        System.out.println ("You loose!");
    }
        public double getWinningScore(score){
       double score=100-time;// the score is based on time spent
       //on the game till wining
       System.out.println("your score is"+score);
        }
               
          }   


