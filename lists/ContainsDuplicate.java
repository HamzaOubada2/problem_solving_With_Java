public class ContainsDuplicate {
    public static boolean main(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}

/*
 * Given an integer array nums, return true if any value appears more than once
 * in the array, otherwise return false.
 *
 * Example 1:
 * Input: nums = [1, 2, 3, 3]
 * Output: true
 *
 * Example 2:
 * Input: nums = [1, 2, 3, 4]
 * Output: false
 */