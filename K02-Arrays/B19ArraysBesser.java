public class B19ArraysBesser {
    // Dreierreihe
    // Soll ein Array mit <anzahl> Elementen erzeugen, die die 7-Reihe
    // darstellen.
    // 3 => {7, 14, 21}
    // 5 => {7, 14, 21, 28, 35}
    // Rückgabe: das fertige Array
    // Pro: Zusätzlicher Parameter, der die Art der Reihe bestimmt
    public static int[] reihen(int anzahl, int basis) {
        int[] zahlen;
        zahlen = new int[anzahl];

        for (int i = 0; i < anzahl; i = i + 1) {
            zahlen[i] = (i + 1) * basis;
        }

        return zahlen;
    }

    // Zufallszahlen
    // Erstelle ein Array mit n Elementen, mit Werten bis zu max
    // 2 Parameter: 
    // n: Größe des Arrays
    // p: Maximale Höhe der Zahlen -1

    // Absteigend
    public static int[] absteigend(int laenge) {
        int[] zahlen;
        zahlen = new int[laenge];
        
        for (int i = 0; i < zahlen.length; i = i + 1) {
            zahlen[i] = zahlen.length - 1 - i;
        }
        
        return zahlen;
    }

    public static void main() {
        int[] rueckgabe;
        rueckgabe = reihen(20, 18);
        B18Arrays.ausgeben(rueckgabe);
        System.out.println("-----------------------------------");
        
        rueckgabe = absteigend(7);
        B18Arrays.ausgeben(rueckgabe);
        
    }
    
    // String eingabe = tastatur.nextLine();
    // int zahl = Integer.parseInt(eingabe);
    // benutzerZahlen[i] = zahl;
}
