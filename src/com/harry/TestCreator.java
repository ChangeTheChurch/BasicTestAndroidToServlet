package com.harry;

import java.util.HashMap;

public class TestCreator {
	
	HashMap<String, Object> intro = new HashMap<>();
	
	public TestCreator(String name, int age) {
		intro.put("name", name);
		intro.put("age", age);
	}
}
