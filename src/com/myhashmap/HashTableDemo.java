package com.myhashmap;

public class HashTableDemo {
	
	public static void main(String[] args) {
		String str = "Paranoid are no paranoid because they are paranoid "
				+ "but because they keep putting themselves deliberately " + "into paranoid avoidable situations";
		String[] words = str.split(" ");
		MyLinkedHashMap<String, Integer> myHashMap = new MyLinkedHashMap<String, Integer>();
		for (String word : words) {
			Integer value = myHashMap.get(word.toLowerCase());
			if (value == null) {
				value = 1;
			} else {
				value += 1;
			}
			myHashMap.add(word.toLowerCase(), value);
		}
		System.out.println(myHashMap);
		System.out.println("Size of Linked Hash Map : " + myHashMap.size());
		System.out.println("After removeing because key : " + myHashMap.remove("because"));
		System.out.println(myHashMap);
		System.out.println("Size of Linked Hash Map : " + myHashMap.size());
	}

}
