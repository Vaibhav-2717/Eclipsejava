package filehandling;

import java.io.File;
import java.io.IOException;

public class CanExecute {

	public static void main(String[] args) {
		
	        File f = new File("newfile.txt"); 
	 	 	if(f.exists()) 
	 	 	{ 
	 	 	 	System.out.println("file exists");  	 	 	
	 	 	 	System.out.println(f.getAbsolutePath()); 
	 	 	 	if(f.canExecute()) 
	 	 	 	{ 
	 	 	 	 	System.out.println("this is executable file"); 
	 	 	 	} 
	 	 	 	if(f.canRead()) 
	 	 	 	{ 
	 	 	 	 	System.out.println("this file can be read"); 
	 	 	 	} 
	 	 	 	if(f.canWrite()) 
	 	 	 	{ 
	    System.out.println("this file is writable"); 
	 	 	 	} 
	 	 	} 
	 	 	else 
	 	 	{ 
	 	 	 	System.out.println("file does not exists"); 
	 	 	 	try { 
	 	 	 	 	f.createNewFile(); 
	 	 	 	} catch (IOException e) { 
	 	 	 	 	// TODO Auto-generated catch block  	 	 	 	
	 	 	 		e.printStackTrace(); 
	 	 	 	} 
	 	 	 	finally{ 
	    System.out.println("new file created");   
	    System.out.println("thanks for using our services"); 
	 	 	 	} 
	 
	 	 	} 
	 	 	 
	 	} 

}
