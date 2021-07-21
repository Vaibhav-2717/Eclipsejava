package Datastructure;

import java.util.Scanner;

public class FindDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t=0;
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int a[]= new int[n];
    for(int i=0;i<n;i++) {
    	a[i]=s.nextInt();
    }
    
    for(int i=0;i<n;i++) {
    	for(int j=i+1;j<n;j++) {
    		if(a[i]==a[j]) {
    			t=a[i];
    		}
    	}
    }
    System.out.println("duplicate element"+t);
	}

}
