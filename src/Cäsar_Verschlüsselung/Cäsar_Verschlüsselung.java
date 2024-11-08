package Cäsar_Verschlüsselung;

import java.util.Scanner;

public class Cäsar_Verschlüsselung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Text: ");
        // Benutzer gibt den Text ein

        String s = scanner.nextLine();
        int offset = 2;

        String encrypted = encrypt(s, offset);
        System.out.println(" " + encrypted);
    }

    public static String encrypt(String s, int offset) {
        String result = "";
        for (char c : s.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                result += (char) (((c - 'a' + offset) % 26) + 'a');

            } else if (c >= 'A' && c <= 'Z') {
                result += (char) (((c - 'A' + offset) % 26) + 'A');

            } else {
                result += c;
            }
        }
        return result;
    }
}


// Bei der Cäsar-Verschlüsselung werden die Buchstaben um eine fixe Anzahl Stellen verschoben (z.B. 2) a wird zu c, f wird zu h, z wird zu b usw.
// Implementiere eine Methode encrypt(String):String und eine Methode decrypt(String):String