package Datastructure.Arrays;

import java.util.Scanner;

public class PrintPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner s= new Scanner(System.in);
         int n=s.nextInt();
         int a[]=new int[n];
	    for(int i=0;i<n;i++) {
	    	a[i]=s.nextInt();
	    }
	    int b[]=new int[2];
	    for(int i=0;i<n;i++) {
	    	for(int j=i;j<n;j++) {
	    		b[0]=a[i];
	    		b[1]=a[j];
	    		System.out.println(b[0]+" "+b[1]);
	    	}
	    	
	    }
	    
	}
}
