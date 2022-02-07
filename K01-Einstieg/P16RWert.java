import java.util.Scanner;

public class P16RWert {
    public static void berechneRWert() {
        Scanner tastatur = new Scanner(System.in);

        System.out.print("Bitte gib die Population ein: ");
        // String eingabe = tastatur.nextLine();
        // double population = Double.parseDouble(eingabe);
        double population = 100;

        System.out.print("Bitte gib den r-Wert ein: ");
        // eingabe = tastatur.nextLine();
        // double r = Double.parseDouble(eingabe);
        double r = 1.2;

        int generation = 0;
        while (generation <= 20) {
            System.out.printf("%2d %9.2f %n", generation, population);

            population = population * r; // Berechne neue pop.
            generation = generation + 1; // Erhöhe generation
        }
    }

    public static void berechneZinsen() {
        Scanner tastatur = new Scanner(System.in);

        System.out.print("Bitte gib das anzulegende Vermögen in € ein: ");
        String eingabe = tastatur.nextLine();
        double vermoegen = Double.parseDouble(eingabe);

        System.out.print("Bitte gib den Zinssatz in Prozent ein: ");
        eingabe = tastatur.nextLine();
        double zinssatz = 1 + Double.parseDouble(eingabe) / 100.0;

        System.out.print("Anlage über wie viele Jahre: ");
        eingabe = tastatur.nextLine();
        int jahre = Integer.parseInt(eingabe);

        int jahr = 0;
        while (jahr <= jahre) {
            System.out.printf("%2d. Jahr %9.2f € %n", jahr, vermoegen);

            vermoegen = vermoegen * zinssatz; 
            jahr = jahr + 1; 
        }
    }

    public static void berechneZinsen2() {
        Scanner tastatur = new Scanner(System.in);

        System.out.print("Bitte gib das anzulegende Vermögen in € ein: ");
        String eingabe = tastatur.nextLine();
        double vermoegen = Double.parseDouble(eingabe);

        System.out.print("Bitte gib den Zinssatz in Prozent ein: ");
        eingabe = tastatur.nextLine();
        double zinssatz = 1 + Double.parseDouble(eingabe) / 100.0;

        System.out.print("Anlage über wie viele Jahre: ");
        eingabe = tastatur.nextLine();
        int jahre = Integer.parseInt(eingabe);

        {
            int jahr = 0;
            while (jahr <= jahre) {
                System.out.printf("%2d. Jahr %9.2f € %n", jahr, vermoegen);

                vermoegen = vermoegen * zinssatz; 
                jahr = jahr + 1; 
            }
        }

        for (int jahr = 0; jahr <= jahre; jahr = jahr + 1) {
            System.out.printf("%2d. Jahr %9.2f € %n", jahr, vermoegen);
            vermoegen = vermoegen * zinssatz; 
        }
    }
}
