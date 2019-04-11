package com.narendra;

import java.util.HashMap;

public class HashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, String> hashMap=new HashMap<String, String>();
		hashMap.put("a", "A");
		hashMap.put(null, "C");
		hashMap.put(null, "B");
		System.out.println(hashMap);
	}

}
