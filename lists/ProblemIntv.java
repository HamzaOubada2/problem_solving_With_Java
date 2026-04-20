import java.util.Arrays;

public class ProblemIntv {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] result = new int[nums.length]; // we create vide array to store the result;
        for (int i = 0; i< nums.length; i++) { // this loop pass each elements of array
            int prod = 1;
            for (int j = 0; j< nums.length;j++) {
                if (j != i) {
                    /* 
                        Here for example :
                        if i = 2 soo the element here is 3 so we will pass this and make prod = 1*2*4 = 8
                    */
                    prod *= nums[j];
                }
            }
            result[i] = prod;
        }

        System.out.println(Arrays.toString(result));
    }
}
