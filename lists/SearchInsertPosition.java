public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums = { 1, 3, 5, 6 };
        int target = 7;
        int result = searchInsert(nums, target);
        System.out.println(result);
    }

    public static int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
            if (nums[i] > target) {
                return i;
                /*
                 * nums = [2,4,5,9], target = 3.
                 * i=0 -> 2<3 -> continue
                 * i=1 -> 4>3 -> insert target=3 here in index 1
                 * 
                 * REsult
                 * [2,3,4,5,9]
                 * ↑ index 1
                 * 
                 */
            }

        }
        return nums.length;
    }
}

/*
 * Given a sorted array of distinct integers and a target value, return the
 * index if the target is found. If not, return the index where it would be if
 * it were inserted in order.
 * 
 * You must write an algorithm with O(log n) runtime complexity.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: nums = [1,3,5,6], target = 5
 * Output: 2
 * Example 2:
 * 
 * Input: nums = [1,3,5,6], target = 2
 * Output: 1
 * Example 3:
 * 
 * Input: nums = [1,3,5,6], target = 7
 * Output: 4
 */