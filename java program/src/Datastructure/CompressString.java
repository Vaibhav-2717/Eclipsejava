package Datastructure;

import java.util.Scanner;

public class CompressString {
    public static String compress(String str) {
    	String s="";
    	s +=str.charAt(0);
    	int count=1;
    	for(int i=1;i<str.length();++i) {
    		if(str.charAt(i)==str.charAt(i-1)) {
    			++count;
    		}
    		else {
    			if(count>1) {
    			s+=count;
    			count=1;
    			}
    			s+=str.charAt(i);
    		}
    	}
    		if(count>1) {
    			s+=count;
    		}
    	
    	return s;
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc= new Scanner (System.in);
       String str = sc.next();
       System.out.println(compress(str));
	}

}