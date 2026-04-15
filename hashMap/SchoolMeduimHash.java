
import java.util.HashMap;



public class SchoolMeduimHash {
    public static void main(String[] args) {
        HashMap<String, Integer> students = new HashMap<>();

        students.put("Ahmed", 78);
        students.put("Fatima", 45);
        students.put("Youssef", 32);
        students.put("Khadija", 90);
        students.put("Ali", 48);

        int grade = 50;
        int totallFaileds = 0;

        for(String name: students.keySet()) {
            int FindGrad = students.get(name);

            if (FindGrad < grade) {
                System.out.println(name+" -> "+FindGrad);
                totallFaileds++;
            }
        }
        System.out.println("Total Failed: "+totallFaileds);
    }
}
