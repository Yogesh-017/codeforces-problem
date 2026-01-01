import java.util.*;

public class marathon {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int arr[] = new int[4];
        int count = 0;
        for (int k = 0; k < a; k++) {
            for (int i = 0; i < 4; i++) {
                arr[i] = sc.nextInt();
            }
            for (int i = 1; i < 4; i++) {
                if (arr[0] < arr[i]) {
                    count++;
                }
            }
            System.out.println(count);
            count = 0;
        }

        sc.close();
    }
}
