import java.util.*;
public class increaseorsmash {
    public static void main(String args[]){
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        

        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            int arr[]=new int[a];
            for(int j=0;j<a;j++){

                arr[j]=sc.nextInt();

            }
            long distinctCount = Arrays.stream(arr).distinct().count();
            System.out.println(2 * distinctCount - 1);
        }

        sc.close();
    }
}
