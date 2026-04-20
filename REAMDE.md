# Problem Solving with Java



#1 Array:
public static void main(String[] args) {
        int[] money = { 2000, 5000, 12000, 8000, 15000 };
        int limit = 10000;

        for (int i = 0; i < money.length; i++) {
            if (money[i] > limit) {
                System.out.println("First Suspicious transaction at index " + i + " -> " + money[i]);
                break;
            }
        }
    }



# HashMap:
public static void main(String[] args) {
        HashMap<String, Integer[]> Inpt = new HashMap<>();

        Inpt.put("Ahmed", new Integer[] { 200, 450, 100 });
        Inpt.put("Fatima", new Integer[] { 200, 800 });
        Inpt.put("Youssef", new Integer[] { 100, 50, 300 });

        for (String name : Inpt.keySet()) {
            Integer[] values = Inpt.get(name);
            int num = 0;
            for (int i=0; i<values.length; i++) {
                if (values[i] + values[i+1] > num) {

                }
            }
        }


    }
i dont finished this problem

# Strings:

public class CyberCompany {
    public static void main(String[] args) {
        String s = "listen";
        String t = "silent";


        for (int i=0; i<s.length(); i++) {
            for (int j=1; j<t.length();j++) {
                if (s.charAt(i) == t.charAt(j)) {
                    System.out.println(true);
                }
            }
        }
        System.out.println(false);
    }
}
