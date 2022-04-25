class Utils {
   public static void arrayAusgeben(String[] a) {
      for (int i = 0; i < a.length; i++) {
         System.out.println(a[i]);
      }
   }

   public static String[] truncate(String[] a, int l) {
      String[] newA = new String[l];
      for (int i = 0; i < l; i++) {
         newA[i] = a[i];
      }
      return newA;
   }
}
