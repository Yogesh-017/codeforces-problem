
import java.util.*;
public class stones {
public static void main(String[] args) {
    


    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    sc.nextLine();
    String a=sc.nextLine();
    int len=0;
    if (a.length() > n) {
    a = a.substring(0, n); 
      }
    for(int i=1;i<a.length();i++){
            if(a.charAt(i)==a.charAt(i-1)){
                len++;
            }
        
    }
    System.out.println(len);
    sc.close();
      

}

    
}
