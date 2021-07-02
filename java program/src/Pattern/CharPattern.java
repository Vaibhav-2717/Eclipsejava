package Pattern;

import java.util.Scanner;

public class CharPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner s = new Scanner(System.in);
  int n = s.nextInt();
  char c = (char)('A'+n-1);
  for(int i=1;i<=n;i++) {
	  for(int j=i;j>0;j--) {
		  System.out.print(c);
		  c--;
	  }
	  c=(char)('A'+n-1);
	  System.out.println();
  }
	}

}
