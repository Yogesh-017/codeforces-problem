import java.util.*;

public class lottery2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;

        int[] bills = { 100, 50, 20, 10, 5, 1 };

        for (int bill : bills) {
            cnt += n / bill;
            n %= bill;
        }

        System.out.println(cnt);
        sc.close();
    }
}