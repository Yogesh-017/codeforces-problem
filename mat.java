
import java.util.*;
public class mat {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int[][]  arr=new int[5][5];
        int row=0, col=0;
        int stp=0;
        for(int i=0;i<arr.length;i++){

            for(int j=0;j<arr.length;j++){

                arr[i][j]=sc.nextInt();

                if(arr[i][j]==1){
                    row=i;
                    col= j;
                   // System.out.println("row" +row);
                 //   System.out.println("row"+col);
                }
            }
            
        } stp=Math.abs(row-2 )+Math.abs(col-2);
        System.out.println(stp);
        sc.close();
    }
}
