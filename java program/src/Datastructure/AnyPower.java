package Datastructure;

import java.util.Scanner;

public class AnyPower {
  
	 static int power(int n ,int x) {
		int r=1;
		for(int i=0;i<x;i++) {
			r= n*r;
		}
		return r;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner s = new Scanner(System.in);
     int n= s.nextInt();
     int x= s.nextInt();
    System.out.println( power(n,x));
	}

}
