[JDBC Driver]
https://www.oracle.com/kr/databae/technologies/appdev/jdbc-dwnloads.html

Oracle Database 12.2.0.1 JDBC DRIVER & DOWNLOADS
https://www.orcle.com/database/technologies/jdbc-ucp-122-downloads.html

Filename: ojdbc8.jar
Install Path: Tomcat/lib/ojdbc8.jar

커넥션풀(Connection Pool)
[DBCP]
http://www.java2s.com/Code/Jar/t/Downloadtomcatdbcp7030jar.htm

(Tomcat:/conf/context.xml)
<Context>
<Resource
		name="jdbc/oracle"
		auth="Container"
		type="javax.sql.DataSource"
		driverClassName="oracle.jdbc.OracleDriver"
		url="jdbc:oracle:thin:@localhost:1521:xe"
		username="SOLUSER"
		password="1234"
		maxActive="50"
		maxWait="-1"
	/>