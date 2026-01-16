import java.util.*;

public class blank {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int blank = 0, blank1 = 0;
            int n2 = sc.nextInt();
            int arr[] = new int[n2];
            for (int j = 0; j < n2; j++) {
                arr[j] = sc.nextInt();

            }
            for (int j = 0; j < n2; j++) {
                if (arr[j] == 0) {
                    blank++;
                    blank1 = Math.max(blank, blank1);
                } else {
                    blank = 0;
                }
            }
            System.out.println(blank1);
        }
        sc.close();
    }
}
