package Datastructure;

import java.util.Scanner;

public class Rearrange {

	static void rearrange(int a[],int n) {
		int temp,j=0;
		for(int i=0;i<n;i++) {
			if(a[i]<0) {
				if(i!=j) {
					temp=a[i];
				    a[i]=a[j];
				    a[j]=temp;
				}
				j++;
			}}}
	static void printarray(int a[],int n) {
		for(int i=0;i<n;i++) {
			System.out.println(a[i]+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner v = new Scanner(System.in);
       System.out.println("enter size of array=");
       int n = v.nextInt();
       int a[] = new int[n];
       for(int i=0;i<n;i++) {
    	   a[i]=v.nextInt();
       }
       rearrange(a,n);
       printarray(a,n);
       
	}

}
