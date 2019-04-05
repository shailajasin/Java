package collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetEx {
//stores the elements in random order.. doesn't accept duplicates..
	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet<String> hs=new HashSet<String>();
hs.add("sairam");
hs.add("USA");
//hs.add("USA");
hs.add("UK");
hs.add("MA");
		//System.out.println(hs);
	//System.out.println(	hs.contains("USA"));
	Iterator<String> i= hs.iterator();
i.next();
		/*
		 * System.out.println( i.next()); System.out.println( i.next());
		 * System.out.println( i.next());
		 */
	while(i.hasNext())
	{
		
		System.out.println(i.next());
	}
	}
}
