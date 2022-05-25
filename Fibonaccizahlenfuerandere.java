import java.util.Scanner;


public class Fibonaccizahlenfuerandere {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Fibonaccizahlen fib = new Fibonaccizahlen();

        int n = fib.input();
        
        System.out.println("fib(n) = fib(" + n + ") = " + fib.fibIter(n));
    }
    public int input() {
        int n;
        
        System.out.print("n = ");
        try {
            n = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.err.println("Das ist keine Zahl; wird auf 1 gesetzt.");
            n = 1;
        }

        return n;
    }
    public long fibIter(int n) {
        long n0 = 0;
        long n1 = 1;
        long n2 = 1;

        for (int i = 1; i < n; ++i) {
            n2 = n0 + n1;
            
            n0 = n1;
            n1 = n2;

            System.out.println("n := " + n2);
        }

        return n2;
    }
}
