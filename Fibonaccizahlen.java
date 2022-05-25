import java.util.Scanner;


public class Fibonaccizahlen {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Fibonaccizahlen fib = new Fibonaccizahlen();

        int n = fib.input();
        
        System.out.println("fib(n) = fib(" + n + ") = " + fib.fibRecursive(n));
    }
    public int input() {
        while (true) {
            System.out.print("n = ");
            try {
                return Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Keine Zahl.");
            }
        }
    }
    public long fibIter(int n) {
        long
            prev = 1,
            curr = 0,
            next = 0;

        for (; n > 0; --n) {
            next = prev + curr;
            
            curr = prev;
            prev = next;
        }

        return curr;
    }
    public long fibGood(int n) {
        long prev = 0, curr = 1;

        for (; n > 1; --n) {
            long temp = prev;

            prev = curr;
            curr += temp;
        }

        return curr;
    }
    public long fibRecursive(int n) {
        if (n <= 1) {
            return n;
        }
        else {
            return fibRecursive(n - 1) + fibRecursive(n - 2);
        }
    }
}