package de.philulay.jenkinsbeispiel;

import de.philulay.jenkinsbeispiel.Fakultaet;
import de.philulay.jenkinsbeispiel.Fibonacci;
import de.philulay.jenkinsbeispiel.WahrFalsch;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;



public class FakultaetTest extends TestCase {
	
	Fakultaet objF;
	

	/*Wird vor jedem Testaufruf ausgeführt*/
	//@Before
	public void setUp() throws Exception {
		objF = new Fakultaet();
	}

	/*Wird nach jedem Testaufruf ausgeführt*/
	//@After
	public void tearDown() throws Exception {
		
	}

	
	// Test von einzelnen Variablen
	//@Test
	public void testFakultaet(){
		int expected = 120;
		int actual = 0;
		
		try{
			actual = objF.rekursiv(5);
		}catch (Exception e) {
			fail("Falsches Ergebnis");
			e.printStackTrace();
		}
		assertEquals(expected, actual);		// vergleicht den erwarteten Wert mit dem berechnetem Wert
		
	}
	
	
}

