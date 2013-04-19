package de.philulay.jenkinsbeispiel;

public class Fibonacci {
	public int[] rekursiv(int anz){
		int[] ergebnis = new int[anz];
		this.rekursiv_sub(ergebnis,anz,0);
		return ergebnis;
	}
	private void rekursiv_sub(int[] erg, int anz, int pos){
		if(anz>0){
			if((pos < 1)){
				erg[0] = 0;
			}else if((pos == 1)){
				erg[1] = 1;
			}else{
				erg[pos] = erg[pos-1]+erg[pos-2];
			}
			this.rekursiv_sub(erg, anz-1, pos+1);
		}
	}
	public int[] iterativ(int anz){
		int[] ergebnis = new int[anz];
		if(anz>=0){
			ergebnis[0]=0;
		}
		if(anz>=1){
			ergebnis[1]=1;
		}
		if(anz>1){
			for(int i = anz-2;i>0;i--){
				ergebnis[anz-(i)]=ergebnis[anz-i-1]+ergebnis[anz-i-2];
			}
		}
		return ergebnis;
	}
}
