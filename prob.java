
import java.util.*;
public class prob {

   
    static Long tiles(int l, int b, int t) {
        long lengthTiles = (l + t - 1) / t;
        long breadthTiles = (b + t - 1) / t;
        long totalTiles = lengthTiles * breadthTiles;
        return  totalTiles;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int b = sc.nextInt();
        int t = sc.nextInt();

        long ans = tiles(l, b, t);

        System.out.println(ans);
        sc.close();
    }
}
  