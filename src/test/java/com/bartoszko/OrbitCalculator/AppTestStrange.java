package com.bartoszko.OrbitCalculator;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTestStrange extends TestCase {
	
	
	
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTestStrange( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTestStrange.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}
