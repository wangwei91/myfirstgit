package cn.wangwei.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HashSetTest {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		for(int i = 1; i<=5; i++) {
			list.add(i);
		}
		
		System.out.println(list.contains(3));
		list.add(3);
		
		System.out.println(list.toString());
		
		HashSet<Integer> set = new HashSet<>(list);
		System.out.println(set.toString());
		
	}
}
