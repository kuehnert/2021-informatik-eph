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
}
