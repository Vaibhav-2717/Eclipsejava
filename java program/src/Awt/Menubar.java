package Awt;


import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;

public class Menubar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame F = new JFrame();
 JMenuBar mb1 = new JMenuBar();
 JMenu m1= new JMenu("File");
 mb1.add(m1);
 F.setJMenuBar(mb1);
	}

}
