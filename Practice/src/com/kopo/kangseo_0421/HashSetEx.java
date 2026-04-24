package com.kopo.kangseo_0421;

import java.util.*;

public class HashSetEx {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("Apple");
		set.add("Banana");
		set.add("Apple"); // 중복된 값은 무시됨 (저장 X)
		System.out.println(set.size()); // 2 (Apple, Banana)
		System.out.println(set); // 2 (Apple, Banana)
		boolean hasApple = set.contains("Apple"); // true
		// 순서가 없으므로 인덱스로 접근 불가 (get(i) 없음)
	}

}// CLASS
