import java.util.*;

public class antonshape {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        String arr[] = new String[a];
        int count = 0;

        for (int i = 0; i < a; i++) {
            arr[i] = sc.next();

            if (arr[i].equals("Icosahedron")) {
                count = 20 + count;
            }
            if (arr[i].equals("Cube")) {
                count = 6 + count;
            }
            if (arr[i].equals("Tetrahedron")) {
                count = 4 + count;
            }
            if (arr[i].equals("Dodecahedron")) {
                count = 12 + count;
            }
            if (arr[i].equals("Octahedron")) {
                count = 8 + count;
            }
        }

        System.out.println(count);
        sc.close();
    }
}
