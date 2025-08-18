import java.util.*;
public class Program3_CountVowelsConsonants {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s= sc.nextLine().toLowerCase();
        int vowel=0,consonants=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='a'&& ch<='z'){
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                    vowel++;
                }else{
                    consonants++;
                }
            }
        }
        System.out.println("Vowels : "+" "+vowel+" "+"Consonants :"+" "+consonants);
    }
}