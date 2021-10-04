// Programmaufbau
public class P07Roboter {
    public void geheSchritt() {
        System.out.println("Gehe einen Schritt nach vorne!");
    }
    
    public void gehe10Schritte() {
        geheSchritt();
        geheSchritt();
        geheSchritt();
        geheSchritt();
        geheSchritt();
        geheSchritt();
        geheSchritt();
        geheSchritt();
        geheSchritt();
        geheSchritt();
    }
    
    public void dreheLinks() {
        System.out.println("Drehe mich nach links");
    }
    
    public void dreheRechts() {
        dreheLinks();
        dreheLinks();
        dreheLinks();
    }
}
