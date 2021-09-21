import java.util.Scanner;

public class P05Addieren {
    public static void addieren() {
        // Erstelle einen Scanner mit Namen
        // tastatur, um Daten über die Tastatur
        // einlesen zu können
        Scanner tastatur = new Scanner(System.in);

        // Fordere Benutzer auf, etwas einzugeben
        System.out.print("Gib Zahl 1 ein: ");

        // Deklaration
        // Integer -> Ganzzahl
        // Erstelle eine Variable vom Typ Ganzzahl
        // und nenne sie zahl
        int zahl;

        // Initialisierung (Wertzuweisung)
        // Lies über die Tastatur eine Zahl ein
        zahl = tastatur.nextInt();

        System.out.print("Gib Zahl 2 ein: ");
        int zahl2 = tastatur.nextInt();

        System.out.print("Gib Zahl 3 ein: ");
        int zahl3 = tastatur.nextInt();

        int ergebnis = (zahl) + zahl2 + zahl3;
        System.out.println(zahl + " + " + zahl2 + " + " 
            + zahl3 + " = " + ergebnis);
            
        // 3 + 4   * 5  = ?
        // 5 * 3   + 4  = ?
        // 3 + (4  * 5) = ?
        // (3 + 4) * 5  = ?
    }
}
