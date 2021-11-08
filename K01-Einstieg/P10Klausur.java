import java.util.Scanner;

public class P10Klausur {
    public static void aufgabe4a() {
        Scanner tastatur = new Scanner(System.in);
        int x = tastatur.nextInt();

        if (x < 3) {
            x = x + 5; // erhöhe x um 5
        } else {
            x = x - 1; // verringere x um 1
        }

        System.out.println("x: " + x);
    }

    public static void aufgabe4c() {
        Scanner tastatur = new Scanner(System.in);
        int x = tastatur.nextInt();

        if (x < 3) {
            x = x + 5; // erhöhe x um 5
        } 

        if (x >= 3) {
            x = x - 1; // verringere x um 1
        }

        System.out.println("x: " + x);
    }

    public static void thermometer() {
        Scanner tastatur = new Scanner(System.in);
        int temp = tastatur.nextInt();

        if (temp < -10) {
            System.out.println("Brrr, zu kalt");
        } else if (temp < 5) {
            System.out.println("Schlittschuh");
        } else if (temp < 18) {
            System.out.println("Dicker Pulli");
        } else if (temp < 24) {
            System.out.println("Lecker warm");
        } else {
            System.out.println("Freibad");
        }
    }

}
