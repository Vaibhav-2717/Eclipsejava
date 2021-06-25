package Datastructure;

import java.util.Arrays;
import java.util.Scanner;

public class KthMaxMin {

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
	System.out.println("enter the kth position");
	int k = v.nextInt();
	System.out.println("k th index element="+a[k]);
	}

}
