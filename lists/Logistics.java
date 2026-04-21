public class Logistics {
    public static void main(String[] args) {
        int[] nums = { 30, 45, 120, 25, 55, 90, 40 };
        int limit = 60;

        int sum = 0;
        int count = 0;

        for (int i=0; i< nums.length; i++) {
            if (nums[i] <= limit) {
                sum += nums[i];
                count++;
            }
        }
        float avg = (float) sum / count;
        System.out.println("Average delivery time: "+ avg+ " minutes");
    }
}
