package Collections;

import java.util.HashSet;
import java.util.Set;

public class SetsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> s=new HashSet();
		s.add("Achal");
		s.add("Lost");
		s.add("World");
		s.add("Failure");
		s.add("Success");
		
		for(Object s1:s) {
		System.out.print(s1);
		System.out.print
		("\t"+
		s1.hashCode()+"\n");
		}
	}

}
