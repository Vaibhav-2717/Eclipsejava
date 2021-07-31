package Datastructure.Arrays;

import java.util.Scanner;

public class Sort01 {
   public static int[] sort(int a[]) {
	   int temp=0,j=0;
	   for(int i=0;i<a.length;i++)  {
			if(a[i]==0) {
				temp=a[j];
				a[j]=a[i];
				a[i]=temp;
				j++;
			}
	   }
	   return a;
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int [n];
        for(int i=0;i<n;i++) {
        	a[i]=s.nextInt();
        }
     System.out.println("array without sorting");
     for(int i=0;i<n;i++) {
    	 System.out.print(" "+a[i]);
     }
               sort(a);

   System.out.println("\narray after sorting");
     for(int i=0;i<a.length;i++) {
    	 System.out.print(" "+ a[i]);
     }
	}
	
}
