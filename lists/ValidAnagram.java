
import java.util.Arrays;

public class ValidAnagram {

    public static void main(String[] args) {
        String s = "Hamza";
        String t = "Hmaza";

        boolean result = isAnagram(s, t);
        System.out.println(result);
    }

    public static boolean isAnagram(String s, String t) {
        // If for Example s="Hamza" & t="Ham" return false because s.length() > t.length()
        if (s.length() != t.length())
            return false;

        // Here we need to convert String to Array
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();


        // Here to Order by letter
        Arrays.sort(sArray);
        Arrays.sort(tArray);

        return Arrays.equals(sArray, tArray);
    }
}

/*
 * Given two strings s and t, return true if the two strings are anagrams of
 * each other, otherwise return false.
 *
 * An anagram is a string that contains the exact same characters as another
 * string, but the order of the characters can be different.
 *
 * Example 1:
 * Input: s = "racecar", t = "carrace"
 * Output: true
 *
 * Example 2:
 * Input: s = "jar", t = "jam"
 * Output: false
 *
 * Constraints:
 * s and t consist of lowercase English letters.
 */