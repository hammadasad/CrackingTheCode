package Chapter1Arrays;

/**
 * 1.2
 * Write code to reverse a C-Style String.
 * (C-String means that “abcd” is represented as five characters, including the null character.)
 * Created by admin on 2015-11-03.
 */
public class ReverseCString {
    public static String reverse(String word) {
        String reversedWord = "";
        for(int x = word.length() - 2; x >= 0; x--) {
            reversedWord += word.charAt(x);
        }
        reversedWord += '\0';
        return reversedWord;
    }

    public static void main(String[] args) {
        //Case 1
        String input = "abcd" + '\0';
        System.out.println("input: " + input);
        String result = ReverseCString.reverse(input);
        System.out.println("output: " + result);

        //Case 2
        String input2 = "thisisateststringthatisverylong" + '\0';
        System.out.println("input: " + input2);
        String result2 = ReverseCString.reverse(input2);
        System.out.println("output: " + result2);
    }
}
