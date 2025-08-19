import java.util.*;
public class Program1_Removeduplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s= sc.nextLine().toLowerCase();
        StringBuilder sb=new StringBuilder();
        boolean[] seen=new boolean[256];
        for(char c:s.toCharArray()){
            if(!seen[c]){
                sb.append(c);
                seen[c]=true;
            }
        }
        System.out.println(sb);
    }
}