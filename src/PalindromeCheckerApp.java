import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("==================================");
        System.out.println("     PALINDROME CHECKER APP      ");
        System.out.println("==================================");

        System.out.print("Enter a word or sentence: ");
        String input = sc.nextLine();

        // Remove spaces and convert to lowercase
        String cleaned = input.replaceAll("\\s+", "").toLowerCase();

        String reversed = "";

        // Reverse the string
        for (int i = cleaned.length() - 1; i >= 0; i--) {
            reversed += cleaned.charAt(i);
        }

        // Check palindrome
        if (cleaned.equals(reversed)) {
            System.out.println("It is a Palindrome ✅");
        } else {
            System.out.println("It is NOT a Palindrome ❌");
        }

        sc.close();
    }
}