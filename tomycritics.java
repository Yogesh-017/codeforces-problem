import java.util.*;

public class tomycritics {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int arr[] = new int[3];
        for (int k = 0; k < a; k++) {
            for (int i = 0; i < 3; i++) {
                arr[i] = sc.nextInt();
            }
            if (arr[0] + arr[1] >= 10) {
                System.out.println("YES");
            } else if (arr[0] + arr[2] >= 10) {
                System.out.println("YES");
            } else if (arr[1] + arr[2] >= 10) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
