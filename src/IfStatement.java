package at.ran.basics;

import java.util.Random;




public class IfStatement {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Erstelle eine Zufallszahl zwischen 0 und 100

        Random random = new Random();
        int randomNumber = random.nextInt(100);

        if(randomNumber < 20) {

        } else if (randomNumber > 20 && randomNumber < 50) {

        }




    }
}