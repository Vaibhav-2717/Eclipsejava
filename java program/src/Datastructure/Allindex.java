package Datastructure;

import java.util.Scanner;

public class Allindex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s=  new Scanner(System.in);
	       int n = s.nextInt();
	       int b[] = new int[3];
	       int a[]= new int[n];
	       for(int i=0;i<n;i++) {
	    	   a[i]=s.nextInt();
	       }
	       int r = 0;
	       int k=0;
	       for(int i=0;i<n;i++) {
	    	   for(int j=i+1;j<n;j++) {
	    		   if(a[i]==a[j]) {
	    			   b[k]=j;
	    			   k++;
	    		   }
	    	   }
	       }
	       System.out.println(b);
	}

}
