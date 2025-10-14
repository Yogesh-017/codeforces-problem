import java.util.*;
public class cfmagnets {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int count = 1; 
        int prev = sc.nextInt();

        for(int i = 1; i < a; i++) { 
            int cur = sc.nextInt();
            if(prev != cur) {
                count++; 
            }
            prev = cur; 
        }
        System.out.println(count);
        sc.close();
    }
}
