
import java.util.*;
public class team{

    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr=new int[3];
       int newcount=0;
        for(int i=0;i<n;i++){
             int count=0;
            for(int j=0;j<3;j++){
                arr[j]=sc.nextInt();
            }
             for(int k=0;k<3;k++){
                if(arr[k]==1){
                    count++;
                } }
                if(count>=2){
                   newcount++;
                }

             
        }
        System.out.println(newcount);
        sc.close();
    }
}