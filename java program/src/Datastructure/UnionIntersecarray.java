package Datastructure;

import java.util.Scanner;

public class UnionIntersecarray {

	static void union(int a[],int b[],int c[],int n1,int n) {
		for(int i=0;i<n1+n;i++) {
			if(a[i]!=b[i]) {
				c[i]=a[i];
			}
		}
	}
	public static void main(String[] args) { int n2;
		// TODO Auto-generated method stub
Scanner v= new Scanner(System.in);
int n = v.nextInt();
int a[]= new int[n];
int n1 = v.nextInt();
int b[] = new int[n1];
int c[]=new int[n+n1];
for(int i=0;i<n;i++) {
	a[i]=v.nextInt();
}for(int i=0;i<n1;i++) {
	b[i]=v.nextInt();
}

	}

}
