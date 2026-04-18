public class FindFirstTransiction {
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
}

/*
 * 
 * 
 * You work at a bank
 * Find the first transaction that exceeds the daily limit
 * Return its index and value!
 * 
 * javaInput: [2000, 5000, 12000, 8000, 15000]
 * limit = 10000
 * 
 * Output: First suspicious transaction at index 2 → 12000
 */