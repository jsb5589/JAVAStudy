package section10.regexpr;

import java.util.regex.Pattern;

public class PatternExample2 {

	public static void main(String[] args) {
		multipleRegExpr();
	}
	
	static void multipleRegExpr() {
	//	String regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		String regExp = "\\w+(\\.\\w+)?@\\w+\\.\\w+(\\.\\w+)?";
		String[] datum = {
				"angel@naver.com",
				"angel@navercom",
				"anger@naver.co.kr",
				"anger.web@naver.com"
		};
		
		for(int cnt=0; cnt < datum.length; cnt++) {
		boolean result = Pattern.matches(regExp, datum[cnt]);
		if(result) {
			System.out.println("일치하는 자료 :" + datum[cnt]);
		}
		else {
			System.out.println("일치하지 않는 자료 :" + datum[cnt]);
			}
		}
	}
}
