package Abstraction;
interface BaseI { void method();}
class BaseC{
	public void method() {
		System.out.println("Inside n,nwddn");
	}

}
public class ImplC extends BaseC implements BaseI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		(new ImplC()).method();
	}


}
