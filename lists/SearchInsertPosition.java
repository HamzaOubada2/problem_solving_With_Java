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
                 *     ↑ index 1
                 * 
                 */
            }

        }
        return nums.length;
    }
}