import java.util.*;
public class wrong {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Long a=sc.nextLong();
        int b=sc.nextInt();

        for(int i=0;i<b;i++){
            float v = a%10;
            System.out.println(v);
              if (a % 10 == 0) {
                 a /= 10;
                } else {
                   a--;
                }
            }
            System.out.println(a);
    }
}
