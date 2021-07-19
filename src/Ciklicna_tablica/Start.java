package Ciklicna_tablica;

import javax.swing.JOptionPane;

public class Start {
	
	
	Dimenzije dimenzije = new Dimenzije();
	Tablica tablica;
	
	public Start() {
		
		//Zadatak je napraviti tablicu gdje korisnik unosi dimenzije tablice
		//Tablica se popunjava od 1 te se uvećava za svako prazno polje u tablici
		//Upis kreće u zadnjem stupu te zadnjem redku
		//popunjava prvo sa lijeva na desna, zatim odozdola prema gore, s lijevo na desno, te opet dolje
		//to čini spiralu
		//Kada se popune sva polja unutar tablice, ista se ispisuje te se program prekida
		//na ovaj na�in punim objekte u klasi dimenzije
		System.out.println("****Spiralna tablica****");
		dimenzije.setBrojStupaca(Integer.parseInt(JOptionPane.showInputDialog("Unesite broj stupova")));
		dimenzije.setBrojRedova(Integer.parseInt(JOptionPane.showInputDialog("Unesite broj redova")));
		
		
		//na ovaj na�in punim objekte u klasi tablica tako da izvla�im iz klase dimenzije
		tablica = new Tablica(dimenzije.getBrojRedova(), dimenzije.getBrojStupaca(), dimenzije.getMaxRedova() , dimenzije.getMaxStupaca());
		tablica.upisiElemente();
		
		
	}
	
	

	
	public static void main(String[] args) {
		new Start();
	}
	
	

}
