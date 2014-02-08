/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package memorygame;

/**
 *
 * @author michelewhite
 */
public class MemoryGameError {
        public Object displayError(Object object) {
        String message = (String) object;
        System.out.println("\t-------------------------------------------------------------------------");
        System.out.println("\t ERROR: Uh-Oh, Something isn't right!" + message);
        System.out.println("\t-------------------------------------------------------------------------");
        return null;
    }
}
