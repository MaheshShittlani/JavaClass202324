//HashMap
import java.util.*;
class HashMapDemo1{
	public static void main(String args[]){
		HashMap<String,Integer> hm=new HashMap<>();
		hm.put("Ram",20000);
		hm.put("Shyam",10000);
		hm.put("kk",12000);
		hm.put("Tim",12300);
		
		System.out.println(hm);

		// Using keys
		Set<String> keys = hm.keySet();
		for(String key: keys) {
			System.out.println(key+ " - " + hm.get(key));
		}
		System.out.println("----------------------------");
		// Using Entry Set
		Set<Map.Entry<String,Integer>> entries = hm.entrySet();

		Iterator<Map.Entry<String,Integer>> itr = entries.iterator();

		while(itr.hasNext()) {
			Map.Entry<String,Integer> entry = itr.next();
			System.out.println(entry.getKey()+" - " + entry.getValue());
		}

		System.out.println("----------------------------");
		// Using foreach loop

		for(Map.Entry<String,Integer> entry: entries) {
			System.out.println(entry.getKey()+ " - " + entry.getValue());	
		}
	}
}