
import java.util.HashMap;

// package hashMap;

public class HospitalProblem {
    public static void main(String[] args) {
        HashMap<String, Integer> patients = new HashMap<>();

        patients.put("Ahmed", 45);
        patients.put("Fatima", 32);
        patients.put("Youssef", 67);
        patients.put("Khadija", 54);

        String oldestPerson = ""; // who is the patients
        int maxAge = 0; // Max age we find

        for (String name : patients.keySet()) {
            int age = patients.get(name); // Get ages related with each name

            if (age > maxAge) {
                maxAge = age;
                oldestPerson = name;
            }

        }
        System.out.println("Oldest person is: " + oldestPerson);
        System.out.println("Age is " + maxAge);
    }
}

/*
 * Problem 1 - HashMap:
 * 
 * You work at a hospital 🏥
 * You have a list of patients and their ages
 * Find the oldest patient!
 * 
 * javaInput:
 * patients = {
 * "Ahmed" → 45,
 * "Fatima" → 32,
 * "Youssef" → 67,
 * "Khadija" → 54
 * }
 * 
 * Output: Oldest patient: Youssef (67)
 */