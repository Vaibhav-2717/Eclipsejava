package Abstraction;

abstract class Area
{
	int l,b,r;
	void display()
	{
		System.out.println("good morning all of you");
	}
	abstract void getarea();
}

class Square extends Area{ 
	Square(int l){
		this.l=l;
	
	}
	@Override
	void getarea() {
		// TODO Auto-generated method stub
		System.out.println("area of circle="+l*l);
	}
	
}
class Rectangle extends Area{
	Rectangle(int l,int b){
		this.l=l;
		this.b=b;
	
	}
	void getarea() {
		// TODO Auto-generated method stub
		System.out.println("area of rectangle="+l*b);
	}
}
public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
     Square s1=new Square(22);
     s1.getarea();
     Rectangle r1=new Rectangle(11,12);
     r1.getarea();
     
	}}



