package de.philulay.jenkinsbeispiel;

import de.philulay.jenkinsbeispiel.Fakultaet;
import de.philulay.jenkinsbeispiel.Fibonacci;
import de.philulay.jenkinsbeispiel.WahrFalsch;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;



public class WahrFalschTest extends TestCase {
	
	WahrFalsch objWF;
	

	/*Wird vor jedem Testaufruf ausgeführt*/
	//@Before
	public void setUp() throws Exception {
		
		objWF = new WahrFalsch();
	}

	/*Wird nach jedem Testaufruf ausgeführt*/
	//@After
	public void tearDown() throws Exception {
		
	}

	// Testet ob beide Variablen wahr sind
	//@Test
	public void testWahrFalsch(){
		String expected = "beide wahr";
		
		try{
			objWF.TestBeideWahr(true, true);
		}catch (Exception e) {
			fail("TestWahrFalsch1 fehlgeschlagen");
			e.printStackTrace();
		}
		
		assertEquals(expected, objWF.getString());
	}
	
}

