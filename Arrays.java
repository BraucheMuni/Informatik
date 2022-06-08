import java.util.InputMismatchException;
import java.util.Scanner;

public class Arrays {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Arrays a = new Arrays();
        int len = a.input();

        int[] nums = new int[len];

        for (int i = 0; i < len; ++i) {
            nums[i] = a.input();
        }

        for (int num : nums) {
            System.out.println(num);
        }
    }
    public int input() {
        System.err.print("Geben sie eine Zahl ein: ");

        try {
            return Integer.parseInt(sc.next());
        } catch (NumberFormatException e) {
            return input();
        }
    }
}
