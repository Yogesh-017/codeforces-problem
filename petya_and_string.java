import java.util.*;

public class petya_and_string {

     void checker(String a, String b){
          int result= a.toLowerCase().compareTo(b.toLowerCase());{
               if(result>0){
                System.out.println(1);

               } else if (result<0){
                System.out.println(-1);
               }else{
                System.out.println(0);
               }
        }
    }
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        petya_and_string obj=new petya_and_string();
        String a= sc.nextLine();
        String b=sc.nextLine();
         obj.checker(a,b);

    }
}
