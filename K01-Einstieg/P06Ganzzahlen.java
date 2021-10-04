public class P06Ganzzahlen {
    public static void ganzzahlen() {
        // Deklaration einer Variablen, die eine 
        // Ganzzahl speichert
        int x;

        // Initialisierung
        x = 10;

        // Wertzuweisung / Expression
        // <Variable> = <Ausdruck>
        // Weise der Variablen <Variable> den Wert zu
        // den der Ausdruck rechts ergibt
        x = 20 + 30;
        x = 20;

        // Erhöhe x um 5
        x = x + 5;

        // Negative Zahlen gehen
        x = -100;

        x = 1_000_000;
        System.out.println(x);
    }

    public static void findeMaximum() {
        // min: 2_100_000_000;
        // max: 2_150_000_000
        int x = 2_147_483_647;
        System.out.println(x);

        x = x + 1; // erhöhe x um 1
        System.out.println(x);
    }
}
