package de.philulay.jenkinsbeispiel;

import org.testng.Assert;
import org.testng.annotations.ExpectedExceptions;
import org.testng.annotations.Test;

import de.philulay.jenkinsbeispiel.*;

public class TestNGTests{

	@Test(groups = {"Fakultaet"})
	public void TestFak5i(){
		Fakultaet fak = new Fakultaet();
		assert fak.iterativ(5)==120;
	}
	@Test(groups = {"Fakultaet"})
	public void TestFak5r(){
		Fakultaet fak = new Fakultaet();
		assert fak.rekursiv(5)==120;
	}
	@Test(groups = {"Fibonacci"})
	public void TestFibi(){
		Fibonacci fib = new Fibonacci();
		int[] erwartet = {0,1,1,2,3};
		for(int i = 0; i<5;i++){
			Assert.assertEquals(fib.iterativ(5)[i], erwartet[i]);
		}
	}
	@Test(groups = {"Fibonacci"})
	public void TestFibr(){
		Fibonacci fib = new Fibonacci();
		int[] erwartet = {0,1,1,2,3};
		for(int i = 0; i<5;i++){
			Assert.assertEquals(fib.rekursiv(5)[i], erwartet[i]);
		}
	}
	@Test(groups = {"WahrFalsch"})
	public void BeideWahr() throws Exception{
                WahrFalsch abc = new WahrFalsch();
		abc.TestOder(true, true);
	}
	@Test(groups = {"WahrFalsch"},expectedExceptions = {java.lang.Exception.class})
	public void NichtBeideWahr() throws Exception{
		WahrFalsch abc = new WahrFalsch();
		abc.TestBeideWahr(false, true);
	}
	@Test(groups = {"WahrFalsch"},expectedExceptions = {java.lang.Exception.class})
	public void NichtsWahr() throws Exception{
		WahrFalsch abc = new WahrFalsch();
		abc.TestBeideWahr(false, false);
	}
}
