/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package memorygamesw;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mpianatra
 */
public class GameTest {
    
    public GameTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of setUpGameBoard method, of class Game.
     */
    @Test
    public void testSetUpGameBoard() {
        System.out.println("setUpGameBoard");
        Game instance = null;
        instance.setUpGameBoard();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUpCardDeck method, of class Game.
     */
    @Test
    public void testSetUpCardDeck() {
        System.out.println("setUpCardDeck");
        Game instance = null;
        instance.setUpCardDeck();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUpGameRules method, of class Game.
     */
    @Test
    public void testSetUpGameRules() {
        System.out.println("setUpGameRules");
        Game instance = null;
        instance.setUpGameRules();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculateBestTime method, of class Game.
     */
    @Test
    public void testCalculateBestTime() {
        System.out.println("calculateBestTime");
        int recordBest = 0;
        int newTime = 0;
        Game instance = null;
        instance.calculateBestTime(recordBest, newTime);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
