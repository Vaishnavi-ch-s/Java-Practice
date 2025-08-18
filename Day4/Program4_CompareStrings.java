import java.util.*;
public class Program4_CompareStrings {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine().toLowerCase();
        String s2=sc.nextLine().toLowerCase();
        boolean isEqual=true;
        if(s1.length()!=s2.length()){
            isEqual=false;
        }else{
            for(int i=0;i<s1.length();i++) {
                if (s1.charAt(i) != s2.charAt(i)) {
                    isEqual = false;
                    break;
                }
            }
        }
        if(isEqual){
            System.out.println("Strings are Equal");
        }else{
            System.out.println("Strings are not Equal");
        }
    }
}