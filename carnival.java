import java.util.*;

public class carnival {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[4];
        int pos = 0, ans = 0;

        for (int k = 0; k < n; k++) {

            int l = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            pos = a;
            ans = a;
            for (int i = 0; i < l; i++) {
                pos = (pos + b) % l;
                ans = Math.max(ans, pos);
            }
            System.out.println(ans);
            pos = 0;
            ans = 0;
        }
        sc.close();
    }
}
