package Collections;

import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector<String> v=new Vector<>();
		v.addElement("Achal");
		v.addElement("Pradip");
		v.addElement("Jain");
		v.addElement("QA");
		
		Enumeration e= v.elements();
		while(e.hasMoreElements())
			System.out.println(e.nextElement());
		
		
		

	}

}
