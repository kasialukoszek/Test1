package de.philulay.jenkinsbeispiel;

import de.philulay.jenkinsbeispiel.Fakultaet;
import de.philulay.jenkinsbeispiel.Fibonacci;
import de.philulay.jenkinsbeispiel.WahrFalsch;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;



public class FibonacciTest extends TestCase {
	
	Fibonacci objFib;
	

	/*Wird vor jedem Testaufruf ausgeführt*/
	//@Before
	public void setUp() throws Exception {
		objFib = new Fibonacci();
	}

	/*Wird nach jedem Testaufruf ausgeführt*/
	//@After
	public void tearDown() throws Exception {
		
	}

	
	// Test von Feldern
	//@Test
	public void testFibonacci(){
		int[] expected = {0,1,1,2,3,5};
		int[] actual = {0,0,0,0,0,0};
		try {
			actual = objFib.iterativ(6);
		} catch (Exception e) {
			fail();
			e.printStackTrace();
		}
		for(int i=0;i<=5;i++){
			assertEquals(expected[i], actual[i]);
		}
		
		
	}
}

