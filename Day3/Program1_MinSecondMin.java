import java.util.*;
public class Program1_MinSecondMin{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int min=Integer.MAX_VALUE;
        int secondmin=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(min<arr[i]){
                secondmin=min;
                min=arr[i];
            }else if(arr[i]<secondmin && arr[i]!=min){
                secondmin=arr[i];
            }
        }
        System.out.println(min+" "+secondmin);
    }
}