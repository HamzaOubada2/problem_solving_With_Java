import java.util.Scanner;

public class AccessCodeValidation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Access Code: ");
        String code = sc.nextLine();

        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasNumber = false;
        boolean hasSpecial = false;

        for (int i = 0; i < code.length(); i++) {
            char c = code.charAt(i);

            if (Character.isDigit(c)) hasNumber = true;
            if (Character.isUpperCase(c)) hasUpper = true;
            if (Character.isLowerCase(c)) hasLower = true;

            if (c == '@' || c == '#' || c == '$' || c == '%' || c == '&') {
                hasSpecial = true;
            }
        }

        if (code.contains(" ")) {
            System.out.println("Invalid! Must not contain spaces ❌");
        } else if (code.length() < 10) {
            System.out.println("Invalid! Too short ❌");
        } else if (!hasUpper) {
            System.out.println("Invalid! Missing uppercase letter ❌");
        } else if (!hasLower) {
            System.out.println("Invalid! Missing lowercase letter ❌");
        } else if (!hasNumber) {
            System.out.println("Invalid! Missing number ❌");
        } else if (!hasSpecial) {
            System.out.println("Invalid! Missing special character ❌");
        } else {
            System.out.println("Access granted ✅");
        }
    }
}