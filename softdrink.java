import java.util.*;

public class softdrink {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int arr[] = new int[8];

        for (int i = 0; i < 8; i++) {
            arr[i] = sc.nextInt();
        }

        int total_drink = arr[1] * arr[2];
        int drink_toast = total_drink / arr[6];
        int total_slice = arr[3] * arr[4];
        int salt_total = arr[5] / arr[7];
        int overall = Math.min(drink_toast, Math.min(total_slice, salt_total));
        int ans = overall / arr[0];
        System.out.println(ans);
        sc.close();
    }

}
