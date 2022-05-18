import java.util.Scanner;

public class Verzweigungen4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int zahl;  
		
		System.out.println("Geben Sie eine Zahl zwischen 1 und 3 an.");
		
		try {
			zahl = Integer.parseInt(sc.next());
		}
		catch(NumberFormatException nfe) {
			System.out.println("Das war keine Zahl. Die Zahl wird automatisch auf 0 gesetzt.");
			zahl = 0;
		}
		
		switch (zahl){
		case 1:
			System.out.println("Sie haben die Eins gew�hlt.");
			break;
		case 2:
			System.out.println("Sie haben die Zwei gew�hlt.");
			break;
		case 3:
			System.out.println("Sie haben die Drei gew�hlt.");
			break;
		default:
			System.out.println("Die gew�hlte Option ist nicht verf�gbar.");
			break;
		}
		sc.close();
	}
}
