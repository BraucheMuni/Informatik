import java.util.InputMismatchException;
import java.util.Scanner;

public class PrimeRecursive {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        PrimeRecursive self = new PrimeRecursive();
        int n = self.inputInt();

        self.primes(n);
    }
    int inputInt() {
        try {
            System.out.print("n = ");
            return sc.nextInt();
        } catch (InputMismatchException e) {
            System.err.println("Kein Zahl, wird auf 10 gesetzt.");
            return 10;
        }
    }
    void primes(int n) {
        switch (n) {
            case 2: System.out.println(2);
            case 1: System.out.println(1); break;
            default:
                if (is_prime(n)) {
                    System.out.println(n);
                }

                primes(n - 1);
        }
    }
    boolean is_prime(int n) {
        boolean prime = true;
        for (int i = 2; i < n && prime; ++i) {
            if (n % i == 0) {
                prime = false;
            }
        }

        return prime;
    }
}
