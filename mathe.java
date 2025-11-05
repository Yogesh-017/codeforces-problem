
import java.util.*;

public class mathe {    
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();
        char arr[]=a.toCharArray();
        char arr2[]=b.toCharArray();

        for(int i=0;i<arr.length;i++){
            if(arr[i]!=arr2[i]){
                System.out.print("1");
            }else{
                System.out.print("0");
            }
        }



sc.close();

    }

}
