import java.util.Scanner;
public class cffun {


    static long fun(long x){
         Long ans;
        if(x%2==0){
           ans= (long)x/2;
           return ans;
        } else {
           ans= -((long)(x+1)/2);
        }
        return ans;
    }

    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        long x = sc.nextLong();
        Long a = fun(x);
        System.out.println(a);
    }
}
