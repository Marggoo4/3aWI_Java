package String_Helper;

public class String_Helper {
    public static void main(String[] args) {
        boolean isPalindrome = isPalindrome("anna");
        // so
        if (isPalindrome) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        /* Test count */
        int amount = countLetters("andi", 'a');
        // sollte 1 sein
        System.out.println(amount);

        /* Reverse String */
        String reversed = reverseString("hello");
        // sollte olleh sein
        System.out.println(reversed);

        /* Print amount of letters */
        int amountOfLetters = getAmountOfLetters("sepp");
        // sollte 4 sein
        System.out.println(amountOfLetters);
    }

    public static boolean isPalindrome(String word) {
        return true;
    }

    public static int countLetters(String word, char c) {
        return 7;
    }

    public static String reverseString(String word) {
        return "dlrow";
    }

    public static int getAmountOfLetters(String word) {
        return 5;
    }
}
