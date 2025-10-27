
import java.util.*;
public class capital {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();

            char first = a.charAt(0);
            char f=Character.toUpperCase(first);
            String ans= f+ a.substring(1);
            System.out.println(ans);

        sc.close();
    }
}
