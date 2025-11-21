import java.util.*;

public class boring {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int b = sc.nextInt();
            int length = String.valueOf(b).length();
            int d = Integer.parseInt(String.valueOf(b).substring(0, 1));
            int ans = (d - 1) * 10 + (length * (length + 1) / 2);
            System.out.println(ans);
            d = 0;
            length = 0;
            ans = 0;

        }
        sc.close();
    }
}
