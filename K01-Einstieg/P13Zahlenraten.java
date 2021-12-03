import java.util.Random;
import java.util.Scanner;

public class P13Zahlenraten {
    /*
     * Zahlenraten
     * 1. PC denkt sich eine zufällige Zahl zw. 1 und 100
     * 2. Spieler muss sie raten
     * 3. Der PC meldet zurück, ob
     *    a. die Zahl kleiner ist als die gesuchte
     *    b. die Zahl größer ist als die gesuchte
     *    c. die Zahlen gleich, d.h. der Spieler hat gewonnen
     */
    public static void zahlenraten() {
        Random generator = new Random();
        Scanner tastatur = new Scanner(System.in);

        // Würfel eine Zufallszahl zwischen 1 und 100
        int computerZahl = generator.nextInt(100) + 1;
        int benutzerZahl = -1;

        System.out.println("Willkommen beim Zahlenraten");
        System.out.println("Versuche, eine Zahl von 1 bis 100 zu raten");

        while (computerZahl != benutzerZahl) {
            System.out.print("Dein Versuch: ");
            benutzerZahl = tastatur.nextInt();

            if (computerZahl > benutzerZahl) {
                System.out.println("Meine Zahl ist groesser!");
            } else if (computerZahl < benutzerZahl) {
                System.out.println("Meine Zahl ist kleiner!");
            } 
        }

        System.out.println("Hurra, Du hast sie geraten!");
    }

    public static void zahlenraten2() {
        Random generator = new Random();
        Scanner tastatur = new Scanner(System.in);

        // Würfel eine Zufallszahl zwischen 1 und 100
        int computerZahl = generator.nextInt(100) + 1;
        int benutzerZahl;

        System.out.println("Willkommen beim Zahlenraten");
        System.out.println("Versuche, eine Zahl von 1 bis 100 zu raten");

        do {
            System.out.print("Dein Versuch: ");
            benutzerZahl = tastatur.nextInt();

            if (computerZahl > benutzerZahl) {
                System.out.println("Meine Zahl ist groesser!");
            } else if (computerZahl < benutzerZahl) {
                System.out.println("Meine Zahl ist kleiner!");
            } 
        } while (computerZahl != benutzerZahl);

        System.out.println("Hurra, Du hast sie geraten!");
    }

    public static void zahlenraten3() {
        Random generator = new Random();
        Scanner tastatur = new Scanner(System.in);
        int versuche = 0;

        // Würfel eine Zufallszahl zwischen 1 und 100
        int computerZahl = generator.nextInt(100) + 1;
        int benutzerZahl;

        System.out.println("Willkommen beim Zahlenraten");
        System.out.println("Versuche, eine Zahl von 1 bis 100 zu raten");

        do {
            System.out.print("Dein Versuch: ");
            benutzerZahl = tastatur.nextInt();
            versuche = versuche + 1;

            if (computerZahl > benutzerZahl) {
                System.out.println("Meine Zahl ist groesser!");
            } else if (computerZahl < benutzerZahl) {
                System.out.println("Meine Zahl ist kleiner!");
            } 
        } while (computerZahl != benutzerZahl);

        System.out.println("Hurra, Du hast sie geraten!");
        System.out.println("Du hast nur "+versuche+" Versuche gebraucht.");
    }
}
