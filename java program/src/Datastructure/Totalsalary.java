package Datastructure;

import java.util.Scanner;

public class Totalsalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hra,da,allow,pf,basic,salary;
Scanner s= new Scanner(System.in);
basic = s.nextInt();
String grade = s.next();
hra=(20*basic)/100 ;
da=(50*basic)/100;
pf=(11*basic)/100;
switch(grade) {
case "A" : allow=1700;
break;
case "B" : allow=1500;
break;
case "C" : allow=1300;
break;
default : allow=1700;
break;
}
salary = basic +hra+da+allow-pf;
System.out.println("salary="+salary);

	}

}
