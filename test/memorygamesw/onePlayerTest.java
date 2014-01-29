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
 * @author KenandEva
 */
public class onePlayerTest {
    
    public onePlayerTest() {
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
     * Test of getWinningTime method, of class onePlayer.
     */
    @Test
    public void testGetWinningTime() {
        System.out.println("getWinningTime");
        time = null;
        onePlayer instance = new onePlayer();
        double expResult = 0.0;
        double result = instance.getWinningTime(<error>);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWinningScore method, of class onePlayer.
     */
    @Test
    public void testGetWinningScore() {
        System.out.println("getWinningScore");
        score = null;
        onePlayer instance = new onePlayer();
        double expResult = 0.0;
        double result = instance.getWinningScore(<error>);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
