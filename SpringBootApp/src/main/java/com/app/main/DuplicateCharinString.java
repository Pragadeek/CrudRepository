package com.app.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DuplicateCharinString {

	public static void main(String[] args) {

		String s = "Pragadee";

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0; i < s.length(); i++) {
			int count = 0;

			for (int j = 0; j < s.length(); j++) {

				if (s.charAt(i) == s.charAt(j)) {
					count = count + 1;

					map.put(s.charAt(i), count);
				}

			}

		}
		for (Map.Entry m : map.entrySet())

			if ((Integer) m.getValue() != 1) {
				System.out.println(m.getKey() + ": " + m.getValue());
			}

	}

}
