public class P17ForSchleife {
    public static void uebung1() {
        // Zähle von 0 bis 9
        for (int number = 0; number < 10; number = number + 1) {
            System.out.print(number + " ");
        }
    }

    public static void uebung2() {
        // 100, 99, 98, ..., 3, 2, 1 
        for (int i = 100; i > 0; i = i - 1) {
            System.out.print(i + " ");
        }
    }
}
