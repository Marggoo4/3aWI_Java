package Cäsar_Verschlüsselung;

public class Cäsar_Verschlüsselung {
    public static void main(String[] args) {
        String result = encrypt("abc");
        System.out.println(result);


        String decrypted = decrypt(result);
        System.out.println(decrypted);

    }

    public static String encrypt(String data) {
        StringBuilder result = new StringBuilder();

        String result = "";
        for (char c : s.toCharArray()) {
            if (c >= 'a' && c <= 'z') {

            } else {
                result += c;
            }
        }
        return result;
    }


    public static String decrypt(String data) {

    }

}

// Bei der Cäsar-Verschlüsselung werden die Buchstaben um eine fixe Anzahl Stellen verschoben (z.B. 2) a wird zu c, f wird zu h, z wird zu b usw.
// Implementiere eine Methode encrypt(String):String und eine Methode decrypt(String):String






