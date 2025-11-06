import java.util.*;
public class drink {
     public static void main(String args[]){


        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int arr[]=new int[a];

        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        Double sum=0.0;
        for(int i=0;i<a;i++){
             sum=arr[i]+sum;
        }

       Double ans=sum/a;
       System.out.println(ans);

     }
}
