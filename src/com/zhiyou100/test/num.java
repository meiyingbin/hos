package com.zhiyou100.test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class num {
	public static void main(String[] args) {
		Map<Integer,String> m = new HashMap<>();
		m.put(1, "a");
		m.put(2, "b");
		m.put(3, "c");
		m.put(4, "d");
Set<Integer> keys = m.keySet();
for(Integer key : keys) {
			String value = m.get(key);
			System.out.println("key : "+key+" = value : "+value);
		}
	}

}
