package Exceptionhandling;
class Voter 
{ 
 	int age; 
 	Voter(int age) 
 	{ 
 	 	this.age=age; 
 	} 
 	boolean checkAge() throws Exception 
 	{ 
 	 	if(age<18) 
 	 	{ 
   throw new Exception("age should be greater then 18"); 
 	 	} 
 	 	else 
 	 	{ 
 	 	 	return true; 
 	 	} 
 	} 
 	void checkValidity() throws Exception 
 	{ 
 	 	if(checkAge()) 
 	 	{ 
 	 	 	System.out.println("you can vote"); 
 	 	} 
 	} 
} 

public class CanVoter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		 	 	Voter v= new Voter(20); 
		 	 	try { 
		 	 	 	v.checkValidity(); 
		 	 	} catch (Exception e) { 
		 	 	 	// TODO Auto-generated catch block  	 	 	
		 	 		e.printStackTrace(); 
		 	 	} 
		 
		 	}

		 
}
