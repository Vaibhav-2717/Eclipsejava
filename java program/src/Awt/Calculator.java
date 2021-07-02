package Awt;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JTextField t;
		JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bdiv,bmul,bsub,badd,bdec,beq,bdel,bclr;
		 
JFrame f = new JFrame("Calculator");
 f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// f.add(new TextField("display"));
// f.setBounds(500,500,500,50);
// f.setLayout(new GridLayout(5,4));
// f.add(new JButton("c"));
// f.add(new JButton("%"));
// f.add(new JButton("del"));
// f.add(new JButton("%"));
// f.add(new JButton("7"));
// f.add(new JButton("8"));
// f.add(new JButton("9"));
// f.add(new JButton("X"));
// f.add(new JButton("4"));
// f.add(new JButton("5"));
// f.add(new JButton("6"));
// f.add(new JButton("-"));
// f.add(new JButton("1"));
// f.add(new JButton("2"));
// f.add(new JButton("3"));
// f.add(new JButton("+"));
// f.add(new JButton("00"));
// f.add(new JButton("0"));
// f.add(new JButton("."));
// f.add(new JButton("="));
//f.setSize(500,500);
// f.setVisible(true);
 f=new JFrame("Calculator");
 t=new JTextField();
 b1=new JButton("1");
 b2=new JButton("2");
 b3=new JButton("3");
 b4=new JButton("4");
 b5=new JButton("5");
 b6=new JButton("6");
 b7=new JButton("7");
 b8=new JButton("8");
 b9=new JButton("9");
 b0=new JButton("0");
 bdiv=new JButton("/");
 bmul=new JButton("*");
 bsub=new JButton("-");
 badd=new JButton("+");
 bdec=new JButton(".");
 beq=new JButton("=");
 bdel=new JButton("Delete");
 bclr=new JButton("Clear");
 t.setBounds(30,40,280,30);
 b7.setBounds(40,100,50,40);
 b8.setBounds(110,100,50,40);
 b9.setBounds(180,100,50,40);
 bdiv.setBounds(250,100,50,40);
 b4.setBounds(40,170,50,40);
 b5.setBounds(110,170,50,40);
 b6.setBounds(180,170,50,40);
 bmul.setBounds(250,170,50,40);
 b1.setBounds(40,240,50,40);
 b2.setBounds(110,240,50,40);
 b3.setBounds(180,240,50,40);
 bsub.setBounds(250,240,50,40);
 bdec.setBounds(40,310,50,40);
 b0.setBounds(110,310,50,40);
 beq.setBounds(180,310,50,40);
 badd.setBounds(250,310,50,40);
 bdel.setBounds(60,380,100,40);
 bclr.setBounds(180,380,100,40);
 f.add(t);
 f.add(b7);
 f.add(b8);
 f.add(b9);
 f.add(bdiv);
 f.add(b4);
 f.add(b5);
 f.add(b6);
 f.add(bmul);
 f.add(b1);
 f.add(b2);
 f.add(b3);
 f.add(bsub);
 f.add(bdec);
 f.add(b0);
 f.add(beq);
 f.add(badd);
 f.add(bdel);
 f.add(bclr);
 f.setLayout(null);
 f.setSize(350,500);
 f.setResizable(false);
f.setVisible(true);
	}

}
