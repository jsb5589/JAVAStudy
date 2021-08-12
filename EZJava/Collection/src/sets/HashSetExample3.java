/*
 * [set]
 * 1. 중복해서 들어 가지 않음
 * 2. 순서가 무작위
 */
package sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample3 {

	public static void main(String[] args) {
		Set<String> setString = new HashSet<String>();
		
		setString.add("자바");
		setString.add("자바스크립트");
		setString.add("파이썬");
		
		printSet(setString);
		
	}

	static void printSet(Set<String> sets) {
		System.out.println("setString.size : " + sets.size());
		
		Iterator<String> iterator = sets.iterator();
		while(iterator.hasNext()) {
			String str = iterator.next();
			System.out.println(str);
		}
		
	}
	
}