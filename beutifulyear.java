import java.util.*;

public class beutifulyear {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        while (true) {
            year++;
            String s = Integer.toString(year);
            boolean hasDuplicate = false;

            for (int i = 0; i < s.length(); i++) {
                for (int j = i + 1; j < s.length(); j++) {
                    if (s.charAt(i) == s.charAt(j)) {
                        hasDuplicate = true;
                        break;
                    }
                }
                if (hasDuplicate)
                    break;
            }

            if (!hasDuplicate) {
                break;
            }
        }
        System.out.println(year);
        sc.close();
    }

}