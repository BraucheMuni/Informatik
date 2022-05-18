import java.util.Scanner;

public class Wochentag {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Welcher Tag ist Heute?");

            switch (sc.next().toLowerCase()) {
                case "mo": System.out.println("Schitzel"); break;
                case "di": System.out.println("Linsen"); break;
                case "mi": System.out.println("Doener"); break;
                case "do": System.out.println("Pizza"); break;
                case "fr": System.out.println("Salami Pizza"); break;
                case "sa": System.out.println("Monster Energy"); break;
                case "so": System.out.println("Nudeln Gongonzola"); break;
            
                default: System.out.println("Kein Wochentag!"); break;
            }

            System.out.println("Weiter?");
        } while (sc.next().toLowerCase().equals("ja"));

        sc.close();
    }
}