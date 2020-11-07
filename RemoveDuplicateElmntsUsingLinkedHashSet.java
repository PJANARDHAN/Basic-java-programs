package com.besics;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicateElmntsUsingLinkedHashSet {
	
	public static void main(String[] args) {
		
		Integer a[]=new Integer[] {1,2,3,4,5,5,4,3,2,1,8,7,6,6,7,8};
		
		System.out.println(Arrays.toString(a));
		LinkedHashSet<Integer> linkedhashset=new LinkedHashSet<>(Arrays.asList(a));
		
		Integer[] removedduplecates=linkedhashset.toArray(new Integer[] {});
		System.out.println(Arrays.toString(removedduplecates));
	}
}
