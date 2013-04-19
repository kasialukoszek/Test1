package de.philulay.jenkinsbeispiel;

public class WahrFalsch {
	
	private String erg = "";
	
	public void TestBeideWahr(boolean a, boolean b) throws Exception{
		
		if(a && b){
			erg = "beide wahr";
			System.out.println("Beide Wahr");
		}
		else{
			erg = "nicht beide wahr";
			throw new Exception("Variablen nicht identisch");
		}
		
	}
	
	public void TestOder(boolean a, boolean b) throws Exception{
		if(a || b){
			erg = "a oder b wahr";
			System.out.println("a oder b Wahr");
		}else{
			erg = "keiner wahr";
			throw new Exception("Keine Variable wahr");
		}
		
	}
	
	public String getString(){
		return this.erg;
	}
}
