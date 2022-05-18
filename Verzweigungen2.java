import java.util.Scanner;

public class Verzweigungen2 {

	public static void main(String[] args) {
		String entscheidung;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Schreiben Sie JA oder NEIN");
		entscheidung = sc.next();
		
		if (entscheidung.equals("JA")){
			System.out.println("Sie haben JA geschrieben.");
		}else if (entscheidung.equals("NEIN")){
			System.out.println("Sie haben NEIN geschrieben.");
		}else {
			System.out.println("Sie haben weder JA noch NEIN geschrieben.");
		}
		sc.close();	
	}

}
