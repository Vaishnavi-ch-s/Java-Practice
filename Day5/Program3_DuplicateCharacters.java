import java.util.*;
public class Program3_DuplicateCharacters {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase();
        Map<Character, Integer> freq = new HashMap<>();
        for(char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        for(Map.Entry<Character, Integer> entry : freq.entrySet()) {
            if(entry.getValue() > 1) {
                System.out.print(entry.getKey() + " ");
            }
        }
    }
}