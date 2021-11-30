public class P11Schleifen {

    public static void schleife1() {
        // while (<ausdruck>) { ... Befehle ...}
        int geld = 0;
        while (geld < 10) { 
            System.out.println("Franz: Bitte gib mir Geld");
            System.out.println("Nino wirft einen Euro in den Hut");
            geld = geld + 1;
            System.out.println("Franz hat " + geld + " Euro");
        }

        System.out.println("Franz kann den Big Mac kaufen");
    }

    public static void timer() {
        int t = 10;
        while (t > 0) {
            System.out.println("t - " + t + " Sekunden");
            t = t - 1;
        }

        // t => 0
        System.out.println("Lift-Off!");
    }

    public static void timerMitVerzoegerung() {
        int t = 10;
        while (t > 0) {
            System.out.println("t - " + t + " Sekunden");
            t = t - 1;
            try {
                Thread.sleep(1000);
            } catch (Exception e) {}
        }

        // t => 0
        System.out.println("Lift-Off!");
    }

    // Hausis
    // 1. Schreiben Sie eine Schleife, welche die 7er-Reihe
    // von 7 bis 140 ausgibt
    public static void siebener() {
        int x;
        x = 7;
        
        while (x <= 140) {
            System.out.println(x);
            x = x + 7;
        }
    }

    // 2. Schreiben Sie eine Schleife welche die Zahlen von 1 bis 200 ausgibt,
    //    außer die, die durch 7 teilbar sind
    public static void schleife3() {
        int x;
        x = 1;
        int y;
        y = 7;
        
        while (x <= 70) {
            if (x == y) {                
                y = y + 7;
            } else {
                System.out.println(x);
            }
            x = x + 1;
        }
        
    }
}
