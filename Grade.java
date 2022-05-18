import java.util.Scanner;

public class Grade {
    public static void main(String[] main) {
        Scanner sc = new Scanner(System.in);

        Long n;

        try {
            System.out.print("n = ");
            n = Long.parseLong(sc.next());
        } catch (NumberFormatException e) {
            System.out.println("Keine Zahl, wird auf 0 gesetzt.");
            n = 0L;
        }

        if (n % 2 == 0) {
            System.out.println("Zahl ist grade.");
        } else {
            System.out.println("Zahl ist ungrade.");
        }
    }
}
