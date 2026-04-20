
import java.util.HashMap;

public class AmazonStore {
    public static void main(String[] args) {
        HashMap<String, Integer[]> Inpt = new HashMap<>();

        Inpt.put("Ahmed", new Integer[] { 200, 450, 100 });
        Inpt.put("Fatima", new Integer[] { 200, 800 });
        Inpt.put("Youssef", new Integer[] { 100, 50, 300 });


        String topCustomer = "";
        int maxSpent = 0;
        for (String name : Inpt.keySet()) {
            Integer[] values = Inpt.get(name);
            int sum=0;
            for (Integer v: values) {
                sum+=v;
            }
            if(sum > maxSpent) {
                maxSpent = sum;
                topCustomer = name;
            }
        }
        System.out.println("Top Customer: "+ topCustomer + " -> "+ maxSpent);
    }
}
