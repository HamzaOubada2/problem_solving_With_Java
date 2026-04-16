
import java.util.HashMap;

public class mergeListWithHash {
    public static void main(String[] args) {
        String[] delivers = {
                "DHL001", "FDX002", "DHL001",
                "UPS003", "FDX002", "DHL001" };

        HashMap<String, Integer> hash = new HashMap<>();

        for (String delive : delivers) {
            hash.put(delive, hash.getOrDefault(delive, 0) + 1);
        }

        for (String name : hash.keySet()) {
            int findWay = hash.get(name);
            // System.out.println(findWay);

            if (findWay > 1) {
                System.out.println(name + " -> " + " returned " + findWay + " times");
            }
        }
    }
}

/*
 * 
 * You work at a delivery company 🚚
 * You have a list of deliveries
 * Some deliveries appear more than once (duplicates = returned!)
 * Find which deliveries were returned!
 * 
 * javaInput:
 * deliveries = ["DHL001", "FDX002", "DHL001",
 * "UPS003", "FDX002", "DHL001"]
 * 
 * Output:
 * Returned deliveries:
 * DHL001 → returned 3 times
 * FDX002 → returned 2 times
 * 
 * Hint:
 * 
 * First count each delivery with HashMap
 * Then loop HashMap and print only count > 1
 */