package Collections;

import java.util.HashMap;
import java.util.Map;

public class MapInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> map =new HashMap();
		
		
		map.put("Achal",1);
		map.put("Pradip",2);
		map.put("Jain",3);
		
		System.out.println(map.get("Jain"));

	}

}
