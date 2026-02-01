import java.util.*;

public class newyear {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int count = 0, test = 0;
        for (int i = 1; i <= a; i++) {

            test = test + (5 * i);

            if ((test + b) <= 240) {
                count++;
            } else {

                break;
            }
        }
        System.out.println(count);
    }
}
