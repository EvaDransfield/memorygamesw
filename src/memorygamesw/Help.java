/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package memorygamesw;

/**
 *
 * @author Cope-Michele
 */
public class Help {
    //Instructions
    public String rules = "This will display the Game Rules";
    //Objective
    public String objective = "This will display the Game Objective";

public void displayHelp() {
        System.out.println(this.rules);
        System.out.println(this.objective);
    }
}
