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
        
        // Ausgabe
        for (int number = 0; number < 10; number = number + 1) {
            System.out.println( myArray[number] );
        }
    }
    
    // 1. Schreiben Sie eine Methode, welche die ersten 1000 Zahlen der
    //    Dreier-Reihe in einem Array speichert, also 0, 3, 6, 9, ... 2997
    
    // 2. Füllen Sie ein Array von 500 Stellen mit Zufallszahlen zwischen
    //    0 und 1000.
    
    // 3. Füllen Sie ein Array von 200 Stellen mit absteigenden Zahlen
    //    von 199 bis 0: 199, 198, 197, ... 3, 2, 1, 0.
    
    
}
