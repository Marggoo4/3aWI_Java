package While_Loop;

import java.util.Random;


public class While_Loop {
    public static void main(String[] args) {
        // Erstelle ein Programm, dass Zufallszahlen zwischen 10 und 30 generiert.
        // Das Programm soll die Zufallszahlen zusammenzählen.
        // Sobald die Zahl 15 oder die Zahl 25 kommt, wird das Programm beendet und die Summe der vorherigen Zufallszahlen ausgegeben!
        Random random = new Random();
        int randomNumber;
        boolean isFinished = false;
        int sum = 0;

        while (!isFinished) {
            randomNumber = random.nextInt(21) + 10;
            System.out.println("Die Zufallszahl ist" + randomNumber);


            if (randomNumber == 15 || randomNumber == 25) {
                System.out.println("Die Zahl" + randomNumber + "wurde generiert. Das Programm wird beendet");
                isFinished = true; // Beendet die Schleife
            } else {
                sum += randomNumber;
            }
        }
        System.out.println("Summe der vorherigen Zufallszahlen: " + sum);




    }
}



