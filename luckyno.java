import java.util.*;


public class luckyno {
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        Long a=sc.nextLong();
        String b=Long.toString(a);
        int count=0;
        for(int i=0;i<b.length();i++){
             char ch= b.charAt(i);
            if(ch == '4' || ch == '7' ){
                count++;
            }
        }
              if(count==7 ||count== 4)
                {
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
                sc.close();
    }
    
}
