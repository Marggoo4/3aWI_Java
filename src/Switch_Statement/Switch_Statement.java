package Switch_Statement;

import java.util.Random;

public class Switch_Statement {
    public static void main(String[] args) {
        Random random = new Random();

        // Erstelle eine Zufallszahl zwischen 5 und 10
        int randomNumber = random.nextInt(6) + 5;

        System.out.println("Zufallszahl: " + randomNumber);


        switch (randomNumber) {
            case 10:
                System.out.println("Ten");
                break;
            case 9:
                System.out.println("Nine");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 5:
                System.out.println("Five");
                break;
        }

        // Wenn der Wert 10 ist gib aus Ten
        // Wenn der Wert 9 ist gib aus Nine
        // Wenn der Wert 8 ist gib aus Eight
        // etc.








    }
}
