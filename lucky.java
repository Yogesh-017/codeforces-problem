import java.util.*;

public class lucky {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            String s = sc.next();

            int sum1 = (s.charAt(0) - '0') + (s.charAt(1) - '0') + (s.charAt(2) - '0');
            int sum2 = (s.charAt(3) - '0') + (s.charAt(4) - '0') + (s.charAt(5) - '0');

            if (sum1 == sum2) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }

}
