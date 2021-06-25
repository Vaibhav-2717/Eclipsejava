import java.util.Scanner;

public class Greatestnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner sc= new Scanner(System.in);
 int a,b,c;
 System.out.println("enter three number to check greatest...");
 a=sc.nextInt();
 b=sc.nextInt();
 c=sc.nextInt();
 if((a>b)&&(a>c))
 {System.out.println("a is greatest number");
 }
 else if ((b>a)&&(b>c))
 { System.out.println("b is greatest number");
 }
 else {
	 System.out.println("c is greatest number");
	  }
 System.out.println("Congratulation u find greatest number");
	}

}
