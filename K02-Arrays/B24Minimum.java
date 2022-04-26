public class B24Minimum {
    // 1. Erstelle eine Ganzzahl bisherigesMin
    // und setze sie auf den Wert der 1. Zahl
    // 2. Gehe von der 2. Zahl bis zur letzten
    // 3. Vergleiche jede dieser Zahlen mit
    //    bisherigesMin: speichere die kleinere
    //    wieder in bisherigesMin
    // 4. Gib bisherigesMin zurück

    public int findeKleinste(int[] zahlen) {
        // 1. Erstelle eine Ganzzahl bisherigesMin
        // und setze sie auf den Wert der 1. Zahl (1. => 0.)
        int bisherigesMin = zahlen[0];

        // 2. Gehe von der 2. (=> 1.) Zahl bis zur letzten
        for (int i = 1; i < zahlen.length; i = i + 1) {
            // 3. Vergleiche jede dieser Zahlen mit
            //    bisherigesMin
            if (zahlen[i] < bisherigesMin) {
                // speichere die kleinere wieder in bisherigesMin
                bisherigesMin = zahlen[i];
            }
        }

        // 4. Gib bisherigesMin zurück
        return bisherigesMin;
    }

    // Philipps Idee:
    // funktioniert, wenn nicht die kleinste Zahl an der 0. Stelle steht
    // finde kleinste Zahl und speichere sie in min
    // setze nächstgrößte auf die 1. Zahl
    // gehe durch das array
    // wenn eine Zahl kleiner als nächstgrößte ist
    // und größer als min
    // speichere sie als nächstgrößte

    // gib nächstgrößte zurück

    public int findeZweitKleinste(int[] zahlen) {
        // 1. Erstelle zwei Ganzzahlen min1, min2
        int min1 = zahlen[0];
        int min2 = zahlen[1];

        // Setze min1 auf die kleinere Zahl der ersten beiden Zahlen
        // und min2 auf die andere
        if (zahlen[1] < zahlen[0]) {
            min1 = zahlen[1];
            min2 = zahlen[0];
        }

        // 2. Gehe von der 3. Zahl bis zur letzten
        for (int i = 2; i < zahlen.length; i = i + 1) {
            // 3. Wenn aktuelle Zahl < min1:
            if (zahlen[i] < min1) {
                min2 = min1;
                min1 = zahlen[i];
            } else if (zahlen[i] < min2) {
                // Ansonsten wenn aktuelle Zahl < min2:
                min2 = zahlen[i];
            }
        }

        // Gib min2 zurück
        return min2;
    }    

    public void testeFindeKleinste()  {
        int[] zahlen = {4534, 23464, 489, 366, 5066, 8543, 3928, 
                47384, 30946, 8403, 422, 784 };
        int min = findeKleinste(zahlen);
        System.out.println("min:" + min);

        int min2 = findeZweitKleinste(zahlen);
        System.out.println("min2:" + min2);

    }
}
