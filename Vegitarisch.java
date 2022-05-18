import java.util.Scanner;

public class Vegitarisch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Welcher Tag ist Heute?");
            String tag = sc.next().toLowerCase();

            System.out.println("Bist du vegitarier?");
            boolean veg = sc.next().toLowerCase().equals("ja");

            switch (tag) {
                case "mo": System.out.println(!veg ? "Schnitzel" : "Paprika"); break;
                case "di": System.out.println(!veg ? "Burewurs" : "Linsen"); break;
                case "mi": System.out.println(!veg ? "Doener" : "Gurke"); break;
                case "do": System.out.println(!veg ? "Pizza" : "Bohneneintopf"); break;
                case "fr": System.out.println(!veg ? "Salami Pizza" : "Spargel"); break;
                case "sa": System.out.println(!veg ? "Monster Energy" : "Fisch"); break;
                case "so": System.out.println(!veg ? "Nudeln Gongonzola" : "Stulle mit Brot"); break;
            
                default: System.out.println("Kein Wochentag!"); break;
            }

            System.out.println("Weiter?");
        } while (sc.next().toLowerCase().equals("ja"));

        sc.close();
    }
}