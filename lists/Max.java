public class Max {

    public static void main(String[] args) {
        int[] nums = { 3, 7, 1, 9, 4 };

        int max = nums[0]; // 3
        int max2 = nums[0]; // 3

        for (int i=0;i<nums.length; i++) {
            if (nums[i] > max) {
                max2 = max;
                max = nums[i];
            }
            else if (nums[i] > max2 && nums[i] != max) {
                max2 = nums[i];
            }
        }
        System.out.println("Max: "+ max);
        System.out.println("Second Max: "+ max2);
    }
}

/* 
    max = 3;
    max2 = 3;
    --------------------------
    Loop 1:
        i = 1;
        nums[i] = 7;

        7 > max(3); TRUE
        max2 = max -> max2 = 3
        max = 7;

        Result:
        max = 7;
        max2 = 3
    ---------------------------
    Loop 2:
        i = 2;
        nums[i] = 1;

        1 > max(7)-->False
        1 > max(3)--> False
        
        Nothing change:
        max = 7
        max2=3
    -----------------------------
    Loop 3:
    i = 3;
    nums[i] = 9;

    9 > max(7) -> true
    3 > max(3) -> true

    max = 9
    max2= 7

    --------------------------------
    Loop 4:
    i=4
    nums[] = 4

    4 > max(9) -> false
    4 > max(7) -> false

    Notinh change
*/