import java.util.*;
public class square {
    public static void main(String args[]){


        Scanner sc=new Scanner(System.in);

        int a=sc.nextInt();
        int arr[]=new int[4];int count=0;
        for(int i=0;i<a;i++){

            for(int j=0;j<4;j++){
                arr[j]=sc.nextInt();
            }
            for(int k=0;k<4;k++){
                if(arr[0]==arr[k]){
                    count++;
                }
            }
            if(count==4){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            } count=0;

        }
        sc.close();
    }
}
