package Pattern;

import java.util.Scanner;

public class Patter2 {
   
	public static void main(String[] args) {
		int p=1;
		Scanner v = new Scanner(System.in);
       int n = v.nextInt();
       for(int i=1;i<=n;i++) {
    	   for(int j=0;j<i;j++) {
    		   System.out.print(" "+p+" ");
    		   p++;
    	   }
    	   System.out.println("\n");
       }
       char c='A';
       System.out.println("--------------------");
       for(int i=1;i<=n;i++) {
    	   for(int j=0;j<i;j++) {
    		   System.out.print(" "+c+" ");
    		   c++;
    	   }
    	   System.out.println("\n");
       }
	}

}
