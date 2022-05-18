import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Age {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        Calendar kalender = new GregorianCalendar();

        int ajahr = kalender.get(Calendar.YEAR);
        int amonat = kalender.get(Calendar.MONTH)+1;
        int atag = kalender.get(Calendar.DAY_OF_MONTH);
        int gtag, gmonat, gjahr;
        int alter;

        System.err.print("Was ist dein Geburtsjahr? ");
        try {
            gjahr = sc.nextInt();
        } catch (NumberFormatException nfe) {
            System.err.println("Das ist keine Zahl, wird auf 2000 gesetzt.");
            gjahr = 2000;
        }

        System.err.print("Was ist dein Geburtsmonat? ");
        try {
            gmonat = Integer.parseInt(sc.next());
        } catch (NumberFormatException nfe) {
            System.err.println("Das ist keine Zahl, wird auf 1 gesetzt.");
            gmonat = 1;
        }

        System.err.print("Was ist dein Geburtstag? ");
        try {
            gtag = Integer.parseInt(sc.next());
        } catch (NumberFormatException nfe) {
            System.err.println("Das ist keine Zahl, wird auf 1 gesetzt.");
            gtag = 1;
        }

        if (gmonat > amonat) {
            alter = ajahr - gjahr - 1;
        } else if (gmonat == amonat) {
            if (gtag > atag) {
                alter = ajahr - gjahr - 1;
            } else {
                alter = ajahr - gjahr;
            }
        } else {
            alter = ajahr - gjahr;
        }

        System.out.println("Du bist " + alter + " Jahre alt.");
    }
}