import java.util.*;
public class Program5_ConvertCaseLowerorUpper {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String result="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='A'&& ch<='Z'){
                ch=(char)(ch+32);
            }else if(ch>='a'&&ch<='z'){
                ch=(char)(ch-32);
            }
            result+=ch;
        }
        System.out.println(result);
    }
}