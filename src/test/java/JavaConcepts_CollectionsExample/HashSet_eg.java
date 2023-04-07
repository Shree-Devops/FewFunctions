package JavaConcepts_CollectionsExample;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_eg {

	public static void main(String[] args) {
		
		HashSet hset = new HashSet();
		
		hset.add("shree");
		hset.add("s");
		//hset.add(1);
		//hset.add(1);
		//hset.add(null);
		//hset.add(null);
		//hset.add(11.23);
		
		System.out.println(hset);
		
		//HashSet is unodered hence operations using index (e.g. hset.get(0), add(1), remove(2)) are not useful.
		/*
		// to iterate
		for (Object obj:hset) {
			System.out.println(obj);
		} 
		//OR
		Iterator itr = hset.iterator(); // Iterator is an interface
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		*/
		Iterator<String> itr = hset.iterator(); // Iterator is an interface
		while (itr.hasNext()) {
			String temp = itr.next();
			
			if(temp.equals("shree")) {
				System.out.println(temp);
			}
		}
		hset.remove("shree");
		System.out.println(hset);
		System.out.println(hset.size());
		
	}

}
