/* Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings. */
public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = { "Hamza", "Hamssan", "Hamada" };

        // Get First Word In List ====> "flower"
        String firstWord = strs[0];
        // we Save Common Letter
        String prefix = "";

        // This Loop scanne first letter (flower) letter by letter using charAt()
        for (int i = 0; i < firstWord.length(); i++) {
            char c = firstWord.charAt(i);
            /*
             * i = 0 -> c = f
             * i = 1 -> c = l
             * i = 2 -> c = o
             * i = 3 -> c = w
             * i = 4 -> c = e
             * i = 5 -> c = r
             */

            // This Looop to compare with remaining words ("flow" , "flight")
            for (int j = 1; j < strs.length; j++) {
                if (i >= strs[j].length() || strs[j].charAt(i) != c) {
                    /*
                     * # i >= strs[j].length:
                     * we have word (flow) ---> length=4 & indexes=3
                     * if i = 4 soo the program stoped because we dont have char in index 4 we have just 3
                     *
                     * # strs[j].charAt(i) != c:
                     * here if we find different letter the programm stoped!
                     * flower
                     * flow
                     * soo f == f & l == l & o == o & w == w BUT er isnot in flow
                     */
                    System.out.println(prefix);
                    return;
                }
            }
            prefix += c;
            /*
             * For example if first letter f in all letters we added in prefix="f"
             */
        }
    }
}

/*
 * How Programm work:
 * i = 0
 * c = f
 * flowers -> true
 * flow -> true
 * flight -> true
 * 
 * prefix = "f"
 * 
 * -----------------------
 * i = 1
 * c = l
 * flowers -> true
 * flow -> true
 * flight -> true
 * 
 * prefix = "fl"
 * 
 * -----------------
 * i = 2
 * c = o
 * flower -> true
 * flow -> false
 * flight -> false
 * 
 * prefix = "fl"
 * 
 * !Programme Stoped
 * 
 */