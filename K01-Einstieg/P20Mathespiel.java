import java.util.Random;
import java.util.Scanner;

public class P20Mathespiel {
    public static void main() {
        // Wähle zufällig eine Zahlenreihe (2..20) aus, die der Benutzer
        // vervollständigen soll.
        Random gen = new Random();
        Scanner tastatur = new Scanner(System.in);
        int[] eingaben = new int[10];

        int reihe = gen.nextInt(9) + 2;
        System.out.println("Kleines 1x1: Die " + reihe + "er-Reihe");

        // Lies 10 Zahlen vom Benutzer ein
        for (int i = 0; i < 10; i = i + 1) {
            int echteZahl = i + 1;
            System.out.print("Gib die " + echteZahl + ". Zahl ein: ");
            String eingabe = tastatur.nextLine();
            eingaben[i] = Integer.parseInt(eingabe);
        }

        // Danach vergleiche die Eingaben mit den korrekten Werten
        // Und gib aus, wieviele Zahlen richtig bzw. falsch sind
        // Und gib eine Erfolgsmeldung aus
        int richtige = 0;

        // Gehe mit einer neuen Schleife durch <eingaben>
        // und vergleiche jeden Wert mit dem Sollwert
        // wenn gleich:
        //     erhöhe <richtige> um eins
        // sonst:
        //     zeige den Fehler
        for (int i = 0; i < 10; i = i + 1) {
            int eingabe = eingaben[i];
            int richtig = reihe * (i+1);

            System.out.print((i+1) + ". Zahl war ");
            if (eingabe == richtig) {
                System.out.println("richtig!");
                richtige += 1;
            } else {
                System.out.println(
                    "falsch! Deine Eingabe: " + 
                    eingabe + 
                    "; Richtig ist: " +
                    richtig
                );
            }
        }

        // Gib aus, wie viele Richtige dabei waren
        System.out.println("Du hattest " + richtige + " Richtige.");
    }
}
