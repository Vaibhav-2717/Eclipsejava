
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
  public static int temp=1;
    public static void main(String[] args) {
         
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
   Scanner v= new Scanner(System.in);
        int n= v.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i]=v.nextInt();
        }
        Arrays.sort(a);
        for(int i=0;i<n;i++) {
        	System.out.println(a[i]);
        }
        for(int i=1;i<n;i++){
        if(a[i]==(a[i-1]+1)){
           temp++;
        }}
        if(temp!=n){
        System.out.println("0");
        }
            else{
                System.out.println("1");
            }
    }
}
