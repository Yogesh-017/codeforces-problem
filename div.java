import java.util.*;
public class div {
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[2];
        int ans=0,z=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<2;j++){
                arr[j]=sc.nextInt();
            }
             ans = arr[0]%arr[1];
            if (ans == 0) {
                  z = 0;
            } else {
                 z = arr[1] - ans;
                }   
             System.out.println(z);
             z=0;
            }
        sc.close();
    }

}
