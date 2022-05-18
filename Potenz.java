import java.util.Scanner;

public class Potenz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Long m, n, x = 1L;
        try {
            System.out.print("m = ");
            m = Long.parseLong(sc.next());
            System.out.print("n = ");
            n = Long.parseLong(sc.next());
        } catch (NumberFormatException e) {
            System.out.println("Keine Zahl, wird auf 1 gesetzt.");
            m = 1L;
            n = 1L;
        }

        for (; n > 0; --n) {
            x *= m;
        }

        System.out.println("m ^ n = " + x);
    }
}
