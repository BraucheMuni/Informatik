import java.util.Scanner;

public class Verzweigungen3 {

	public static void main(String[] args) {
		String entscheidung;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Schreiben Sie JA oder NEIN");
		entscheidung = sc.next();
		
		if (entscheidung.equals("JA") || entscheidung.equals("Ja") || entscheidung.equals("ja")){
			System.out.println("Sie haben JA geschrieben.");
		}else if (entscheidung.equals("NEIN") || entscheidung.equals("Nein") || entscheidung.equals("nein")){
			System.out.println("Sie haben NEIN geschrieben.");
		}else {
			System.out.println("Sie haben weder JA noch NEIN geschrieben.");
		}
		sc.close();	
	}

}