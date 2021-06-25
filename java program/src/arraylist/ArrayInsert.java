package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayInsert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner v= new Scanner(System.in);
  ArrayList<Integer> a = new ArrayList<>();
  System.out.println("enter array");
	  a.add(75);
	  a.add(55);
	  a.add(95);
	  a.add(125);
	  a.add(45);
	  a.add(4,15);
	  System.out.println("index="+a.indexOf(55));
  for(int i=0;i<a.size();i++) {
	  System.out.println(a.get(i));
  }
	}

}
