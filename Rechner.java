import java.util.InputMismatchException;
import java.util.Scanner;

public class Rechner {
    Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        Rechner rechner = new Rechner();
        rechner.rechne(rechner.eingabeOperator());
    }
    private double eingabeZahl() {
        double input;

        System.err.print("Operant: ");
        try {
            input = sc.nextDouble();
        } catch (InputMismatchException e) {
            System.err.println("Ist keine Zahl, wird auf 1 gesetzt.");
            input = 1;
        }

        return input;
    }
    public String eingabeOperator() {
        System.err.print("Operator [+|-|*|/|%|fact|cos|sin|tan]: ");
        return sc.next();
    }
    public void rechne(String op) {
        switch (op) {
            case "+": System.out.println(addition()); break;
            case "-": System.out.println(subtraction()); break;
            case "*": System.out.println(multiplikation()); break;
            case "/": System.out.println(division()); break;
            case "%": System.out.println(rest()); break;
            case "fact": System.out.println(fact()); break;
            case "sin": System.out.println(sin()); break;
            case "cos": System.out.println(cos()); break;
            case "tan": System.out.println(tan()); break;
            default: System.err.println("Das ist kein Operator, abbruch.");
        }
    }
    private double addition() {
        return eingabeZahl() + eingabeZahl();
    }
    private double subtraction() {
        return eingabeZahl() - eingabeZahl();
    }
    private double multiplikation() {
        return eingabeZahl() * eingabeZahl();
    }
    private double division() {
        return eingabeZahl() / eingabeZahl();
    }
    private double rest() {
        return eingabeZahl() % eingabeZahl();
    }
    private Long fact() {
        Long x = 1L;
		for (Long i = (long)eingabeZahl(); i != 0; --i) {
		  x *= i;
		}

        return x;
    }
    private double sin() {
        return Math.sin(eingabeZahl());
    }
    private double cos() {
        return Math.cos(eingabeZahl());
    }
    private double tan() {
        return Math.tan(eingabeZahl());
    }
}