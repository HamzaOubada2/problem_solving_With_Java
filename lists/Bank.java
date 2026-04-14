public class Bank {
    public static void main(String[] args) {
        int[] transactions = { 2500, 8900, 15000, 4300, 11000 };
        int limit = 10000;

        for (int i = 0; i < transactions.length; i++) {
            if (transactions[i] > limit) {
                System.out.println(true + " (This is " + transactions[i] + " exceed limit)");
            }
        }
    }
}
/*
 * You are working at a bank 🏦
 * You have a list of transactions
 * Find if any transaction exceeds the limit of 10,000
 * 
 * Input: [2500, 8900, 15000, 4300, 11000]
 * limit = 10000
 * Output: true (15000 and 11000 exceed limit!)
 */