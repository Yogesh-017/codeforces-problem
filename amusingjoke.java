import java.util.*;

public class amusingjoke {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        String n1 = sc.nextLine();
        String n2 = sc.nextLine();
        String pile = sc.nextLine();

        int[] cnt = new int[26];
        for (int i = 0; i < n1.length(); i++) {
            cnt[n1.charAt(i) - 'A']++;
        }
        for (int i = 0; i < n2.length(); i++) {
            cnt[n2.charAt(i) - 'A']++;
        }

        for (int i = 0; i < pile.length(); i++) {
            cnt[pile.charAt(i) - 'A']--;
        }
        boolean ok = true;
        for (int x : cnt)
            if (x != 0)
                ok = false;

        System.out.println(ok ? "YES" : "NO");

    }
}
