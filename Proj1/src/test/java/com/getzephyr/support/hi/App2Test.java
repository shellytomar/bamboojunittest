package com.getzephyr.support.hi;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class App2Test 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public App2Test( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( App2Test.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertEquals(2, 2);
    }
    
    public void testApp1() {
    	assertEquals(1, 1);
    }

    public void testApp2() {
    	assertEquals("mohan", "modhan");
    }
    
    public void testApp3() {
    	assertEquals("mohan", "mohsan");
    }
    public void testApp4() {
    	assertEquals("mohan", "mohan");
    }

}
