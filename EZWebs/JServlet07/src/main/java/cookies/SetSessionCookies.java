/*
 * [세션쿠키]
 *   - 브라우저가 사용하는 메모리에 저장
 *   - 브라우저가 종료되면 쿠키도 소멸
 *   - 순서
 *     1) 브라우저가 서버에 접속(요청)을 하면 서버는 쿠키를 생성해서 브라우저 전송
 *     2) 브라우저는 서버가 전송한 쿠키를 받아서 메모리에 보관
 *     3) 브라우저는 다시 서버에 요청할 때 메모리에 보관된 쿠키를 서버에 전송
 *     4) 서버는 브라우저가 전송한 쿠키를 보고 동일한 브라우저라는 것을 식별
 */
package cookies;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/setsessioncookies")
public class SetSessionCookies extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		
		Cookie hellosession = new Cookie("hellosession", URLEncoder.encode("Hello Session Cookie", "utf-8"));
		hellosession.setMaxAge(-1); // 세션쿠키
		response.addCookie(hellosession);
		
		resHTML(response.getWriter());
	}
	
	static void resHTML(PrintWriter out) {
		out.print("<html><body>");
		out.print("<h1>세션쿠키 처리</h1>");
		out.print("<hr>");
		out.printf("<p>세션쿠키 처리시간: %s</p>", new Date());
		out.print("</body></html>");
	}
}