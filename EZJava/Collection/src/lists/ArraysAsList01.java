/*
 * ������ ��ü�� ����Ʈ �迭�� ó��
 * ����Ʈ�� �ڷḦ �߰��� �� ����.
 * 
 * public class Arrays {
    @SafeVarargs
    @SuppressWarnings("varargs")
    public static <T> List<T> asList(T... a) {
        return new ArrayList<>(a);
    }
 */
package lists;

import java.util.Arrays;
import java.util.List;

public class ArraysAsList01 {

	public static void main(String[] args) {
		// List<String> listLangs = Arrays.<String>asList("1.�ڹ�", "2.�ڹٽ�ũ��Ʈ", "3.���̽�");
		List<String> listLangs = Arrays.asList("1.�ڹ�", "2.�ڹٽ�ũ��Ʈ", "3.���̽�");
		for(String lang : listLangs) {
			System.out.println(lang);
		}

	}

}
