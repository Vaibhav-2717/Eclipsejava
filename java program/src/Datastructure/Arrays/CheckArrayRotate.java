package Datastructure.Arrays;

import java.util.Scanner;

public class CheckArrayRotate {
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
public static int checkrotate(int a[]) {
	int k=0;
	for(int i=0;i<a.length-1;i++) {
		if(a[i]>a[i+1]) {
			k=i+1;
			break;
		}
	}
	return k;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a[]=scan();
    System.out.println("rotaion index="+checkrotate(a));
	}

}
