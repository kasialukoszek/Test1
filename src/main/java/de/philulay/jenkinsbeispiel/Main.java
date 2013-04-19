package de.philulay.jenkinsbeispiel;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Fakultaet faku = new Fakultaet();
		Fibonacci fib = new Fibonacci();
		
		int[] zahlen1 = fib.rekursiv(10);
		int[] zahlen2 = fib.iterativ(10);
		
		System.out.println("Fakultät von 5 iterativ: "+faku.iterativ(5));
		System.out.println("Fakultät von 5 rekursiv: "+faku.rekursiv(5));
		System.out.println("Fibonaccizahlen rekursiv: ");
		
		for(int i=0;i<10;i++){
			System.out.println("      "+i+".: "+zahlen1[i]);
		}
		System.out.println("Fibonaccizahlen iterativ: ");
		
		for(int i=0;i<10;i++){
			System.out.println("      "+i+".: "+zahlen2[i]);
		}
	}

}
