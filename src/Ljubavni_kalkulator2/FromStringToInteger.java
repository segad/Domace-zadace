package Ljubavni_kalkulator2;

public class FromStringToInteger {

	String ime1, ime2, zajedno;
	int broj;

	public void racunanje() {
		zajedno = ime1.toLowerCase() + ime2.toLowerCase();

		// Brojanje koliko s pojedini brojevi ponavljalju

		int ch[] = new int[zajedno.length()];
		for (int i = 0; i < zajedno.length(); i++) {
			int brojac = 0;
			for (int j = 0; j < zajedno.length(); j++) {
				if (zajedno.charAt(j) == zajedno.charAt(i)) {
					brojac++;
				}
			}
			ch[i] = brojac;

		}
		
		//Provjera jesu li elementi ispravno upisani u niz
//		for (int i = 0; i < ch.length; i++) {
//			System.out.print(ch[i] + " ");
//			
//		}

		int prviKorak = ch.length;

		
		//postavljam neki broj koji je veći od 100 tako da uđe u while petlju
		//a dalje ga kontrolira broj koji se nalazi unutra
		
		String zaljubljenost = "1000";



		while ((Integer.parseInt(zaljubljenost))>100) {

			
			// Ukoliko je niz brojeva neparan broj, ostat će mi jedan element kojeg upisujem na kraj
			if (prviKorak % 2 != 0) {
				zaljubljenost = "";
				for (int i = 0; i < prviKorak / 2; i++) {
					zaljubljenost += String.valueOf((ch[i]) + (ch[prviKorak - 1 - i]));
				}
				zaljubljenost += String.valueOf(ch[(prviKorak / 2)]);
				prviKorak = zaljubljenost.length();
				for (int i = 0; i < prviKorak; i++) {

					// Sprječavanje greške MIN_RADIX koja se događa kada se koristi parseInt za
					// stringove 0 i 1.
					if (zaljubljenost.substring((i), (i + 1)) == "0") {
						ch[i] = 0;

					} else if (zaljubljenost.substring((i), (i + 1)) == "1") {
						ch[i] = 1;
					}

					else {
						ch[i] = Integer.parseInt(zaljubljenost.substring((i), (i + 1)));
					}

				}
			} 
			//Ukoliko je niz brojeva paran broj, zbrajam prvi za zadnjim elementom i tako se pomićem prema sredini
			else if (prviKorak % 2 == 0) {
				zaljubljenost = "";
				for (int i = 0; i < prviKorak / 2; i++) {
					zaljubljenost += String.valueOf((ch[i]) + (ch[prviKorak - 1 - i]));
				}
				prviKorak = zaljubljenost.length();
				for (int i = 0; i < prviKorak; i++) {

					// Sprječavanje greške MIN_RADIX koja se događa kada se koristi parseInt za
					// stringove 0 i 1.
					if (zaljubljenost.substring((i), (i + 1)) == "0") {
						ch[i] = 0;

					} else if (zaljubljenost.substring((i), (i + 1)) == "1") {
						ch[i] = 1;
					}

					else {
						ch[i] = Integer.parseInt(zaljubljenost.substring((i), (i + 1)));
					}

				}
		
			}

			

		}
		
		//Ispis koliko su posto zaljubljeni
		System.out.println("\nLjubavni par " + ime1 + " & " + ime2 + " zaljubljeni su " + zaljubljenost+"%.");
	}

	public int getBroj() {
		racunanje();
		return broj;
	}

	public void setBroj(int broj) {
		this.broj = broj;
	}

	public String getIme1() {
		return ime1;
	}

	public void setIme1(String ime1) {
		this.ime1 = ime1;
	}

	public String getIme2() {
		return ime2;
	}

	public void setIme2(String ime2) {
		this.ime2 = ime2;
	}

}
