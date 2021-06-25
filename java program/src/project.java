import java.util.Scanner;
public class project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello welcome to the food app");
		System.out.println("\nPlease create a password");
Scanner scan = new Scanner(System.in);
String pass1= scan.next();
 System.out.println("\nYour Password is now:"+pass1);
 
 System.out.println("\nPlease enter your password:");
 String pass = scan.next();
 if(pass==pass1) {
	 System.out.println("\nThis is not the right password please try again:");
	 pass = scan.next();
 }
 System.out.println("\nAccess Granted");
 System.out.println("\nAre you hungry Yes or No");
 String ans1=scan.next();
 if(ans1=="yes") {
	 System.out.println("\nChoose what you want to eat between pizza,burger,pasta");
 String ans2=scan.next();
 
if(ans2 != "pizza"&& ans2!="burger" && ans2!="pasta") {
	System.out.println("\nSorry!!but u have not choose among them....choose something:");
   ans2=scan.next();
}
if(ans2 == "pizza"||ans2=="burger"|| ans2=="pasta") {
	System.out.println("\nDo you want something to drink Yes 0r No:");
	String ans3= scan.next();
}
 }
 else {System.out.println("\nNo worries have a good day");}
 
	}

}
