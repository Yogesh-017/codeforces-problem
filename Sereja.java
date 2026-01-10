import java.util.*;

public class Sereja {
    public static void main(String main[]) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];
        int serej = 0, dima = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int left = 0, right = n - 1;
        boolean st = true;

        while (left <= right) {
            int pic;
            if (arr[left] >= arr[right]) {
                pic = arr[left];
                left++;
            } else {
                pic = arr[right];
                right--;
            }

            if (st) {
                serej += pic;
            } else {
                dima += pic;
            }
            st = !st;
        }
        System.out.println(serej + " " + dima);
        sc.close();
    }
}
