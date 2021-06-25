package io;

import java.io.File;

public class PathFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 File directoryPath= new File("C:\\Users\\Dell_User\\eclipse-workspace\\java program\\src\\Abstraction");
 File fileslist[] = directoryPath.listFiles();
 System.out.println("list of files and directories in dpecified directory");
 for(File file : fileslist )
 {
	 System.out.println("file name:"+ file.getName());
	 System.out.println("file path:"+ file.getName());
	 System.out.println("file absolutepath:"+ file.getAbsolutePath());

	 System.out.println("file size:"+ file.getTotalSpace());
	 System.out.println("file size:"+ file.getTotalSpace());
	 }
	}

}
