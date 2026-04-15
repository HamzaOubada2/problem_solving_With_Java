
import java.util.HashMap;

public class LevelStudents {
    public static void main(String[] args) {
        HashMap<String, Integer> students = new HashMap<>();

        students.put("Sara", 78);
        students.put("Omar", 45);
        students.put("Nour", 50);
        students.put("Imane", 30);
        students.put("Yassine", 90);

        int grade = 50;
        int TotallPassed = 0;
        int TotallFailed = 0;

        for (String name : students.keySet()) {
            int getGrade = students.get(name);

            if (getGrade >= grade) {
                System.out.println("Passed Students " + name + " -> " + getGrade);
                TotallPassed++;
            } else {
                System.out.println("Failed Students " + name + " -> " + getGrade);
                TotallFailed++;
            }
        }

        System.out.println("Total Passed: " + TotallPassed);
        System.out.println("Total Failed: " + TotallFailed);
    }
}
