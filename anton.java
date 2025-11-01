import java.util.*;
public class anton {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        int count=0,mount=0,z=0;
        int a=sc.nextInt();
        String input = sc.next(); // Read entire string without spaces
        
        for(int i=0;i<a;i++){
            char ch = input.charAt(i); // Get character at position i
            if(ch=='A'){
                count++;
            }else if(ch=='D'){
                mount++;
            }else{
                z++;
            }
        }
        
        if(count>mount){
            System.out.println("Anton");
        }else if(count==mount){
            System.out.println("Friendship");
        }else{
            System.out.println("Danik");
        }
        sc.close();
    }
}
