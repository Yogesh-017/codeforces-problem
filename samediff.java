import java.util.*;

public class samediff {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            sc.nextLine();

            String str = sc.nextLine();

            String lastLetterStr = str.substring(a - 1);
            char ch = lastLetterStr.charAt(0);

            char[] charArray = str.toCharArray();
            int count = 0;
            for (int j = 0; j < a; j++) {
                if (ch == charArray[j]) {
                    count++;
                }
            }
            System.out.println(a - count);
        }

        sc.close();
    }
}
