public class UseCase2PalindromeCheckerApp {

    public static void main(String[] args) {

        String text = "madam";
        boolean isPalindrome = true;

        int start = 0;
        int end = text.length() - 1;

        while (start < end) {

            if (text.charAt(start) != text.charAt(end)) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }

        System.out.println("Input text: " + text);
        System.out.println("Is it a Palindrome? :");
        System.out.println(isPalindrome);

    }
}