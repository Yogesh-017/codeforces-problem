import java.util.*;

public class socks {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int count = 0;

        while (n != 0) {

            count++;
            n--;
            if (count % m == 0) {
                n++;
            }
        }
        System.out.println(count);
        sc.close();

    }

}
