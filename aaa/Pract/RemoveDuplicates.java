package Pract;

import java. util. HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
	public void removeDuplicatesUsingSet(String str) {
		Set<Character> characters = new LinkedHashSet<>();
		char[] arr = str.toCharArray();
		for(char eachChar: arr) {
			characters.add(eachChar);
		}
			System.out.println(characters);
	}
			public static void main(String[] args) {
			String n = "Programming";
			RemoveDuplicates rd = new RemoveDuplicates();
			rd.removeDuplicatesUsingSet(n);
		}
}