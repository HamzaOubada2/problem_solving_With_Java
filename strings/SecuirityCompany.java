import java.util.Scanner;

public class SecuirityCompany {
    public static void main(String[] args) {

        Scanner data = new Scanner(System.in);
        System.out.print("Enter Password: ");
        String password = data.nextLine();

        boolean hasNumber = false;

        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                hasNumber = true;
                break;
            }
        }

        if (password.length() < 8) {
            System.out.println("Your password must contain at least 8 characters!");
        } else if (!hasNumber) {
            System.out.println("Your password must contain at least one number!");
        } else {
            System.out.println("Valid!");
        }
    }
}

/*
 * You work at a security company 🔒
 * Check if a password is valid
 * A valid password must:
 * 
 * Be at least 8 characters longj
 * Contain at least one number
 * 
 * 
 * javaInput: "hello123"
 * Output: Valid password ✅
 * 
 * Input: "hello"
 * Output: Invalid! Too short ❌
 * 
 * Input: "helloooo"
 * Output: Invalid! No number ❌
 */