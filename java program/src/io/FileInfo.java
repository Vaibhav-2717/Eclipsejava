package io;

import java.io.File;
import java.io.IOException;

public class FileInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 File f = new File("C:\\Users\\Dell_User\\eclipse-workspace\\java program\\src");
 if(f.exists()) {
	 System.out.println("file Exists");
	 if(f.canExecute()) {
		 System.out.println("this is excecutable file");
	 }
	 if(f.canRead()) {
		 System.out.println("this file is readable");
	 }
 }
 
 else {
	 System.out.println("File does'nt esists");
 }
 try {
	f.createNewFile();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}

}
