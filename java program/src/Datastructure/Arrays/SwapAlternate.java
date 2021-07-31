package Datastructure.Arrays;

import java.util.Scanner;

public class SwapAlternate {
       
	public static void swap(int a[]) {
		for(int i=0;i<a.length-1;i=i+2) {
			int temp=a[i];
			a[i]=a[i+1];
			a[i+1]=temp;
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(" "+a[i]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   Scanner s=new Scanner(System.in);
	   int n=s.nextInt();
	   int a[]= new int[n];
	   for(int i=0;i<n;i++) {
		   a[i]=s.nextInt();
	   }
	   swap(a);
	}

}
