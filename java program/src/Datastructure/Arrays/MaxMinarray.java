package Datastructure.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaxMinarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner s = new Scanner(System.in);
  System.out.println("Enter size of array=");
  int n = s.nextInt();
  int a[]= new int[n];
  int b[]= new int[n];
  System.out.printf("enter %d element in array=",n);
  for(int i=0;i<n;i++) {
	  a[i]=s.nextInt();
  }
  Arrays.sort(a);
for(int i=0;i<n;i++) {
System.out.println(a[i]);
}
System.out.println("max element="+a[n-1]);
System.out.println("min element="+a[0]);
	}

}
