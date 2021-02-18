package Collections;

import java.util.List;
import java.util.Vector;
import java.util.ArrayList;
import java.util.LinkedList;
public class ListInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list= new LinkedList<>();
		list.add("One");
		list.add("Two");
		list.add("Three");
		list.add("12");
		list.remove(2);
		
		for(Object s: list)
			System.out.print(s);
	System.out.println("\n");
	
	List<String> alist= new ArrayList<>();
	alist.add("One");
	alist.add("Two");
	alist.add("Three");
	alist.add("12");
	alist.remove(2);
	
	for(Object s1: list)
		System.out.print(s1);

	System.out.println("\n");
	
	List<Object> vlist=new Vector<>();
	vlist.add(12);
	vlist.add(34);
	vlist.add(56);
	for(Object s2:vlist)
		System.out.println(s2);
}
}
