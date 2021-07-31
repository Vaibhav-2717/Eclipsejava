package Datastructure.Arrays;

import java.util.Scanner;

public class FindUnique {
 
	 public static int unique(int a[]) {
		 int ans=0;
	     for(int i=0;i<a.length;i++) {
	    	 int j=0;
	    	 for(j=0;j<a.length;j++) {
	    		 if(i!=j) {
	    			 if(a[i]==a[j]) {
	    				 break;
	    			 }
	    		 }
	    	 }
	    	 if(j==a.length) {
	    		 return a[i];
	    	 }
	     } 
		 return Integer.MAX_VALUE;		 
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();		
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
		}
		System.out.println("unqiue element="+unique(a));
	}

}
