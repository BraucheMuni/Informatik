import java.util.Random;
import java.util.Scanner;

public class Fakultaet {
    public static void main(String[] args) {
		Long n, x = 1L;
		Random rand = new Random();
		int max = 15;
		Long long_random = rand.nextLong(max);
        System.out.print("n = ");

		try {
			Scanner sc = new Scanner(System.in);
			n = Long.parseUnsignedLong(sc.next());
		}
		catch(NumberFormatException nfe) {
			System.out.println("Ich bin nen Rechner, kein Gespraechspartner");
			System.out.println("Ich generiere mal eine Zufällig Zahl für dich");
			System.out.println("Die Zahl ist " + long_random);
			n = long_random;
		}

		for (Long i = n; i != 0; --i)
		{
		  x *= i;
		}

        System.out.println(n + "! = " + x);
    }
}
