package members;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import soldb.OracleConnector;

public class MemberDBCP {
	private DataSource datasource;
	
	public MemberDBCP() {
		try {
			Context ctx = new InitialContext();
			Context env = (Context)ctx.lookup("java:/comp/env");
			datasource = (DataSource)env.lookup("jdbc/oracle");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
 	}
	
	public List<MemberVO> getMembers(){
		List<MemberVO> listMembers = new ArrayList<MemberVO>();
		
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			String sql = "SELECT * FROM member ORDER BY mid";
			
			//conn = OracleConnector.getConnection();
			conn = datasource.getConnection();
			
			stmt = conn.prepareStatement(sql);
			rs = stmt.executeQuery();
			
			while(rs.next()) {
				String mid = rs.getString("mid");
				String mname = rs.getString("mname");
				String pwd = rs.getString("pwd");
				String email = rs.getString("email");
				Date regdate = rs.getDate("regdate");
				
				MemberVO member = new MemberVO();
				member.setMid(mid);
				member.setMname(mname);
				member.setPwd(pwd);
				member.setEmail(email);
				member.setRegdate(regdate);
				
				listMembers.add(member);
			}
		}
		catch(Exception e) {
			System.out.println("[sqlQuery] SQLException: " + e.toString());
		}
		finally {
			try {
				if(rs != null) {
					rs.close();
				}
				if(stmt != null) {
					stmt.close();
				}
				conn.close();
			}
			catch(Exception e) {
				System.out.println("[sqlQuery] finally SQLException: " + e.toString());
			}
			
			// OracleConnector.closeConnection();
		}
		return listMembers;
	}
}
