package Datastructure.Arrays;

import java.util.Scanner;

public class ArrangenumberinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
		int a[]=new int[n];
		
		int l=0,r=n-1,count=1;
		while(l<=r) {
			if(count%2==1) {
				a[l]=count;
				count++;
				l++;
			}
			else {
				a[r]=count;
				count++;
				r--;
			}
		}
		 
		for(int i=0;i<n;i++) {
			System.out.print(" "+a[i]);
		}
	}

}
