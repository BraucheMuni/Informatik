import java.util.Scanner;

public class HalloWelt {
   public static void main (String[] args){

    Scanner sc = new Scanner(System.in);
    String name;
    System.out.println("Wie ist dein Name?");
    name = sc.next();


    System.out.println ("Hallo "+ name +".");
    sc.close();
   }
}
