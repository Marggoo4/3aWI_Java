package Wörter_raten;

import java.util.Random;
import java.util.Scanner ;


public class Wörter_raten {
    public static void main(String[] args) {

        String[] woerter = {"computer", "programmieren", "java", "software", "entwickler", "algorithmus", "datenbank"};


        Random random = new Random();
        String wort = woerter[random.nextInt(woerter.length)];


        char[] rateWort = new char[wort.length()];
        for (int i = 0; i < wort.length(); i++) {
            rateWort[i] = '*';
        }


        Scanner scanner = new Scanner(System.in);

        System.out.println("Willkommen beim Wörter-Raten-Spiel!");
        System.out.println("Das zu ratende Wort hat " + wort.length() + " Buchstaben.");


        while (true) {

            System.out.print("Aktuelles Wort: ");
            System.out.println(rateWort);


            System.out.print("Welcher Buchstabe könnte im gesuchten Wort stecken? ");
            char buchstabe = scanner.next().toLowerCase().charAt(0);


            boolean gefunden = false;
            for (int i = 0; i < wort.length(); i++) {
                if (wort.charAt(i) == buchstabe) {
                    rateWort[i] = buchstabe;  // Buchstabe an der richtigen Stelle setzen
                    gefunden = true;
                }
            }

            // Falls der Buchstabe nicht gefunden wurde, eine Nachricht ausgeben
            if (!gefunden) {
                System.out.println("Der Buchstabe " + buchstabe + " ist nicht im Wort.");
            }

            // Überprüfen, ob das ganze Wort erraten wurde
            if (new String(rateWort).equals(wort)) {
                System.out.println("Herzlichen Glückwunsch! Du hast das Wort erraten: " + wort);
                break;
            }
        }

        scanner.close();
    }
}
