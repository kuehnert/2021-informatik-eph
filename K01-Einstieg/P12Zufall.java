import java.util.Random;

public class P12Zufall {
    public static void zufallszahlenOhneBeschraenkung() {
        // Man nehme einen GENERATOR für Zufallszahlen
        // und der bekommt die Aufgabe, immer weitere zufällige
        // Zahlen zu erzeugen
        Random generator;
        generator = new Random();

        int x = generator.nextInt();
        System.out.println(x);
        // Zahlen von nextInt() sind aus dem Bereich
        // Integer.MIN_VALUE..Integer.MAX_VALUE
        // System.out.println(Integer.MIN_VALUE);
        // System.out.println(Integer.MAX_VALUE);

    }

    public static void zufallszahlenMitBeschraenkung() {
        Random generator;
        generator = new Random();

        // nextInt mit Zahl n erzeugt eine Zahl x
        // 0 <= x < n
        int x = generator.nextInt(1000);
        System.out.println(x);
    }

    // Aufgaben
    // 1. Erzeuge 100 Zufallszahlen zwischen 0 und 50
    public static void zufallszahlenMitSchleife() {
        Random generator;
        generator = new Random();
        int zuffi;
        int wieoft = 50;

        while (wieoft > 0) {
            zuffi = generator.nextInt(50);
            System.out.println(zuffi);
            wieoft = wieoft - 1;
        }
    }

    // 2. Simuliere einen Würfel, d.h. 
    //    Ihr Programm gibt zufällig aus "Eins", "Zwei", "Drei", ... "Sechs"
    public static void wuerfeln() {
        Random generator;
        generator = new Random();

        int zuffi;
        zuffi = generator.nextInt(6); // 0..5

        if (zuffi == 0) {
            System.out.println("eins");
        } else if (zuffi == 1) {
            System.out.println("zwei");
        }

    }

    // 3. Testen Sie, wie gut der Generator ist, indem 100x einen Würfel
    //    würfeln lassen und mitzählen, wie oft jede Zahl gefallen ist
    // Sie brauchen 6 Variablen, mit denen Sie die Anzahl zählen
    // int einsen = 0;
    // int zweien = 0;
    // ....
    // Hausaufgabe:
    // Setzen Sie einen Menschen an die gleiche Aufgabe und schreiben mit,
    // wie oft der „zufällig“ welche Zahl sagt
    // Schreiben Sie einen Absatz, wo Sie argumentieren, ob der Mensch oder
    // der PC die Aufgabe, Zahlen zufällig zu „würfeln“ besser gelöst hat
    // cognitive fallacy

    public static void zufallsqualitaet() {
        Random generator = new Random();
        int w1 = 0, w2 = 0, w3 = 0, w4 = 0, w5 = 0, w6 = 0, zaehler = 0;

        while (zaehler < 1000) {
            int x = generator.nextInt(6) + 1; // 1..6

            if (x == 1) {
                // w1 + 1; // lesender Zugriff
                // w1 = .... // schreibender Zugriff
                w1 = w1 + 1;
            } else if (x == 2) {
                w2 = w2 + 1;
            } else if (x == 3) {
                w3 = w3 + 1;
            } else if (x == 4) {
                w4 = w4 + 1;
            } else if (x == 5) {
                w5 = w5 + 1;
            } else {
                w6 = w6 + 1;
            }

            zaehler = zaehler + 1;
        }

        System.out.println(w1);
        System.out.println(w2);
        System.out.println(w3);
        System.out.println(w4);
        System.out.println(w5);
        System.out.println(w6);
    }
}
