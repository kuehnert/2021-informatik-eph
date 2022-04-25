public class B23ListenVergleichen {
    public static void vergleiche() {
        String[] liste1 = {
                "Anna",
                "Dieter",
                "Karl",
                "Klaus",
                "Konrad",
                "Max",
                "Peter",
                "Siegfried"
            };

        String[] liste2 = {
                "Dieter",
                "Dietrich",
                "Konrad",
                "Lara",
                "Marele",
                "Otto",
                "Felix",
                "Peter",
                "Tom"
            };

        // Hier beginnt das Programm
        String[] liste3 = new String[liste1.length];
        int zaehler3 = 0;

        for (int zaehler1 = 0; zaehler1 < liste1.length; zaehler1++) {
            String gesucht = liste1[zaehler1];

            int zaehler2 = 0;
            while(zaehler2 < liste2.length) {
                String wort2 = liste2[zaehler2];
                if(wort2 == gesucht) {
                    liste3[zaehler3] = gesucht;
                    zaehler3++;
                }

                zaehler2++;
            }
        }

        liste3 = Utils.truncate(liste3, zaehler3);
        Utils.arrayAusgeben(liste3);

    }
}
