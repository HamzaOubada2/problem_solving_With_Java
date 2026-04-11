
import java.util.Arrays;

public class ValidAnagram {

    public static void main(String[] args) {
        String s = "Hamza";
        String t = "Hmaza";

        boolean result = isAnagram(s, t);
        System.out.println(result);
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        Arrays.sort(sArray);
        Arrays.sort(tArray);

        return Arrays.equals(sArray, tArray);
    }
}