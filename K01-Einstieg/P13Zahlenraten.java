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
        System.out.println("Du hast nur " + versuche + " Versuche gebraucht.");
    }

    // Erweitern Sie das Spiel so, dass nach 6. erfolglosen Versuchen
    // abgebrochen wird.
    public static void zahlenraten4() {
        Random generator = new Random();
        Scanner tastatur = new Scanner(System.in);
        int versuche = 0;
        boolean erraten = false;
        boolean zuOftVersucht = false;

        // Würfel eine Zufallszahl zwischen 1 und 100
        int computerZahl = generator.nextInt(100) + 1;
        computerZahl = 10;
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
            } else {
                System.out.println("Hurra, Du hast sie geraten!");
                erraten = true;
            }

            zuOftVersucht = versuche > 6;
            // !a && !b == !(a || b)
            // } while (!erraten && !zuOftVersucht);
        } while (!(erraten || zuOftVersucht));
        
        if (erraten) {
            System.out.println("Du hast nur " + versuche + " Versuche gebraucht.");
        } else {
            System.out.println("Leider verloren. Zu viele Versuche!");
        }
    }

    private static void zahlenraten5sub() {
        Random generator = new Random();
        Scanner tastatur = new Scanner(System.in);
        int versuche = 0;
        boolean erraten = false;
        boolean zuOftVersucht = false;

        // Würfel eine Zufallszahl zwischen 1 und 100
        int computerZahl = generator.nextInt(100) + 1;
        int benutzerZahl;

        do {
            System.out.print("Dein Versuch: ");
            benutzerZahl = tastatur.nextInt();
            versuche = versuche + 1;

            if (computerZahl > benutzerZahl) {
                System.out.println("Meine Zahl ist groesser!");
            } else if (computerZahl < benutzerZahl) {
                System.out.println("Meine Zahl ist kleiner!");
            } else {
                erraten = true;
            }

            zuOftVersucht = versuche > 6;
        } while (!erraten && !zuOftVersucht);

        if (erraten) {
            System.out.println("Hurra, Du hast sie geraten!");
            System.out.println("Du hast nur " + versuche + " Versuche gebraucht.");
        } else {
            System.out.println("Leider verloren. Zu viele Versuche!");
        }
    }

    public static void zahlenraten5() {
        Scanner tastatur = new Scanner(System.in);
        boolean weiter = true;

        System.out.println("Willkommen beim Zahlenraten");
        System.out.println("Versuche, eine Zahl von 1 bis 100 zu raten");

        do {
            zahlenraten5sub();
            System.out.print("Weiter (1 für ja)? ");
            int eingabe = tastatur.nextInt();
            // setze weiter darauf, ob eingabe den Wert 1 hat
            weiter = eingabe == 1;
        } while (weiter == true);
    }

}
