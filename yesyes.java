import java.util.*;

public class yesyes {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String a;
        for (int i = 0; i < n; i++) {
            a = sc.next();

            if (a.equalsIgnoreCase("yes")) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }
        sc.close();
    }
}
