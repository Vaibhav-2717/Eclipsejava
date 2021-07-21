package Datastructure;

import java.util.Scanner;

public class RemoveConseDuplicates {
     private static String remove(String str) {
    	 String s="";
    	 s += str.charAt(0);
    	  char prev = str.charAt(0);
    	 for(int i=1;i<str.length();i++) {
    		 if(str.charAt(i)!=prev) {
    			 prev=str.charAt(i);
    			 s += prev;
    		 }
    	 }
		return s;
    	 
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      String str = sc.next();
      System.out.println(remove(str));
	}

}
