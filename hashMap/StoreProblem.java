
import java.util.HashMap;

public class StoreProblem {
    public static void main(String[] args) {
        HashMap<String, Integer> products = new HashMap<>();

        products.put("Phone", 1200);
        products.put("Headphones", 350);
        products.put("Charger", 80);
        products.put("Tablet", 800);
        products.put("Cable", 45);

        int budget = 500;

        for (String name : products.keySet()) {
            int price = products.get(name);
            if (price <= budget) {
                System.out.println("You can Afford: " + name + "(" + price + ")");
            }
        }
    }
}

/*
 * Next problem! 🎯
 * 
 * You work at a store 🛒 You have a list of products and their prices A
 * customer has a budget of 500 Print all products the customer can afford!
 * 
 * java
 * Input:
 * products = {
 * "Phone" → 1200,
 * "Headphones" → 350,
 * "Charger" → 80,
 * "Tablet" → 800,
 * "Cable" → 45
 * }
 * budget = 500
 * 
 * Output:
 * You can afford: Headphones (350)
 * You can afford: Charger (80)
 * You can afford: Cable (45)
 */