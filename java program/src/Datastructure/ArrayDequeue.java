package Datastructure;

import java.util.ArrayDeque;

public class ArrayDequeue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayDeque<Integer> b = new ArrayDeque<>();
b.add(45);
b.add(78);
b.add(25);
b.add(89);
System.out.println(b.getFirst());
System.out.println(b.getLast());
b.removeFirst();
System.out.println(b.getFirst());
	}

}
