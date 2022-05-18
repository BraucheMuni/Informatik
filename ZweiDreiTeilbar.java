import java.util.Scanner;

public class ZweiDreiTeilbar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Long n;

        try {
            System.out.print("n = ");
            n = Long.parseLong(sc.next());
        } catch (NumberFormatException e) {
            System.out.println("Kein Zahl, wird auf 0 gesetzt.");
            n = 0L;
        }

        for (Long m = 0L; m <= n; ++m) {
            if (m % 2 == 0 && m % 3 == 0) {
                System.out.print(m + " ");
            }
        }
        
        System.out.println();
    }
}
