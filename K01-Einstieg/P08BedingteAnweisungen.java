import java.util.Scanner;

public class P08BedingteAnweisungen {
    /**
     * Ermöglichen, den Programmfluss zu steuern
     * und verschiedene Abzweigungen
     */
    public static void ba1() {
        System.out.println("Anfang von ba1()");
        int alter = 26;

        // wenn alter größer gleich 18 ist...
        if (alter >= 18) {
            // gib aus „Du darfst wählen“
            System.out.println("Du darfst wählen");
        }

        System.out.println("Ende von ba1()");
    }

    // Wenn eine Variable min kleiner ist als 10,
    // soll sie um 10 erhöht werden
    // Beispiele: min == 15, passiert nichts
    // min == 8, dann soll min = 18 werden
    // Am Ende soll min ausgegeben werden
    public static void baa1() {
        int min = 25;

        if (min < 10) {
            min = min + 10;
        }

        System.out.println(min);
    }

    public static void ba2() {
        System.out.println("Anfang von ba2()");
        Scanner tastatur = new Scanner(System.in);

        System.out.print("Wie alt bist Du?");
        int alter = tastatur.nextInt();

        if (alter < 3) {
            System.out.println("Baby");
        }

        System.out.println("Ende von ba2()");
    }

    public static void ba3() {
        // import java.util.Scanner;
        System.out.println("Anfang von ba3()");
        Scanner tastatur = new Scanner(System.in);

        System.out.print("Wieviele Biere hast Du? ");
        int anzahl = tastatur.nextInt();

        // Wenn die anzahl kleiner ist als 3
        if (anzahl < 3) {
            // ... gib aus:
            System.out.println("Hier hast Du noch ein Bier");
        } else {
            // sonst (anzahl ist 3 oder größer) gib aus:
            System.out.println("Du hast bereits genug Bier");
        }

        System.out.println("Ende von ba3()");
    }

    // Programmieren Sie ba3a():
    // Frage Benutzer, ob er Köln Fan ist
    // "1": ja, "2": nein
    // Wenn ja, gib aus "Köln ist die beste Stadt!"
    // Wenn nein, gib aus "Düsseldorf ist viel cooler!"
    public static void ba3a() {
        // import java.util.Scanner;
        System.out.println("Anfang von ba3a()");
        Scanner tastatur = new Scanner(System.in);

        System.out.print("1 für Köln, 2 für D'dorf? ");
        int anzahl = tastatur.nextInt();

        // Wenn die anzahl kleiner ist als 3
        if (anzahl == 1) {
            System.out.println("Köln ist super");
            anzahl = anzahl + 1;
        } else {
            System.out.println("D'dorf ist cool");
        }

        // Wenn die anzahl kleiner ist als 3
        if (anzahl == 1) {
            System.out.println("Köln ist super");
            anzahl = anzahl + 1;
        } 
         
        if (anzahl == 2) {
            System.out.println("D'dorf ist cool");
        }

        System.out.println("Ende von ba3a()");
    }

    // Wie alt bist Du? 
    // >= 18: "Du darfst wählen!"
    //  < 18: "Du musst noch x Jahre warten"
}
