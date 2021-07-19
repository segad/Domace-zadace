package Rekurzija_zadaca;

public class Start {
	
	// zadatak za doma�u zada�u
	//zbrojiti prvih 100 brojeva koriste�i rekurziju
	
	static int brojac = 0;
	static int suma = 0;
	
	private static void rekurzija () {
		brojac++;
		if (brojac == 101) {
			System.out.println("Suma prvih 100 brojeva je " + suma);
			return;
		}else {
			
			System.out.println("Trenuti broj je " + brojac);
			suma = suma+brojac;
			rekurzija(); 
		}
		
		
	}
	
	public static void main(String[] args) {
		rekurzija();
	}

}
