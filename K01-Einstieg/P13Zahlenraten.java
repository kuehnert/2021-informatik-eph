import java.util.Random;
import java.util.Scanner;

public class P13Zahlenraten {
    /*
     * Zahlenraten
     * 1. PC denkt sich eine zufällige Zahl zw. 1 und 100
     * 2. Spieler muss sie raten
     * 3. Der PC meldet zurück, ob
     *    a. die Zahl kleiner ist als die gesuchte
     *    b. die Zahl größer ist als die gesuchte
     *    c. die Zahlen gleich, d.h. der Spieler hat gewonnen
     */
    public static void zahlenraten() {
        Random generator = new Random();
        Scanner tastatur = new Scanner(System.in);
        
        int computerZahl = generator.nextInt(100) + 1;
    }
}
