package com.myhashmap;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class MyHashMapTest {
	
	@Test
	public void countWordOccurancesInLine() {
		String str = "To be or not to be";
		String[] words = str.split(" ");
		MyHashMap<String, Integer> myHashMap = new MyHashMap<String, Integer>();
		for (String word : words) {
			Integer value = myHashMap.get(word.toLowerCase());
			if (value == null) {
				value = 1;
			} else {
				value += 1;
			}
			myHashMap.add(word.toLowerCase(), value);
		}
		int frequency = myHashMap.get("or");
		System.out.println(frequency);
		assertEquals(1, frequency);
		System.out.println(myHashMap);
		System.out.println("size of hashmap: " + myHashMap.size());
		System.out.println("Removing not key : " + myHashMap.remove("not"));
		System.out.println(myHashMap);
		System.out.println("size of hashmap: " + myHashMap.size());
	}


}
 