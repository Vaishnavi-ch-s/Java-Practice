import java.util.*;
public class Program2_PalindromeString {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int i=0,j=s.length()-1;
        boolean isPalindrome=true;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                isPalindrome=false;
                break;
            }
            i++;j--;
        }
        if(isPalindrome){
            System.out.println("Strings are Palindrome");
        }else{
            System.out.println("Strings are not Palindrome");
        }
    }
}