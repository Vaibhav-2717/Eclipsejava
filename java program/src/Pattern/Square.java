package Pattern;

import java.util.Scanner;

public class Square {

	public static void main(String[] args) {
		Scanner v = new Scanner(System.in);
		int n = v.nextInt();
     for(int i=0;i<n;i++) {
    	 for(int j=0;j<n;j++) {
    		 System.out.print(n);
    	 }
    	 System.out.println("\n");
     }
     System.out.println("----------------------------------");
     for(int i=0;i<n;i++) {
    	 for(int j=0;j<n;j++) {
    		 char c =(char)('A'+j);
    		 System.out.print(c);
    	 }
    	 System.out.println("\n");
     }
     
     
	}
}
