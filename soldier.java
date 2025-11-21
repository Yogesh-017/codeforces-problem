import java.util.*;

public class soldier {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int w = sc.nextInt();

        int f = (k * w * (w + 1)) / 2;

        int ans = f - n;
        if (ans < 0) {
            System.out.println(0);
        } else {
            System.out.println(ans);
        }
        sc.close();
    }
}
