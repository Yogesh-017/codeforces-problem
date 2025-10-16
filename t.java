import java.util.*;
public class t {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Total participants
        int k = sc.nextInt(); // Cutoff position
        int arr[] = new int[n];
        int count = 0;

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        
        int limit = arr[k-1]; // Score to beat or match (zero-indexed)

        for(int i = 0; i < n; i++){
            if(arr[i] >= limit && arr[i] > 0){
                count++;
            }
        }
        
        System.out.println(count);
        sc.close();
    }
}
