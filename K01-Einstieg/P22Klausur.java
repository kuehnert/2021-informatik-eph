public class P22Klausur {
    public static int minimumKaputt(int[] a) {
        int minimum = a[0];

        for (int i = 1; i < a.length; i++) {
            if(a[i] < minimum) {
                minimum = a[i];
            }
        }

        return minimum;
    }

    // Hauptprogramm
    public static void main(String[] args) {
        int[] a = { 7, 2, 9, 3, 4 };
        int ergbnis = minimumKaputt(a);
        System.out.println(ergbnis);
    }
}
