import java.util.Scanner;

public class P16RWert {
    public static void berechne() {
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
}
