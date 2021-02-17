package Collections;

import java.util.List;

import java.util.ArrayList;

public class ListInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List list= new ArrayList<>();
		list.add("One");
		list.add("Two");
		list.add("Three");
		list.add("Four");

		for(Object a:list)
		{
			System.out.println(list);
		}
	}

}
