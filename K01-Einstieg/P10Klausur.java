import java.util.Scanner;

public class P10Klausur {
    public static void aufgabe4() {
        Scanner tastatur = new Scanner(System.in);
        int x = tastatur.nextInt();

        if (x < 3) {
            x = x + 5; // erhöhe x um 5
        } else {
            x = x - 1; // verringere x um 1
        }

        System.out.println("x: " + x);
    }
}
