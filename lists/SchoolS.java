public class SchoolS {
    public static void main(String[] args) {
        int[] nums = { 85, 90, 15, 78, 5, 92, 88, 10 };
        int limit = 20;

        int sum = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= limit) {
                sum += nums[i];
                count++;
            }
        }
        float avg = (float) sum / count;
        System.out.println("Average exam score: " + avg + " minutes");
    }
}
