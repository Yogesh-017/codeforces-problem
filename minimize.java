import java.util.*;

public class minimize {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int ans = Math.abs(a - b);
            System.out.println(ans);

        }
        sc.close();

    }

}
