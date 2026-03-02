import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("     PALINDROME CHECKER APP     ");
        System.out.println("=================================");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        // Normalize string
        String normalized = input.toLowerCase()
                .replaceAll("[^a-z0-9]", "");

        boolean result = isPalindrome(normalized);

        if (result) {
            System.out.println("It is a Palindrome (Ignoring case & spaces)");
        } else {
            System.out.println("It is NOT a Palindrome");
        }

        scanner.close();
    }

    public static boolean isPalindrome(String str) {

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}