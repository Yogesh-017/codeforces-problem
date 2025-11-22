import java.util.Scanner;

public class agent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] arr = new char[3][3];
        String a[] = new String[3];
        int n = 3;

        for (int i = 0; i < n; i++) {
            a[i] = sc.next();
        }
        for (int j = 0; j < n; j++) {
            for (int k = 0; k < n; k++) {
                arr[j][k] = a[j].charAt(k);
            }
        }

        // // Input 3x3 matrix, one character per line
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < n; j++) {
        // arr[i][j] = sc.next().charAt(0);
        // }
        // }

        // Check symmetry conditions of Super Agent problem
        if (arr[0][0] == arr[2][2] &&
                arr[0][1] == arr[2][1] &&
                arr[0][2] == arr[2][0] &&
                arr[1][0] == arr[1][2]) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }
}
