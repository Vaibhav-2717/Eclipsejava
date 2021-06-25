 package Exceptionhandling;

import java.util.Scanner;

public class ArrayEx {
Scanner input = new Scanner(System.in);
int value[]=new int[4];
void insertdata() {
	System.out.println("Enetr value in array");
	try {
		for(int i=0;i<6;i++)
			value[i]=input.nextInt();
	}
catch(Exception ae) {
	ae.printStackTrace();
}}
void displaydata() {
	System.out.println("value of array are");
	for(int i=0;i<6;i++) {
		System.out.println(value[i]);
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  ArrayEx a1= new ArrayEx();
  a1.insertdata();
  a1.displaydata();
	}

}
