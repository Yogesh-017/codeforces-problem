import java.util.*;
public class Games {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=2;
        int arr[][]=new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();             
            }
        } int count=0;
         for(int i=0;i<n;i++){
           
            for(int j=0;j<n;j++){
                if(arr[i][0]==arr[j][1]){
                    count++;
                }
                
            }
        }
System.out.println(count);
sc.close();

    }
}
