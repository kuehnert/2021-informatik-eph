public class TestGeld {
    public static void testGeld() {
        System.out.println("TestGeld.testGeld()");
        Geld geldbetrag = new Geld();
        geldbetrag.betrag = 0.8;
        System.out.println(geldbetrag.gibBetrag());
        System.out.println("Betrag: " + geldbetrag.gibBetrag());

    }
}
