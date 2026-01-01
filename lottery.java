import java.util.*;

public class lottery {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0, cnt = 0;

        if (n >= 100) {
            a = n / 100;
            n = n % 100;
            cnt = cnt + a;
        }

        if (n >= 20) {
            a = n / 20;
            n = n % 20;
            cnt = cnt + a;
        }
        if (n >= 10) {
            a = n / 10;
            n = n % 10;
            cnt = cnt + a;
        }
        if (n >= 5) {
            a = n / 5;
            n = n % 5;
            cnt = cnt + a;
        }
        if (n >= 1) {
            a = n / 1;
            n = n % 1;
            cnt = cnt + a;
        }
        System.out.println(cnt);
        sc.close();
    }
}
