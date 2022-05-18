import java.util.Scanner;

public class Primzahl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Long n;

        try {
            System.out.print("n = ");
            n = Long.parseLong(sc.next());
        } catch (NumberFormatException e) {
            System.err.println("Kein Zahl, wird auf 0 gesetzt.");
            n = 0L;
        }

        System.out.print("1 2 ");
        for (Long i = 3L; i < n; i += 2) {
            if (ist_primzahl(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    static boolean ist_primzahl(Long n) {
        boolean primzahl = true;
        for (Long i = 2L; i < n && primzahl; ++i) {
            if (n % i == 0) {
                primzahl = false;
            }
        }

        return primzahl;
    }
}