import java.util.Scanner;

public class UserNameValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Username: ");
        String username = sc.nextLine();

        boolean hasLetter = false;
        boolean hasNumber = false;

        for (int i = 0; i < username.length(); i++) {
            char c = username.charAt(i);
            if (Character.isLetter(c)) {
                hasLetter = true;
            }

            if (Character.isDigit(c)) {
                hasNumber = true;
            }
        }

        if (username.contains(" ")) {
            System.out.println("Invalid! Must not contain spaces!");
        } else if (username.length() < 6) {
            System.out.println("Invalid! Too short!");
        } else if (!hasLetter) {
            System.out.println("Invalid! Must contain a letter!");
        } else if (!hasNumber) {
            System.out.println("Invalid! Mist be contain at least One Number!");
        } else {
            System.out.println("Valid Username!");
        }
    }

}

/*
 * 🧪 Problem 3: Username Validation 👤
 * 
 * You work at a social media company.
 * Check if a username is valid.
 * A valid username must:
 * 
 * Be at least 6 characters long
 * Contain at least one letter
 * Contain at least one number
 * Must not contain spaces
 * 
 * 🧾 Examples
 * Input: "hamza123"
 * Output: Valid username ✅
 *
 * Input: "hamza"
 * Output: Invalid! Too short ❌
 *
 * Input: "123456"
 * Output: Invalid! Must contain a letter ❌
 *
 * Input: "hamza 123"
 * Output: Invalid! Must not contain spaces ❌
 */