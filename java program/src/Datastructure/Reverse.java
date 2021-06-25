package Datastructure;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[25];
		Scanner input= new Scanner(System.in);
	   System.out.println("Enter the size of array to be reversed:");
		int n= input.nextInt();
 System.out.println("Enter the"+n+" array element");
 for(int i=0;i<n;i++) {
	a[i]=input.nextInt();
 }
 System.out.println("reverse array is:");
 for(int i=n;i>0;i--) {
	 System.out.println(a[i]);
 }
	}

}
