import java.util.*;
public class tranlate {
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String t=sc.nextLine();

        if(s.length()!=t.length()){
            System.out.println("NO");
            return;
        }

       boolean rev=true;
       
            for(int i=0;i<s.length();i++){

                if(s.charAt(i)!=t.charAt(t.length()-1-i)){
                    rev=false;
                    break;
                }
            }

       if(rev){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        sc.close();
   
    }

}
