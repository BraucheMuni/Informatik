public class PowerFact {
    public static void main(String[] args) {
        int
            n = 9,
            m = 5;
        PowerFact pf = new PowerFact();

        System.out.println(pf.fact(m));
    }
    public long power(int n, int m) {
        if (m == 0) {
            return 1;
        }
        else {
            return n * power(n, m - 1);
        }
    }
    public long fact(int n) {
        if (n == 0) {
            return 1;
        }
        else {
            return fact(n - 1) * n;
        }
    }
}