import java.util.*;
public class george {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);    
        int a=sc.nextInt();
        int arr[]=new int[2];
        int count=0;
        for(int i=0;i<a;i++){

            for(int j=0;j<2;j++){
                arr[j]= sc.nextInt();       
            }
            if(Math.abs(arr[0]-arr[1])>=2){
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
