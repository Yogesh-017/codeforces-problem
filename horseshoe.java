import java.util.*;
public class horseshoe {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[4];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int unique = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) unique++;
        }
        System.out.println(4 - unique); // This is the answer!
        sc.close();
    }
}
