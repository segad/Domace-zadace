package Ciklicna_tablica;

public class Dimenzije {
	
	private int brojRedova;
	private int brojStupaca;
	
	//Zbog toga sto mi ovo nece raditi u klasi Tablica radim to ovdje
	private int maxRedova;
	private int maxStupaca;
	
	
	
	public int getBrojRedova() {
		return brojRedova;
	}
	public void setBrojRedova(int brojRedova) {
		this.brojRedova = brojRedova;
	}
	
	
	
	public int getBrojStupaca() {
		return brojStupaca;
	}
	public void setBrojStupaca(int brojStupaca) {
		this.brojStupaca = brojStupaca;
	}
	public int getMaxRedova() {
		maxRedova = brojRedova - 1;
		return maxRedova;
	}
	public int getMaxStupaca() {
		maxStupaca = brojStupaca-1;
		return maxStupaca;
	}
	
	
	
	
	

}
