public class UseCase3PalindromeCheckerApp {

    public static void main(String[] args) {

        String original = "madam";
        String reversed = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        boolean isPalindrome = original.equals(reversed);

        System.out.println("Input text: " + original);
        System.out.println("Is it a Palindrome? :");
        System.out.println(isPalindrome);

    }
}