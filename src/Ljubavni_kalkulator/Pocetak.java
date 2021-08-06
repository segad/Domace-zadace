package Ljubavni_kalkulator;

import java.util.Scanner;

public class Pocetak {
	
	
	//Program racuna postotak zaljubljenosti
	//parova na osnovu njihovih imena
	
	
	FromStringToInteger fromStringToInteger = new FromStringToInteger();
	public Pocetak() {
	
		System.out.println("***LJUBAVNI KALKULATOR***");
		System.out.println("Za izračun zaljubljenosti potrebno je unjeti imena oba partnera");
			
			//Poziva se funkcija u kojoj se upisuje prvo ime te provjerava korisnikov unos
			unesiPrvoIme();
			//Ispis prvog imena
			System.out.println("Ime prvog partnera je " + fromStringToInteger.getIme1());
			//Poziva se funkcija u kojoj se upisuje drugo ime te provjerava korisnikov unos
			unesiDrugoIme();
			//Ispis drugog imena
			System.out.println("Ime drugog partnera je " + fromStringToInteger.getIme2());
			//Poziva se funkcija u drugoj klasi koja računa ljubav
			fromStringToInteger.racunanje();
		
		
		
	}
	
	public void unesiPrvoIme() {
		Scanner korisnikovUnos = new Scanner(System.in); // Kreiranje objekta iz skenera
		System.out.println("Unesite ime prvog partnera");
		fromStringToInteger.setIme1(korisnikovUnos.nextLine()); // Čitanje prvog imena

		if ((fromStringToInteger.getIme1()) == null || (fromStringToInteger.getIme1()).equals("")) {
			System.out.println("Niste upisali ime. Molim da ponovo unesete ime");
			unesiPrvoIme();

		}

		// Provjerava se sastoji li se korisnikov unos samo od brojeva
		try {
			Integer.parseInt((fromStringToInteger.getIme1()));
			System.out.println("Neispravan unos. Unos sadrži samo brojeve");
			unesiPrvoIme();
		} catch (NumberFormatException e) {

		}

		// Ukoliko je korisnik unio kombinaciju brojeva i slova, ovdje će ga se
		// zaustaviti i tražiti da unese samo slova
		for (int i = 0; i < fromStringToInteger.getIme1().length(); i++) {
			if (fromStringToInteger.getIme1().charAt(i) >= '0' && fromStringToInteger.getIme1().charAt(i) <= '9') {
				System.out.println("Neispravan unos. Ime ne smije sadržavati brojeve već samo slova");
				unesiPrvoIme();
			}

		}

		

	}
	
	public void unesiDrugoIme() {
		Scanner korisnikovUnos = new Scanner(System.in); // Kreiranje objekta iz skenera
		System.out.println("Unesite ime drugog partnera");
		fromStringToInteger.setIme2(korisnikovUnos.nextLine()); // Čitanje drugog imena
		if ((fromStringToInteger.getIme2()) == null || (fromStringToInteger.getIme2()).equals("")) {
			System.out.println("Nisi unio ime.");
			unesiDrugoIme();
		}

		// Provjerava se sastoji li se korisnikov unos samo od brojeva
		try {
			Integer.parseInt((fromStringToInteger.getIme2()));
			System.out.println("Neispravan unos. Unos sadrži samo brojeve");
			unesiDrugoIme();
		} catch (NumberFormatException e) {

		}

		// Ukoliko je korisnik unio kombinaciju brojeva i slova, ovdje će ga se
		// zaustaviti i tražiti da unese samo slova
		for (int i = 0; i < fromStringToInteger.getIme2().length(); i++) {
			if (fromStringToInteger.getIme2().charAt(i) >= '0' && fromStringToInteger.getIme2().charAt(i) <= '9') {
				System.out.println("Neispravan unos. Ime ne smije sadržavati brojeve već samo slova");
				unesiDrugoIme();
			}

		}

	}
	
	public static void main(String[] args) {
		System.out.println();
	
		
		new Pocetak();
		
		
	}
	

}
