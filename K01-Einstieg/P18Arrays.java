import java.util.Random;

public class P18Arrays {
    // Datentyp zum Speichern mehrerer Werte eines Typs
    public static void arrays1() {
        // Deklaration
        int[] myArray;

        // Initialisierung
        // Erstelle ein neues int Array mit 10 Elementen
        myArray = new int[10];

        // Lesender Zugriff
        System.out.println( myArray[0] );
        System.out.println( myArray[1] );
        System.out.println( myArray[2] );
        System.out.println( myArray[3] );
        System.out.println( myArray[4] );
        System.out.println( myArray[5] );
        System.out.println( myArray[6] );
        System.out.println( myArray[7] );
        System.out.println( myArray[8] );
        System.out.println( myArray[9] );

        // Schreibender Zugriff
        myArray[0] =  5; // Setze an die 0. Stelle den Wert  5
        myArray[1] = 10; // Setze an die 1. Stelle den Wert 10
        myArray[2] = 15; // Setze an die 2. Stelle den Wert 15
        myArray[3] = 20; // Setze an die 3. Stelle den Wert 20
    }

    public static void fuenfen() {
        // Erstelle ein Array mit 4 Zahlen, und setze jede auf 5
        int[] myArray;
        myArray = new int[4];

        // myArray[0] = 5;
        // myArray[1] = 5;
        // myArray[2] = 5;
        // myArray[3] = 5;
        for (int number = 0; number < 4; number = number + 1) {
            myArray[number] = 5;
        }
        
        // Ausgabe
        for (int number = 0; number < 4; number = number + 1) {
            System.out.println( myArray[number] );
        }
    }

    public static void quadratzahlen() {
        // Erstelle ein Array mit 10 Zahlen, und setze jede auf 
        // die nächste Quadratzahl von 1 bis 100
        int[] myArray;
        myArray = new int[10];

        for (int number = 0; number < 10; number = number + 1) {
            myArray[number] = number * number;
        }
        
        ausgeben(myArray);
    }
    
    // 1. Schreiben Sie eine Methode, welche die ersten 1000 Zahlen der
    //    Dreier-Reihe in einem Array speichert, also 0, 3, 6, 9, ... 2997
    public static void dreier() {
        // Erstelle ein Array mit 10 Zahlen, und setze jede auf 
        // die nächste Quadratzahl von 1 bis 100
        int[] myArray;
        myArray = new int[100];

        for (int number = 0; number < myArray.length; number = number + 1) {
            myArray[number] = number * 3;
        }
        
        ausgeben(myArray);
    }
    
    // 2. Füllen Sie ein Array von 500 Stellen mit Zufallszahlen zwischen
    //    0 und 1000.
    public static void zufallszahlen() {
        Random generator = new Random();
        int[] zahlen;
        zahlen = new int[500];
        
        for (int i = 0; i < zahlen.length; i++) {
            zahlen[i] = generator.nextInt(1000);
        }
        
        ausgeben(zahlen);
    }
    
    // 3. Füllen Sie ein Array von 200 Stellen mit absteigenden Zahlen
    //    von 199 bis 0: 199, 198, 197, ... 3, 2, 1, 0.
    public static void absteigend(int laenge) {
        int[] zahlen;
        zahlen = new int[laenge];
        
        for (int i = 0; i < zahlen.length; i = i + 1) {
            zahlen[i] = zahlen.length - 1 - i;
        }
        
        ausgeben(zahlen);
    }
    
    public static void hauptprogramm() {
        // absteigend(20);
        // System.out.println("---------------------------");
        // absteigend(10);
        // System.out.println("---------------------------");
        
        verfuenffachen(4); // verworfen
        System.out.println(  verfuenffachen(4)  );
        
        int z = 50;
        System.out.println(z); // 1. 50

        z = verfuenffachen(z);
        System.out.println(z); // 2. 250
        
        z = verfuenffachen(z);
        System.out.println(z); // 3. 1250
        
        System.out.println( verfuenffachen( verfuenffachen(3) ) );
    }
    
    // Rückgaben
    // Rückgabedatentyp => statt void z.B. int, double, String
    // Rückgabewert => Wert hinter "return": Tatsächlicher Wert, Z.B. 3, 3.5, "Hallo"
    public static int verfuenffachen(int zahl) {
        // System.out.println(zahl * 5) ; // Ausgabe
        return zahl * 5;
    }
    
    public static void ausgeben(int[] ar) {
        for (int number = 0; number < ar.length; number = number + 1) {
            System.out.println(number + ". Stelle: " + ar[number] );
        }
    }
    
    // Hausaufgabe vom 15.2.
    // Schreiben Sie eine Methode "multi", welche eine Ganzzahl
    // als Parameter erhält, sie mit einer zufälligen Zahl zwischen
    // 1 und 10 multipliziert und das Ergebnis zurückgibt
    public static int multi(int zahl) {
        Random gen = new Random();
        
        // int zuffi = gen.nextInt(10); // => 0..9
        int zuffi = gen.nextInt(10) + 1; // => 1..10
        
        return zuffi * zahl;
    }
    
    // Bekommt ein Array mit Ganzzahlen
    // Verändert jedes Element so, dass es mit 100 multipliziert wird
    // Und gibt das geänderte Array zurück
    // Beispiel: {4, 7, 2} => {400, 700, 200}
    public static int[] verhundertfachen(int[] zahlen) {
        // gehe mit einer for-Schleife durch das Array
        // multipliziere jedes Element (an Stelle i) mit 100
        // und speichere das Ergebnis wieder im Element an Stelle i
        return zahlen;
    }
    
    public static void testVerhundertfachen() {
        int[] a = new int[]{1, 2, 3};
        a = verhundertfachen(a);
        ausgeben(a);
    }
}










