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


        for (int i = 0; i < data.length(); i++) {
            char c = data.charAt(i);



        }
        return result.toString();
    }


    public static String decrypt(String data) {
        return result.toString();
    }

}