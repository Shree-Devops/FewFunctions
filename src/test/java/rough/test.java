package rough;

import java.util.LinkedList;

public class test {
	
	public static void main(String[] args) {
		
		LinkedList <String> linkedList = new LinkedList ();
		linkedList.add("Cf");         // [C]
		linkedList.add(0,"gB");       // [B,C]
		linkedList.addFirst("fA");    // [A,B,C]
		linkedList.addLast("Df");     // [A,B,C,D]
		
		linkedList.set(2,"Kf");       // [A,B,K,D]
		
//		linkedList.remove("K");      // [A,B,D]
//		linkedList.remove("1");      // [A,D]
//		linkedList.removeFirst();    // [D]
//		linkedList.removeLast();     // []
//		
		//iterate through an LinkedList
		for (String obj: linkedList) {
			System.out.println(obj);
		}
		
		for (int i=0; i< linkedList.size(); i++)
		{
			System.out.println(linkedList.get(i));
		}
	}

}
