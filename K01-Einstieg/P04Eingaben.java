import java.util.Scanner;

public class P04Eingaben {
    public static void eingabe() {
        Scanner tastatur = new Scanner(System.in);
        System.out.print("Gib eine Zahl ein: ");
        
        int benutzerZahl;
        benutzerZahl = tastatur.nextInt();
        
        System.out.println("Sie haben eingegeben: ");
        System.out.println(benutzerZahl);
    }
}
