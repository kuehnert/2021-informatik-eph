import java.util.Scanner;

public class P09Automat {
   public static void auswahl() {
        Scanner tastatur = new Scanner(System.in);
        
        System.out.println("1. Cola");
        System.out.println("2. Fanta");
        System.out.println("3. Mezzomix");
        System.out.println("4. Sprudel");
        System.out.print("Deine Auswahl: ");
        
        int eingabe = tastatur.nextInt();
        System.out.println("Du hast " + eingabe + " ausgewählt");
        
        // Cola 200 kcal
        // Fanta 250 kcal
        // Mezzomix 550 kcal
        // Sprudel 0 kcal
        int kcal = 0;
        if (eingabe == 1) {
            System.out.println("200 kcal");
            kcal = kcal + 200;
        } else if (eingabe == 2) {
            System.out.println("200 kcal");
        } else if (eingabe == 3) {
            System.out.println("200 kcal");
        } else {
            System.out.println("200 kcal");
        }
       
        System.out.println("Insg. " + kcal + " kcal");
    }
}
