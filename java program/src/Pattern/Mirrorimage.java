package Pattern;

import java.util.Scanner;

public class Mirrorimage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s = new Scanner(System.in);
int n = s.nextInt();
for(int i=1;i<=n;i++) {
	for(int j=0;j<n-i;j++) {
		System.out.print(" ");
	}
	for(int k=0;k<i;k++) {
		System.out.print("*");
	}
	System.out.println();
}
	}

}
