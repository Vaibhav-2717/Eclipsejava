package Datastructure;

import java.util.Arrays;
import java.util.Scanner;

public class Sort012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner v = new Scanner(System.in);
System.out.println("enter size of array=");
int n = v.nextInt();
int a[] = new int[n];
	System.out.println("enter element of array=");
	for(int i =0;i<n;i++) {
		a[i] = v.nextInt();
	}
	Arrays.sort(a);
	for(int i=0;i<n;i++) {
	System.out.println(a[i]);
	}
	}

}
