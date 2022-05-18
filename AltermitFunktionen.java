import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class AltermitFunktionen {
    Scanner sc = new Scanner(System.in);
    int gtag, gmonat, gjahr;

    public static void main (String[] args) {
        AltermitFunktionen alter = new AltermitFunktionen();
        
        alter.geburtstagsAbfrage();
        System.out.println("Du bist " + alter.ausgabeAlter() + " Jahre alt.");
    }
    public int ausgabeAlter() {
        Calendar kalender = new GregorianCalendar();

        int ajahr = kalender.get(Calendar.YEAR);
        int amonat = kalender.get(Calendar.MONTH)+1;
        int atag = kalender.get(Calendar.DAY_OF_MONTH);
        int alter;

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

        return alter;
    }
    public void geburtstagsAbfrage() {
        gjahr = abfrageZahl(2000, "Jahr: ");
        gmonat = abfrageZahl(1, "Monat: ");
        gtag = abfrageZahl(1, "Tag: ");
    }
    public int abfrageZahl(int def, String prompt) {
        int erg;

        System.err.print(prompt);
        try {
            erg = Integer.parseInt(sc.next());
        } catch (NumberFormatException e) {
            System.err.println("Das ist keine Zahl, wird auf " + def + " gesetzt.");
            erg = def;
        }

        return erg;
    }
}