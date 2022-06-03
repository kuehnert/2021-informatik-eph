import java.util.Scanner;

/*
 * WÜNSCHE an das Programm:
 *   * Wechselgeld geben bei Überzahlung
 *   * Verabschiedung
 *   * Bediene mehrere Kunden
 *   * Überprüfe auf gültige Zahlungsmittel
 *   * Verbessere die Ausgabe von Geldbeträgen
 */

// Soll Fahrkarten verkaufen
// Für Öffi-Tickets
// Statisch:
// Automat.begruesse();

// Dynamisch, objekt-orientiert:
// Automat automat = new Automat();
// automat.begruesse();

public class Automat {
    // Instanzvariablen (=> Instanz == Objekt)
    private Scanner tastatur = new Scanner(System.in);
    private static final Geld TICKETPREIS = new Geld();
    private int anzahl = 0; 
    private double zuBezahlen = 0.0;

    // Begrüßung
    public void begruesse() {
        TICKETPREIS.betrag = 0.8;
        System.out.println("Willkommen bei Ticketautomaten für MrK-Railways!");
    }

    // Ticketanzahl wählen
    public void waehleTickets() {
        System.out.println("Wie viele Tickets möchtest Du? ");
        anzahl = tastatur.nextInt();
        System.out.println("Du willst also " + anzahl + " Tickets.");
    }

    // Ticketart wählen (Kind/Erw., Zone)

    // Zu bezahlenden Betrag berechnen & ausgeben
    public void berechneSumme() {
        zuBezahlen = anzahl * TICKETPREIS;
        // double bereinigt = Math.round(zuBezahlen * 100) / 100.0;
        // System.out.println("Bezahle " + bereinigt + " €.");
        // GIB AUS
    }

    // Bargeld annehmen
    public void bezahle() {
        // Nimm nacheinander ein gültiges Geldstück bzw. -schein
        // entgegen und ziehe den Betrag von zuBezahlen ab,
        while (zuBezahlen > 0.01) {
            System.out.println("Bezahlen Sie: " + zuBezahlen + "€");
            double geldstueck = tastatur.nextDouble();
            zuBezahlen = zuBezahlen - geldstueck;
        }
    }

    // Tickets in der richtigen Anzahl drucken
    public void druckeTickets() {
        for (int i = 0; i < anzahl; i = i + 1) {
            druckeTicket();
        }
    }

    public void druckeTicket() {
        System.out.println("#############################");
        System.out.println("##     Mr K's Railways     ##");
        System.out.println("##         1 Ticket        ##");
        System.out.println("#############################\n");
    }
    
    public void zeigeMenue() {
        begruesse();
        waehleTickets();
        berechneSumme();
        bezahle();
        druckeTickets();
    }
}
