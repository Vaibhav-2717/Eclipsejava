package Pattern;

import java.util.Scanner;

public class DecreaseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int p=0;
      Scanner s = new Scanner(System.in);
      int n=s.nextInt();
      for(int i=1;i<=n;i++) {
    	  p=i;
    	  for(int j=0;j<i;j++) {
    		   System.out.print(p);
    		  --p;
    	  }
    	  System.out.println("\n");
      }
	}

}
