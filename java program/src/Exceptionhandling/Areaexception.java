package Exceptionhandling;

import java.util.Scanner;

public class Areaexception {
	 static Scanner scan = new Scanner(System.in);
	 static boolean flag = true;
	
	 static int b = scan.nextInt();
	
	  static int h = scan.nextInt();
	 static{
		 try {if(b<=0 || h<=0)
		 {
		     flag=false;
		    System.out.println("java.lang.Exception: Breadth and height must be positive" );
		 }}catch(Exception e){
			 e.printStackTrace();
		/* System.out.println(e);*/}
		     }
 
	public static void main(String[] args) {
		if(flag){
			int area=b*h;
			System.out.print(area);
		}
		// TODO Auto-generated method stub

	}

}
