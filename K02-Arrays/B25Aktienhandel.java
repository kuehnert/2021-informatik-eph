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
    public static int haendler(int[] a) {
        // Hausaufgabe:
        // max = bestimme das Maximum im Array
        int max = B24Minimum.findeGroesste(a);
        // min = bestimme das Minimum
        int min = B24Minimum.findeKleinste(a);

        // gib max - min zurück
        int gewinn = max - min;
        return gewinn;
    }

    public static int bruteForceHaendler(int[] a) {
        // 1. Erstelle einen int gewinn und setze ihn auf 0
        //    & einen int kaufDatum und setze sie auf 0
        //    & einen int verkaufsDatum und setze sie auf
        //    kaufDatum + 1
        int gewinn = 0;
        int kauf = 0;

        // 2. 
        while (kauf < a.length - 1) {
            int verkauf = kauf + 1;

            while (verkauf < a.length) {
                int kaufkurs = a[kauf];
                int verkaufskurs = a[verkauf];
                int aktGewinn = verkaufskurs - kaufkurs;

                if (aktGewinn > gewinn) {
                    gewinn = aktGewinn;
                }

                verkauf = verkauf + 1;
            }

            kauf = kauf + 1;
        }

        return gewinn;
    }

    public static void beispiel() {
        int[] kurse = {386, 636, 527, 178, 297, 501, 302, 
                890, 404, 506, 666, 111, 141, 416, 182};

        int gewinn = haendler(kurse);
        System.out.println(gewinn);

        int gewinn2 = bruteForceHaendler(kurse);
        System.out.println(gewinn2);
    }
}
