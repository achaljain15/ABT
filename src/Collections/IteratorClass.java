package Collections;

import java.util.HashSet;
import java.util.Set;

import java.util.Iterator;

public class IteratorClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> s = new HashSet();
		s.add("Achal");
		s.add("Lost");
		s.add("World");
		s.add("Failure");
		s.add("Success");
		// Iterator is an object that can be used to loop through collections, like
		// ArrayList and HashSet. It is called an "iterator" because "iterating" is the
		// technical term for looping.
		Iterator<String> it = s.iterator();
		while (it.hasNext())
			System.out.println(it.next());
		
		

	}

}
