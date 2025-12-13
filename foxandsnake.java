import java.util.*;

public class foxandsnake {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();

        for (int i = 1; i <= r; i++) {

            if (i % 2 == 1) {
                for (int j = 0; j < c; j++) {
                    System.out.print('#');
                }
            } else {
                if ((i / 2) % 2 == 1) {
                    for (int k = 0; k < c - 1; k++) {
                        System.out.print('.');
                    }
                    System.out.print('#');
                } else {
                    System.out.print('#');
                    for (int k = 0; k < c - 1; k++) {
                        System.out.print('.');
                    }
                }
            }
            System.out.println();
        }
        sc.close();
    }

}