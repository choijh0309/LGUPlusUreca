package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) throws Exception {
		String url = "jdbc:mysql://localhost:3306/madangdb";
	    String user = "root";
	    String pwd = "root1234";
	    
	    
		// DB 연결 시도하고 연결되면 Connection 객체 획득
		Connection con = DriverManager.getConnection(url, user, pwd);
		Statement stmt = con.createStatement();
		ResultSet rs = null;
		
		// insert
//	    {
//	    	String insertSql = "insert into customer values (6, '손흥민', '영국 토트넘', '010-6666-6666'); ";
//	    	int ret = stmt.executeUpdate(insertSql);
//		    System.out.println(ret);
//	    }
		
	    
	    // update
//	    {
//		    String updateSql = "update customer set address = '한국 서울' where custid = 6; ";
//		    int ret = stmt.executeUpdate(updateSql);
//		    System.out.println(ret);
//	    }
		
		// select
//		{
//		    String selectListSql = "select * from customer; ";
//		    rs = stmt.executeQuery(selectListSql);
//		    while (rs.next()) {
//		    	// row 한 개당 행(컬럼) 값 추출 
//		    	System.out.println(rs.getInt("custid") + " | " + rs.getString("name") + " | " + rs.getString("address") + " | " + rs.getString("phone"));
//		    }
//	    }
		
		// select detail (one by pk)
//		{
//		    String selectDetailSql = "select * from customer where custid = 6; ";
//		    rs = stmt.executeQuery(selectDetailSql);
//		    while (rs.next()) {
//		    	// row 한 개당 행(컬럼) 값 추출 
//		    	System.out.println(rs.getInt("custid") + " | " + rs.getString("name") + " | " + rs.getString("address") + " | " + rs.getString("phone"));
//		    }
//	    }
		
		// delete
		{
		    String deleteSql = "delete from customer where custid = 7; ";
		    int ret = stmt.executeUpdate(deleteSql);
		    System.out.println(ret);
	    }
	    
	    // con, stmt <- resource
		if (rs != null) rs.close();
	    stmt.close();
	    con.close();
	}

}
