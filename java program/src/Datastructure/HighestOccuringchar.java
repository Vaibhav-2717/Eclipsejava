package Datastructure;

import java.util.Scanner;

public class HighestOccuringchar {
  public static char check(String str) {
	int frequency[] = new int[256];
	int maxfreq=0;
	for(int i=0;i<str.length();i++) {
		frequency[str.charAt(i)]++;
		maxfreq=Math.max(maxfreq,frequency[str.charAt(i)]);
	}
	char c='\0';
	for(int i=0;i<str.length();i++) {
		if(frequency[str.charAt(i)]==maxfreq) {
			c=str.charAt(i);
			break;
		}
	}
	  return c;
	  
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner sc= new Scanner(System.in);
           String str = sc.next();
           System.out.println(check(str));
	}

}
