package Ciklicna_tablica;

public class Tablica {

	private int brojRedova;
	private int brojStupaca;
	private int minRedova = 0;
	private int maxRedova;
	private int minStupaca = 0;
	private int maxStupaca;


	public Tablica(int brojRedova, int brojStupaca, int maxRedova, int maxStupaca) {
		this.brojRedova = brojRedova;
		this.brojStupaca = brojStupaca;
		this.maxRedova = maxRedova;
		this.maxStupaca = maxStupaca;

	}

	public void upisiElemente() {

		int ukupnoBrojeva = (brojRedova * brojStupaca);
		System.out.println("Ukupno brojeva" + ukupnoBrojeva);
		
		
		int[][] tablica = new int  [brojRedova][brojStupaca];
		
		int trenutnaVrijednost = 1;
		int i;
		
		
		 while(trenutnaVrijednost<=ukupnoBrojeva) {

		
			 
		  //ispis s desna na lijevo 
		 
			for (i = maxStupaca; i >= minStupaca; i--) {

				tablica[maxRedova][i] = trenutnaVrijednost;
				trenutnaVrijednost++;
			}
			maxRedova--;
			
			
			
		 
		  //upis odozdo prema gore
			for (i = maxRedova; i >= minRedova; i--) {
				tablica[i][minStupaca] = trenutnaVrijednost;
				trenutnaVrijednost++;
			}
			minStupaca++;
		  
		  //upis s lijeva na desno 
			for (i = minStupaca; i <= maxStupaca; i++) {
				tablica[minRedova][i] = trenutnaVrijednost;
				trenutnaVrijednost++;
			}
			minRedova++;
		  
		  //upis odozgo prema dolje
		  
			for (i = minRedova; i <= maxRedova; i++) {
				tablica[i][maxStupaca] = trenutnaVrijednost;
				trenutnaVrijednost++;
			}
			maxStupaca--;
		  
		 
		 }
		 
		
		 
		 for(i=0; i<tablica.length; i++) {
			 for(int j=0; j<tablica[0].length; j++) {
				 System.out.print(tablica[i][j]+"\t");
			 }
			 System.out.println();
		 }

	}

}
