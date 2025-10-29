import java.util.*;
public class word {
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        int count=0,mount=0;
        for(int i=0;i<a.length();i++){
            char ch= a.charAt(i);
            if(Character.isUpperCase(ch)){
                count++;
            }else{
                mount++;
            }
        }
        if(count>mount){
            System.out.println(a.toUpperCase());
        }else{
            System.out.println(a.toLowerCase());
        }
        sc.close();
    }
}
