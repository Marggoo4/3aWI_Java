package Würfelspiel;

import java.util.Random;
import java.util.Scanner;


public class Würfelspiel {


    public static void main(String[] args) {
        start();
    }

    public static void start() {
        boolean playing = true;

        System.out.println("Willkommen beim Würfelspiel");
        Scanner scanner = new Scanner(System.in);

        while (playing) {
            System.out.println("Bitte wählen sie eine Option");
            System.out.println("1 Spiel starten");
            System.out.println("2 Beenden");

            int selection = scanner.nextInt();

            switch (selection) {
                case 1:
                    startGame();
                    break;
                case 2:
                    System.out.println("Auf wiedersehen");
                    playing = false;
                    break;
                default:
                    System.out.println("Ungültige Auswahl. Bitte wählen Sie 1 oder 2.");

            }
        }
        scanner.close();
    }

    public static void startGame() {
        Random random = new Random();
        int playerSum = 0;
        int computerSum = 0;

        System.out.println("Das Spiel beginnt! Du hast 6 Würfe.");

        for (int i = 1; i <= 6; i++) {
            int playerRoll = random.nextInt(6) + 1;
            System.out.println("Wurf " + i + ": Du hast eine " + playerRoll + " geworfen.");
            playerSum += playerRoll;
        }

        System.out.println("Deine Gesamtsumme ist: " + playerSum + " Punkte.");


        System.out.println("Jetzt ist der Computer dran.");
        for (int i = 1; i < 6; i++) {
            int computerRoll = random.nextInt(6) + 1;
            System.out.println("Wurf " + i + ": Der Computer hat eine " + computerRoll + " geworfen.");
            computerSum += computerRoll;
        }
        System.out.println("Die Gesamtsumme des Computers ist: " + computerSum + " Punkte.");


        if (playerSum > computerSum) {
            System.out.println("Herzlichen Glückwunsch! Du hast das Spiel gewonnen");
        } else if (playerSum < computerSum) {
            System.out.println("Der Computer hat gewonnen");
        } else {
            System.out.println("Das Spiel ist unentschieden");
        }
    }

}


/*
Erstelle ein Würfelspiel! Du spielst gegen den Computer. Wenn das Spiel startet (mit einem kleinen Menü), hat der Spieler 6 Würfe.
Er spielt dabei gegen den Computer.
Wenn die Augensumme höher ist als jene des Computers hat der Spieler gewonnen, ansonsten der Computer.
*/