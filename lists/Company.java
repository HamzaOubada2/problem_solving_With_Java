public class Company {
    public static void main(String[] args) {
        int[] Salarys = { 1500, 4000, 2500, 8000, 3500, 1000, 6000 };
        int limit = 3000;

        int sum = 0;
        int count = 0;

        for (int i = 0; i < Salarys.length; i++) {
            if (Salarys[i] > limit) {
                sum += Salarys[i];
                count++;
            }
        }
        System.out.println((float) sum / count);
    }
}

/*
 * Problem:
 * 
 * You work at a company 💼
 * You have a list of employee salaries
 * Remove all salaries below 3000 (they are interns)
 * Return the average salary of remaining employees!
 * 
 * javaInput: [1500, 4000, 2500, 8000, 3500, 1000, 6000]
 * Output: Average salary: 5375.0
 * Hint:
 * This needs 2 things:
        * Filter salaries >= 3000
        * Calculate average of filtered!
 * 
 * 
 */