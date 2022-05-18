import java.util.Scanner;

public class Fußgesteuerte_Schleife {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Hallo!\nWeiter?");
        } while (sc.next().toLowerCase().equals("ja"));

        sc.close();
    }
}
