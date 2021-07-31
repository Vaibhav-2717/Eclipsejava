package Datastructure.Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Intersection {
	public static List intersection(int a[],int b[]) {
		ArrayList<Integer> c= new ArrayList<>();        //creation of  list
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				if(a[i]==b[j]) {
					c.add(a[i]);                    // add intersection element into the list
				}
			}
		}
		return c;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner s= new Scanner(System.in);
      int n1=s.nextInt();
      System.out.println("enter first array");
      int a[]= new int[n1];
      for(int i=0;i<n1;i++) {
    	  a[i]=s.nextInt();
      }
      System.out.println("\n enter second array");
      int n2=s.nextInt();
      int b[]= new int[n2];
      for(int i=0;i<n2;i++) {
    	  b[i]=s.nextInt();
      }
      System.out.println("intersection of two array="+ intersection(a,b));	  
	}

}
