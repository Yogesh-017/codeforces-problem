import java.util.*;
public class name {
    public static void main(String args[]){


        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        
         String arr[]=new String[2];
       
            for(int i=0;i<a;i++){
                int b=sc.nextInt();
                for (int j=0;j<2;j++){
                    
                     arr[j]=sc.next();
                
                }
               if(arr[0].length() != b || arr[1].length()!=b){
                 System.out.println("NO");break;
                 }
            char[] arr1 = arr[0].toCharArray();
            char[] arr2 = arr[1].toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            if(Arrays.equals(arr1, arr2)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }       
    
    sc.close();
    }
}
