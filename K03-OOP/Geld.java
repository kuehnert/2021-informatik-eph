public class Geld {
    double betrag;
    
    public void multipliziereMit(double faktor) {
        betrag = betrag * faktor;
    }
    
    public String gibBetrag() {
        return String.format("%.2f€", betrag);
    }
}
