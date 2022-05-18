import java.util.Scanner;

public class Verzweigungen1 {

	public static void main(String[] args) {
		String entscheidung;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Schreiben Sie JA oder NEIN");
		entscheidung = sc.next();
		
		if (entscheidung.equals("JA")){
			System.out.println("Sie haben JA geschrieben.");
		}else {
			System.out.println("Sie haben nicht JA geschrieben.");
		}
		sc.close();	
	}

}
