package in.winny.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {
 
	public static void main(String[] args) {
		// Creation of map
		Map<Integer, String> m = new HashMap<>();
		// Addition of elements into the map
		m.put(1, "SriRama");
		m.put(2, "Hanuman");
		m.put(3, "Shiva");
		
		  // System.out.println(); // Retrieval of keys from the map 
		Set<Integer> keys
		  = m.keySet(); for (Integer key : keys) { System.out.println(key);
		  
		  } System.out.println(); // Retrieval of values from the map
		  Collection<String> values = m.values(); 
		  for (String value : values) {
		  System.out.println(value);
		  } System.out.println(); 
		  //Retrieval of values from the map based on keys
		  System.out.println(m.get(2));
		  System.out.println("*********"); //Retrieval of values and keys the map based	on key using forEach
		  for (Integer key : keys) {
		  System.out.println(key+">"+m.get(key));
		  
		  }
		 
		
		  //System.out.println(m);
		  System.out.println();
		  //Deletion of element from map based on key or value or key,value		 
		  m.remove(1); System.out.println(m);
		  
		  //Verification of keys in the map System.out.println(m.containsKey(2));
		  System.out.println(m.containsKey(1)); // It is already deleted
		  System.out.println(); //Verification of value in the map
		  System.out.println(m.containsValue("Hanuman"));
		  System.out.println(m.containsValue("SriRama"));// It is already deleted
		  System.out.println(m.containsValue("Srinivas"));
		 
		
		  // update of element in map System.out.println(m); System.out.println();
		  m.put( 2, "Raju"); m.replace(3, "RajaShekar");
		  
		  m.putIfAbsent(1,"Varsha"); System.out.println(m);//if already data available it will print old data. otherwise it will add data.
		 
		
		  //Printing whole length of the map System.out.println(m.size());
		 
		
		  //Deleting whole date of the map m.clear(); System.out.println(m);
		 

		Set<Entry<Integer, String>> entries = m.entrySet();

		for (Entry<Integer, String> entry : entries) {
			Integer key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + ">>>>" + value);
		}

		System.out.println(entries);

	}

}
