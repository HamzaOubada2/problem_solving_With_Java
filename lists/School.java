public class School {
    public static void main(String[] args) {
        int[] grade = { 45, 78, 32, 90, 55, 48, 61 };

        int count = 0;

        for (int i = 0; i< grade.length; i++) {
            if (grade[i] >= 50) {
                count ++;
            }
        }
        System.out.println(count+ " Students passed!");
    }
}
