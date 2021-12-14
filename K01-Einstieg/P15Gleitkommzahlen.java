public class P15Gleitkommzahlen {
    public static void kommazahlen1() {
        float  zahl1;

        // Ganzzahl / Ganzzahl ergibt eine Ganzzahl
        zahl1 = 10 / 3; // => 3.0
        System.out.println(zahl1);

        zahl1 = 10.0f; // => 10.0
        System.out.println(zahl1);

        zahl1 = 10.0f / 3.0f; // => 3.3333333, 8 signifkante Stellen
        System.out.println(zahl1);

        zahl1 = 10.0f / 1.5f; // => 6.6666665 => letzte Stelle ungenau
        System.out.println(zahl1);

        // Versuchen Sie mal in einer Float zu speichern:
        // a) Besonders große Zahlen
        // b) Besonders kleine Zahlen    
        // c) Besonders lange Zahlen    
        // d) Besonders negative Zahlen    
        // Was meinen Sie sind die "Grenzen" von Float?
        zahl1 = 99999999f; // => 1.0E8
        System.out.println(zahl1);

        zahl1 = 999999999f; // => 1.0E9
        System.out.println(zahl1);

        zahl1 = 1E12f; // => 1.0E12
        System.out.println(zahl1);

        zahl1 = 1E38f; // => 
        System.out.println(zahl1);

        zahl1 = 1.23456789123456789E38f; // => 1.2345679E38
        System.out.println(zahl1);

        zahl1 = -1.23456789123456789E38f; // => -1.2345679E38
        System.out.println(zahl1);

        zahl1 = 0.123456789f; // => 
        System.out.println(zahl1);

        zahl1 = 0.0123456789f; // => 
        System.out.println(zahl1);

        zahl1 = 0.000000000000000000000000000000123456789f; // => 1.2345679E-31
        System.out.println(zahl1);
    }

    public static void kommazahlen2() {
        double zahl; // Gleitkommazahl mit Genauigkeit von 16 Stellen
        zahl = 1.23456789123456789123456789123456789;
        System.out.println(zahl); // => 1.234567891234568
    }
    
    // Mini-Rechner:
    // Frage 2 Zahlen und eine Rechenart (+ => 1, - => 2)
    // tastatur.nextDouble()
    // Und gib das Ergebnis aus double aus
}
