package Datastructure.Arrays;

import java.util.Scanner;

public class TripletSum {
    public static int triplet(int a[],int t) {
    	int count=0;
    	
    	for(int x=0;x<a.length;x++) {
    		for(int y=x+1;y<a.length;y++) {
    			for(int z=y+1;z<a.length;z++) {
    		if(a[x]+a[y]+a[z]==t) {
    			count++;
    		}
    			}
    			}
    	}
    	return count;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        int a[]= new int[n];
        for(int i=0;i<n;i++) {
        	a[i]=s.nextInt();
        }
        int t=s.nextInt();
        
        System.out.println("triplet sum numbers are="+triplet(a,t));
        
	}

}
