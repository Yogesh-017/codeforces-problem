package codeforce;
import java.util.*;
public class translation {
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String t=sc.nextLine();
        int count=0;
        for(int i=0;i<s.length();i++){

            for(int j=0;j<t.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    count++;
                }
            }
        }
        if(count==s.length()){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        sc.close();
    }
}
