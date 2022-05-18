import java.util.Scanner;


public class Fibonaccizahlen {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Fibonaccizahlen fib = new Fibonaccizahlen();

        int n = fib.input();
        
        System.out.println("fib(n) = fib(" + n + ") = " + fib.fibIter(n));
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
            prev = 0,
            curr = 1,
            next = 1;

        for (; n > 1; --n) {
            next = prev + curr;
            
            next = curr;
            curr = next;
        }

        return next;
    }
}
