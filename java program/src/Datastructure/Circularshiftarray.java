package Datastructure;

import java.util.Scanner;

public class Circularshiftarray {

	public static void main(String[] args) { int temp=0;
		// TODO Auto-generated method stub
     Scanner v= new Scanner(System.in);
     System.out.println("enter size of array");
     int n = v.nextInt();
     int a[]=new int[n];
     for(int i=0;i<n;i++) {
    	 a[i]=v.nextInt();
     }
//     temp=a[n-1];
     for(int i=1;i<n;i++) {
    	 int temp1=(int)a[i];
    	 a[i]=a[0];
    	 a[0]=temp1;
     }
//     a[0]=temp;
     for(int i=0;i<n;i++)
     System.out.println(a[i]);
	}

}
