package Datastructure.Arrays;

import java.util.Scanner;

// Maximum sum of k consecutive element ......
public class MaxSumOfK {
public static int maxsum(int a[],int k) {
 int max=-1,sum=0;
 for(int i=0;i<k;i++) {
	 sum+=a[i];
 }
 max=sum;
 for(int i=k;i<a.length;i++) {
	 sum =sum+a[i]-a[i-k];
	 if(sum>max) {
		 max=sum;
	 }
 }
	
	
	return max;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int a[]= new int[n];
        System.out.println("enter a array");
        
        for(int i=0;i<n;i++) {
        	a[i]=s.nextInt();
        }
        System.out.println("enter number of consecutive element");
        int k=s.nextInt();
        
        System.out.println("maximum sum is "+maxsum(a,k));
        
	}

}
