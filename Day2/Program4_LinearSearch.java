import java.util.*;
public class Program4_LinearSearch {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int target = sc.nextInt();
        int index=-1;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(target==arr[i]){
                index=i;
            }
        }
        System.out.println(index);
    }
}