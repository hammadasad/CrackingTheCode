package Chapter1Arrays;

import java.util.HashMap;

/**
 * 1.1
 * Implement an algorithm to determine if a string has all unique characters.
 * What if you can not use additional data structures?
 * Created by admin on 2015-11-03.
 */

public class UniqueChars {

    //With Additional Data Struct
    public boolean isStringUnique(String word) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int x = 0; x < word.length() ; x++ ) {
            map.put(word.charAt(x), 0);
        }
        if(map.keySet().size() == word.length()) {
            return true;
        }
        return false;
    }

    //Without " "
    public boolean isStringUnique2(String word) {
        for(int x = 0; x < word.length(); x++ ) {
            for(int y = x + 1; y < word.length() ; y++) {
                if(word.charAt(x) == word.charAt(y)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        UniqueChars test = new UniqueChars();
        System.out.println(test.isStringUnique("hammad"));
        System.out.println(test.isStringUnique("abcdefghijk"));
        System.out.println(test.isStringUnique2("hammad"));
        System.out.println(test.isStringUnique2("abcdefghijk"));
    }
}
