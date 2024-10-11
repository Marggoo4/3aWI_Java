package Bankomat;

import java.util.Scanner;

public class Bankomat {

    // Kontostand
    public static double balance = 0.0;

    public static void main(String[] args) {
        start();
    }


    // Startet den Bankomaten-Prozess
    public static void start() {
        boolean running = true;

        System.out.println("Willkommen beim Bankomaten!");
        Scanner scanner = new Scanner(System.in);

        while (running) {
            System.out.println("Bitte wählen sie eine Option");
            System.out.println("1 Einzahlen");
            System.out.println("2 Abheben");
            System.out.println("3 Kontostand anzeigen");
            System.out.println("4 Beenden");

            int selection = scanner.nextInt();

            switch (selection) {
                case 1:
                    System.out.println("Einzahlen?");
                    int value = scanner.nextInt();
                    balance += value;
                    System.out.println(value);
                    System.out.println("Du hast soeben " + value + " eingezahlt, dein neuer Kontostand beträgt " + balance);
                    break;
                case 2:
                    System.out.println("abheben");
                    int withdrawal = scanner.nextInt();
                    if (withdrawal > balance) {
                        System.out.println("Du hast zu wenig Geld auf dem Konto, dein aktueller Kontostand beträgt " + balance);
                    } else {
                        balance -= withdrawal;
                        System.out.println("Du hast soeben " + withdrawal + " abgehoben, dein neuer Kontostand beträgt " + balance);
                    }
                    break;
                case 3:
                    System.out.println("Dein Kontostand beträgt " + balance);
                    break;
                case 4:
                    System.out.println("Tschüss");
                    running = false;
                    break;
                default:
                    System.out.println("Ungültige Auswahl. Bitte wähle eine Option zwischen 1-4");

            }
        }
    }
}


     /*   Diese Aufgabe setzt sich aus allen gelernten Inhalten zusammen!
                Erstelle ein Programm, das einen Bankomaten simuliert. Folgende Möglichkeiten gibt es:
        1. Einzahlen
        2. Abheben
        3. Kontostand
        4. Beenden
*/