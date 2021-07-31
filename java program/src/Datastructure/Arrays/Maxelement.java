package Datastructure.Arrays;

import java.util.Scanner;

public class Maxelement {
	public static int max(int input[]) {
		int max=0;
		for(int i=0;i<input.length;i++) {
			if(input[i]>max) {
				max= input[i];
			}
		}
		return max;
	}
  
//	scan the  input array
	public static int[] scan() {
		Scanner s= new Scanner(System.in);
		int l=s.nextInt();
		int input[]=new int[l];
		for(int i=0;i<l;i++) {
			input[i]=s.nextInt();
		}
		return input;
		
	}
//	function to print array
	public static int[] print(int input[]) {
		for(int i=0;i<input.length;i++) {
			System.out.print(input[i]);
		}
		return input;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]=scan();
		print(a);
		System.out.println("\nmax element "+ max(a));
	}

}
