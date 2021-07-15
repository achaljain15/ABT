/*
 * package filehandler;
 * 
 * import java.util.HashMap; import java.util.Map.Entry;
 * 
 * public class Rename { public static void main(String[] args) { // TODO
 * Auto-generated method stub long a = 1122334457; int len =
 * Long.toString(a).length(); int[] ar = new int[len]; for (int i = 0; i < len;
 * i++) { ar[i] = (int) (a % 10); a = a / 10; }
 * 
 * for (int j = 0; j < ar.length; j++) { System.out.println(ar[j]);
 * 
 * }
 * 
 * HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>(); //
 * HashSet<Integer> hs = new HashSet<Integer>();
 * 
 * // Iterator it1 = hs.iterator(); // int count = 0; for (int k = 0; k <
 * ar.length; k++) { if (hm.containsKey(ar[k])) { hm.put(ar[k], hm.get(ar[k]) +
 * 1); }
 * 
 * else { hm.put(ar[k], 1);
 * 
 * } } // Iterator it = hm.entrySet().iterator(); int sum = 0;
 * System.out.println(hm);
 * 
 * for (Entry<Integer, Integer> num : hm.entrySet()) { int key = num.getKey();
 * int value = num.getValue(); if (value == 2) { sum = sum + key; } }
 * 
 * System.out.println("sum====  " + sum);
 * 
 * } }
 */