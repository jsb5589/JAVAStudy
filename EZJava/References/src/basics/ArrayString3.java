package basics;
/*
 * �迭(String)
 */
public class ArrayString3 {

	public static void main(String[] args) {
			String[] str =  null;
			
			if(str == null) {
				str = new String[]{ "ȫ�浿", "�̼���", "������", "������ ������" };
			}
			
			System.out.println("str length:" + str.length);
			
			for(String name : str) {
				System.out.printf("[%s]\n", name);
			}
	}
}
