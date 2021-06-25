package filehandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch;

		try {
			FileReader fr= new FileReader("C:\\Users\\Dell_User\\eclipse-workspace\\java program\\src\\Exceptionhandling\\ArrayEx.java");
			FileWriter fw= new FileWriter("C:\\Users\\Dell_User\\eclipse-workspace\\java program\\src\\Exceptionhandling\\UserInput.java");
			while((ch=fr.read())!=-1)
			{
				fw.write(ch);
			}
			fr.close();
			fw.close();
			System.out.println("Your file is copied congratulations");
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}

}
