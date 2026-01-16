import java.util.*;

public class showel {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int ld = a % 10;
        if (ld == b || ld == 0) {
            System.out.println(1);
            sc.close();
            return;

        }
        int i = 1;
        int ans = 1, last = -1;
        while (last != b && last != 0) {
            ans = a * i;
            i++;
            last = ans % 10;

        }
        System.out.println(i - 1);
        sc.close();

    }

}
