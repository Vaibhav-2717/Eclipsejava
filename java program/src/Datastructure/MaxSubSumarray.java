package Datastructure;

import java.util.Scanner;

public class MaxSubSumarray {

	public static void main(String[] args) { int sum=0;
		// TODO Auto-generated method stub
Scanner v = new Scanner(System.in);
System.out.println("enter isze of array=");
int n = v.nextInt();
int a[]= new int [n];
System.out.println("enter array=");
for(int i =0;i<n;i++) {
	a[i]=v.nextInt();
}
for(int i=0;i<n;i++) {
	sum += a[i];
}
System.out.println(sum);

	}

}
