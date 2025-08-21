import java.util.*;
public class Intersection {
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
        Set<Integer> setA = new HashSet<>();
        Set<Integer> intersection = new HashSet<>();
        for (int num : a) {
            setA.add(num);
        }
        for (int num : b) {
            if (setA.contains(num)) {
                intersection.add(num);
            }
        }
        System.out.println("Intersection: " + intersection);
    }
}
