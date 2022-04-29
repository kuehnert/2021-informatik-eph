public class B25Aktienhandel {
    /*
     * Eine Serie von Aktienkursen ist gegeben, wobei
     * jede Stelle einen Tag repräsentiert und der Wert
     * an der Stelle den Aktienkurs an diesem Tag.
     * Bestimmen Sie den maximalen Gewinn, der erwirtschaftet
     * werden kann, wenn man genau einmal Aktien kaufen
     * und einmal wieder verkaufen kann.
     * Der Kauf muss vor dem Verkauf stattfinden!
     * 
     * Wenn kein Gewinn möglich ist, soll 0 zurückgegeben
     * werden {100, 50, 20}, {1001, 1001, 1001}.
     */
    public static void haendler(int[] a) {
        // Hausaufgabe:
        // max = bestimme das Maximum im Array
        // min = bestimme das Minimum
        int min = B24Minimum.findeKleinste(a);
        System.out.println(min);
        
        // gib max - min zurück
        
        
    }
    
    public static void beispiel() {
        int[] kurse = {386, 636, 527, 178, 297, 501, 302, 
            111, 404, 506, 666, 890, 141, 416, 182};
        
        haendler(kurse);
    }
}
