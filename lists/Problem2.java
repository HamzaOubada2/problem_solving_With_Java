public class Problem2 {
    public static void main(String[] args) {
        int[] nums = { 4, 7, 2, 9, 1 };
        int target = 11;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    System.out.println(true + " (" + nums[i] + "+" + nums[j] + ")");
                    break;
                }
            }
        }
    }
}

/*
 * "Given an array of numbers, find if there are two numbers that add up to a target. Return true or false"
 * javaInput: nums = [4, 7, 2, 9, 1]
 * target = 11
 * 
 * Output: true (2 + 9 = 11) ✅
 * 
 * Input: nums = [4, 7, 2, 9, 1]
 * target = 20
 * 
 * Output: false ❌
 */