package com.demo.Map;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map.Entry;

public class MapStudy {
	public void displayUsingEntrySet(HashMap<Integer, String> m) {
		Set<Entry<Integer, String>> s = m.entrySet();
		Iterator<Entry<Integer, String>> itr = s.iterator();
		while (itr.hasNext()) {
			Entry<Integer, String> e = itr.next();
			Integer n = e.getKey();
			String str = e.getValue();
			System.out.println("key" + n + " ," + "Value: " + str);
		}
	}

	public void show(HashMap<Integer, String> m) {
		System.out.println("****** Values Method in Map****");
		Collection<String> c = m.values();
		Iterator<String> itr = c.iterator();
		while (itr.hasNext()) {
			String str = itr.next();
			System.out.println("Values is:" + str);
		}

	}

	public static void main(String[] args) {
		HashMap<Integer, String> hashmap = new HashMap<>();
		String str1 = hashmap.put(34, "sales");
		hashmap.put(38, "productions");
		hashmap.put(40, "productions");
		hashmap.put(34, "Account");
		hashmap.put(42, "Maintence");
		System.out.println(hashmap);
		/*
		 * String str=hashmap.get(38); System.out.println(hashmap);
		 * System.out.println("Value of key 38:"+str); String
		 * str2=hashmap.getOrDefault(50, "Sorry no entry");
		 * System.out.println("Value:"+str2);
		 * System.out.println("The value"+hashmap.remove(34)+"removed");
		 * System.out.println(hashmap); hashmap.replace(40, "Exectuions");
		 * System.out.println(hashmap); hashmap.replace(40, "Exectuions", "Marketing");
		 * System.out.println(hashmap);
		 */
		Set<Integer> keyset = hashmap.keySet();
		Iterator<Integer> itr = keyset.iterator();
		while (itr.hasNext()) {
			Integer key = itr.next();
			String str = hashmap.get(key);
			System.out.println("Key is:" + key + " Value is " + str);
		}
		MapStudy mapstudy = new MapStudy();
		mapstudy.displayUsingEntrySet(hashmap);
		mapstudy.show(hashmap);
	}

}
