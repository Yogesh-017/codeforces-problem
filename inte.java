
import java.util.Arrays;
import java.util.Scanner;

public class inte{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String form = sc.nextLine();

        String[] parts = form.split("\\+");
        int[] nums = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            nums[i] = Integer.parseInt(parts[i]);
        }

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
            if (i < nums.length - 1) {
                System.out.print("+");
            }
        }
        sc.close();
    }
}
