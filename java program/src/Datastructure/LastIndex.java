package Datastructure;

import java.util.Scanner;

public class LastIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner s = new Scanner(System.in);
      int n=s.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++) {
    	  a[i]=s.nextInt();
      }
      int r=0;
      for(int i=0;i<n;i++) {
    	  for(int j=n-1;j>=i;j--) {
    		  if(a[i]==a[j]) {
    			r=j;  
    		  }
    	  }
      }
      System.out.println(r);
	}

}
