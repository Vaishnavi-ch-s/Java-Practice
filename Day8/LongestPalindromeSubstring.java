import java.util.*;
public class LongestPalindromeSubstring {
    public static boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String longest = "";
        int n = s.length();
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (isPalindrome(s, i, j)) {
                    String sub = s.substring(i, j + 1);
                    if (sub.length() > longest.length()) {
                        longest = sub;
                    }
                }
            }
        }
        System.out.println("Longest Palindromic Substring: " + longest);
    }
}
