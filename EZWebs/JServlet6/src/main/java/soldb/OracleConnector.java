package soldb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OracleConnector {
	static final String dirver = "oracle.jdbc.driver.OracleDriver";
	static final String url = "jdbc:oracle:thin:@localhost:1521:xe";
	static final String userid = "SOLUSER";
	static final String password = "1234";
	
	static Connection stconn =null;
	
	public static Connection getConnection() {
		try {
			if(stconn != null) {
				return stconn;
			}
			
			Class.forName(dirver);
			stconn = DriverManager.getConnection(url, userid, password);
		}
		catch(ClassNotFoundException e) {
			System.out.println("ClassNotFoundException: " + e.toString());
		}
		catch(SQLException e) {
			System.out.println("SQLException: " + e.toString());
		}
		catch(Exception e) {
			System.out.println("Exception: " + e.toString());
		}
		
		return stconn;
	}
	
	public static void closeConnection() {
		try {
			if(stconn != null) {
				stconn.close();
			}
		}
		catch(SQLException e) {
			System.out.println("[closeConnection] SQLException: " + e.toString());
		}
		catch(Exception e) {
			System.out.println("[closeConnection] Exception: " + e.toString());
		}
	}
	
	public static void main(String[] args) {
		try {
			Class.forName(dirver);
			
			Connection conn = DriverManager.getConnection(url, userid, password);
			System.out.println("Connection: success: " + (conn != null));
			
			boolean dbclosed = conn.isClosed();
			System.out.println("dbclosed: " + dbclosed);
			
			conn.close();
			System.out.println("dbclosed: " + conn.isClosed());
		}
		catch(ClassNotFoundException e) {
			System.out.println("[main]ClassNotFoundException: " + e.toString());
		}
		catch(SQLException e) {
			System.out.println("[main]SQLException: " + e.toString());
		}
		catch(Exception e) {
			System.out.println("[main]Exception: " + e.toString());
		}
	}
}
