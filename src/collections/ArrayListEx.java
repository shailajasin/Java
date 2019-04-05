package collections;

import java.util.ArrayList;

public class ArrayListEx {
// Stores in sequencing order and accepts duplication of elments..
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String >al=new ArrayList<String>();//No need to define array size..
		al.add("omsairam");
		al.add("USA");
		al.add("UK");
		System.out.println(al);
		System.out.println(al.contains("USA"));
		System.out.println(al.indexOf("UK"));
		al.add("UK");
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.isEmpty());
		
	}

}
