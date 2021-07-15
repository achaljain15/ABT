package functions;

import java.util.HashMap;
import java.util.Map.Entry;

public class finalCheck {
	public static void main(String[] args) {

		String s = "112233445547";
		char[] ch = s.toCharArray();
		// System.out.println(ch);
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < ch.length; i++) {
			if (map.containsKey(ch[i])) {
				//System.out.println(map.get(ch[i]));
				map.put((int) ch[i], map.get(ch[i]) + 1);
			} else {
				map.put((int) ch[i], 1);
			}
		}
		System.out.println(map);

		// ===>> hmap is ready
		int sum=0 ;
		//for(int i=0;i<map.size();i++)
		for(Entry<Integer, Integer> num : map.entrySet())
		 {
		 int key = num.getKey();
		 int value = num.getValue();
		 if(value == 2)
		 {
		sum = sum +  key;
		 }
		 }

		 System.out.println("sum====  "+sum);

		}	

}
