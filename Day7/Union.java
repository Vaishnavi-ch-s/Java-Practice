import java.util.*;
public class Union {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }
        Set<Integer> union = new HashSet<>();
        for (int num : a) {
            union.add(num);
        }
        for (int num : b) {
            union.add(num);
        }
        System.out.println("Union: " + union);
    }
}
