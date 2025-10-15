
import java.util.*;
public class bit {
	public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        sc.nextLine();
        String[] stat=new String[n];
        for(int i=0;i<n;i++){
            stat[i]=sc.nextLine().trim();       
         }
         int x=0;
         for(int i=0;i<stat.length;i++){
          if(stat[i].equals("++X") || stat[i].equals("++x")){
                ++x;
            } else if(stat[i].equals("--X") || stat[i].equals("--x")){
                --x;
            } else if(stat[i].equals("X++") || stat[i].equals("x++")){
                x++;
            } else if(stat[i].equals("X--") || stat[i].equals("x--")){
                x--;
            }
        }
         System.out.println(x);
         sc.close();
    }
}
