package incrementalassignment;
abstract class Pizza{
	int flag;
	String type;
	String toppings,name;
	float preptym;
	Pizza(){
		if(type=="veg"||type=="non veg") {
		 flag=1;}
		
		if( flag != 1) {
			System.out.println("Inavlid Type");}
		}
abstract void string();
}

 class ItalianPizza extends Pizza{

	@Override
	void string() {
		// TODO Auto-generated method stub
		System.out.println("Italian Pizza details are:"+type +"");
	}
	
}

public class Pizzahut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
