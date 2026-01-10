import java.util.*;

public class restoring {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[4];
        for (int i = 0; i < 4; i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for (int i = 0; i < 4; i++) {
            int a = max - arr[i];
            if (a >= 1) {
                System.out.print(a + " ");
            } else {

            }
        }
        sc.close();
    }
}
