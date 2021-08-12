/*
 * Objects.compare(...)
 */
package section04.object;

import java.util.Objects;

public class CompareExample {

	public static void main(String[] args) {
		Student s1 = new Student(10, 1);
		Student s2 = new Student(20, 2);
		Student s3 = new Student(5, 3);
		
		int result = Objects.compare(s1, s2, new StudentComparator());
		System.out.println("(s1 == s2): " + result);
		System.out.println("(s1 == s2): " + ((result == 0) ? "같다" : 
			(result > 0) ? "크다" : "작다"));
		
		result = Objects.compare(s1, s3, new StudentComparator());
		System.out.println("(s1 == s3) :" + result);
		System.out.println("(s1 == s3) :" + ((result == 0) ? "같다" : 
			(result > 0) ? "크다" : "작다"));
	}

}
