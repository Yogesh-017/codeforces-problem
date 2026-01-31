import java.util.*;

public class sequence {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            int a = sc.nextInt();

            int arr[] = new int[a];

            for (int j = 0; j < a; j++) {
                arr[j] = sc.nextInt();
            }
            int b = sc.nextInt();
            Arrays.sort(arr);
            // System.out.println(arr[0] + " ..." + arr[a - 1]);
            if (arr[0] <= b && b <= arr[a - 1]) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }

}
