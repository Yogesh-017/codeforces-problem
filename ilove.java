import java.util.*;

public class ilove {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int best = sc.nextInt();
        int worst = best;
        int arr[] = new int[n - 1];
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            if (worst > arr[i]) {
                count++;
                worst = arr[i];
            }
            if (best < arr[i]) {
                count++;
                best = arr[i];
            }
        }
        System.out.println(count);
        sc.close();

    }
}
