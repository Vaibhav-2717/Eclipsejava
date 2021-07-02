package Exceptionhandling;

import java.util.Scanner; 
 
@SuppressWarnings("serial") 
class InvalidInputException extends Exception{ 
 	String msg; 
 	InvalidInputException(String msg)  
    { 
 	 	this.msg=msg; 
 	 } 
 	public String toString() 
    {      return msg; 
    } } class Customer 
{ 
 	String custNo,custName,category; 
 	Customer(String custNo,String custName,String category) 
 	{ 
 	 	this.custNo=custNo;  	
 	 	this.custName=custName;  	 
 	 	this.category=category; 
 	} 
 	public void customerNo() 
 	{  	 	try 
 	 	{ 
 	 	if(custNo.charAt(0)=='c'||custNo.charAt(0)=='C') 
 	 	{ 
 	 	 	System.out.println(custNo); 
 	 	} 
 	 	else 
 	 	{ 
   throw new InvalidInputException("customer no is not valid");
} 
 	}catch(InvalidInputException e) 
 	  { 
 	 	System.out.println(e.toString()); 
 	  } 
 	} 
 	public void customerName() 
 	{ 
 	 	try { 
 	 	 	if(custName.length()>=4) 
 	 	 	{ 
 	 	 	 	System.out.println(custName); 
 	 	 	} 
 	 	 	else 
 	 	 	{ 
    throw new InvalidInputException("customer name is not valid"); 
 	 	 	} 
 	 	}catch(InvalidInputException e) 
 	 	{ 
 	 	 	System.out.println(e.toString()); 
 	 	} 
 	} 
 	public void custCategory() 
 	{  	 	try { 
 	 
 	if(category.equals("Platinum")||category.equals("Gold")||category.equals("Silver")) 
 	 	 	{ 
 	 	 	 	System.out.println(category); 
 	 	 	} 
 	 	 	else 
 	 	 	{ 
    throw new InvalidInputException("customer category is not valid"); 
 	 	 	} 
 	 	}catch(InvalidInputException e) 
 	 	{ 
 	 	 	System.out.println(e.toString()); 
 	 	} 
 	} 
}  
public class TestCustomer { 
  public static void main(String[] args) { 
 	 	// TODO Auto-generated method stub 
 	 	String s1,s2,s3; 
  Scanner input = new Scanner(System.in);  
  System.out.println("Enter customer no=");
  s1=input.nextLine(); 
 	 	System.out.println("Enter customer name=");
 	 	s2=input.nextLine(); 
 	 	System.out.println("Enter category=");  	 	
 	 	s3=input.nextLine(); 
 	 	
 	 	Customer c= new Customer(s1,s2,s3);  
 	 	c.customerNo(); 
 	 	c.customerName(); 
 	 	c.custCategory();  	 	input.close(); 
 
 	} 
 
} 



