import java.util.*;
public class easy {
    public static  void main(String args[]){

        Scanner sc=new Scanner(System.in);

        int a=sc.nextInt();
        int arr[]=new int[a];
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        boolean found= false;
        for(int i=0;i<a;i++){
     
        if(arr[i]==1){
            found=true;
        }
    }
       if(found){
        System.out.println("HARD");
       }else{
        System.out.println("EASY");
       }
    }
}
