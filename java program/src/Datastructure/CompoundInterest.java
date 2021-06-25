package Datastructure;

import java.util.Scanner;

public class CompoundInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc= new Scanner(System.in);
  System.out.println("Enter the principle amount=");
  int p= sc.nextInt();
  System.out.println("Enter the rate=");
  int r= sc.nextInt();
  System.out.println("Enter the time =");
  int t=sc.nextInt();
  int r1=(1+r/100);
  double t1=Math.pow(t,r1);
  double ci =  (p*t1);
  System.out.println("your compound interest="+ci);
	}

}
