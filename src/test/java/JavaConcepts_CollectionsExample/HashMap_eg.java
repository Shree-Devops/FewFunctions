package JavaConcepts_CollectionsExample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HashMap_eg {

	public static void main(String[] args) {
		
		HashMap<String, String> hmap = new HashMap <String, String> ();
		
		hmap.put("1stname", "shree");
		hmap.put("middlename", "mohini");
		hmap.put("lastname", "baghel");
		hmap.put("lastname", "BAGHEL");
		hmap.put("1st", null);
		hmap.put("2nd", null);
		hmap.put(null, "BAGHEL");
		hmap.put(null, null);		
		
		System.out.println(hmap);
		System.out.println(hmap.get("1stname"));
		//System.out.println(hmap));
		
		Set <String> setOfKeys = hmap.keySet(); // will return a set of keys coz keys are unique
		for (String key: setOfKeys) {
			System.out.println(key);
			System.out.println(hmap.get(key));
		}
		
		// Values can be a list of data/ maps etc.
		HashMap <String , List<String> > hmap2 =  new HashMap <String, List<String> > ();
		List<String> listOfEmails = new ArrayList();
		listOfEmails.add("abc@def.com");
		listOfEmails.add("shree@yahoo.com");
		listOfEmails.add("123@gmail.com");
		hmap2.put("emails", listOfEmails);
		System.out.println(hmap2);
	}

}
