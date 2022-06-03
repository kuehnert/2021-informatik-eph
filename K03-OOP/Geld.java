public class Geld {
    double betrag;
    
    public String gibBetrag() {
        return String.format("%.2f€", betrag);
    }
}
