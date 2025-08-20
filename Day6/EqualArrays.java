import java.util.*;
public class EqualArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        if (n != m) {
            System.out.println(false);
            return;
        }
        int[] a = new int[n];
        int[] b = new int[m];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(b);
        boolean isEqual = true;
        for (int i = 0; i < n; i++) {
            if (a[i] != b[i]) {
                isEqual = false;
                break;
            }
        }
        System.out.println(isEqual);
    }
}
