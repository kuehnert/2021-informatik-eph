public class Variablen {
    public static void variablen() {
        // die Variable (pl. Variablen)
        int x;                // Deklaration (Bekanntmachung)
        x = 10; // Initialisierung; Weise x den Wert 10 zu
                               
        System.out.println(x); // Aktuellen Wert von x ausgeben
        
        x = 11;                // Ersetze den alten Wert von
                               // x durch 11
        System.out.println(x); // Aktuellen Wert von x ausgeben

        // x = .... // Wertzuweisung
        x = 6 + 6;
        System.out.println(x); // Aktuellen Wert von x ausgeben
        
        System.out.println(x + 1); // => 13
        System.out.println(x);     // => 12
        
        int y; // Deklaration von neuer Variable y
        y = 2; // Initialisierung; Weise y den Wert 2 zu
        System.out.println(y); // => 2
        
        System.out.println(x+y); // => 14

        x = x + 1;
        System.out.println(x);
        
        // int z;
        // System.out.println(z);
    }
}
/*
 * 1. System.out.println(x + 1);
 * 2. int y;
 *    y = 2;
 *    System.out.println(y);
 * 3. System.out.println(x+y);
 * 4. Wie schaffen Sie es, den Wert von x um 1 zu erhöhen?
 */