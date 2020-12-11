/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.poznan.put.gol.game;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author damia
 */
public class ConwaysCellTest {
    
    public ConwaysCellTest() {
    }
    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
    /**
     * Test of neighbors method, of class ConwaysCell.
     */
    @org.junit.jupiter.api.Test
    public void testNeighbors() {
        System.out.println("neighbors");
        ConwaysCell instance = new ConwaysCell(1,1);
        Cells expResult = new Cells(
                new ConwaysCell(0,0),
                new ConwaysCell(0,1),
                new ConwaysCell(0,2),
                new ConwaysCell(1,0),
                new ConwaysCell(1,2),
                new ConwaysCell(2,0),
                new ConwaysCell(2,1),
                new ConwaysCell(2,2)
        );
        Cells result = instance.neighbors();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of Equals method, of class ConwaysCell.
     */

    @org.junit.jupiter.api.Test
    public void testEquals()
    {
        System.out.println("testEquals");
        ConwaysCell instance = new ConwaysCell(2,1);
        ConwaysCell instance1 = new ConwaysCell(2,1);
        ConwaysCell instance2 = new ConwaysCell(0,1);
        String expResult = instance1.toString();
        String result = instance.toString();
        assertEquals(expResult, result);
        assertNotEquals(instance2.toString(), result);
        assertTrue(instance != instance1);
        assertFalse(instance == instance1);
    }
    
}
