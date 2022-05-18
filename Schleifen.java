public class Schleifen {

	public static void main(String[] args) {
		int zahl;
		
		//Z�hlschleife - entspricht For-To in Free Pascal
		for(int i=0; i<10; i++)
		{
		  System.out.println(i);
		}
		
		System.out.println();
		System.out.println();
		
		//Z�hlschleife - entspricht For-Downto in Free Pascal
		for(int i=10; i>0; i--)
		{
		  System.out.println(i);
		}
		
		System.out.println();
		System.out.println();
		
		//Kopfgesteuerte Schleife - entspricht While-Do in Free-Pascal
		zahl = 0;
		while(zahl < 10)
		{
			System.out.println(zahl);
			zahl++;
		}
		
		System.out.println();
		System.out.println();
		
		//Fu�gesteuerte Schleife - entspricht Repeat-Until in Free-Pascal
		zahl = 0;
		do {
			System.out.println(zahl);
			zahl++;
		}while(zahl < 10);
		
	}
}