package DataBase;

import java.sql.*;
import java.sql.SQLException;

public class Test {

	public static void main(String[] args) {
		String strSQLInesrtTo,strSQLDelete,strSQLUpdata ;
		String strNo, strName, strID, strAge, strdept;
		strNo="S0006";
		strName="老孟";
		strID="A123456789";
		strAge="83";
		strdept="資處科";
		// 新增INSERT INTO 學生表 VALUES ('S0006','老孟','A123456789','38','資管系');
		strSQLInesrtTo="INSERT INTO 學生表 VALUES  ('"+strNo+"' , '"+strName+"' , '"+strID+"' , '"+strAge+"' , '"+strdept+"' ) ;";
		//刪除 DELETE FROM customers WHERE Name='老王';		
		strSQLDelete="DELETE FROM 學生表 WHERE 學號= '"+strNo+"' ";
		//UPDATE customers SET Phone='03-87654321' WHERE Name='王二';
		strSQLUpdata="UPDATE 學生表 SET 學號= '"+strNo+"'  WHERE 姓名='"+strName+"'";
		// JDBC driver Test
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			System.out.println("Connection  OK .");
		} catch (ClassNotFoundException e) {			
			System.out.println("Connection  feil?!?! .");
		}

		// Connection Ttest
		try {
			Connection cn = DriverManager
					.getConnection("jdbc:sqlserver://localhost\\SQLEXPRESS;user=sa;password=1234;database=ch2_DB");
			Statement sm = cn.createStatement();
			sm.executeUpdate(strSQLUpdata);// 在這操作編輯、修改、查詢操作
			ResultSet rs = sm.executeQuery("SELECT * from 學生表");
			ResultSetMetaData rsmd = rs.getMetaData();
			for (int i = 1; i < rsmd.getColumnCount(); i++) {
				System.out.print(rsmd.getColumnName(i) + "\t");
			}
			System.out.println();
			while (rs.next()) {
				System.out.print(rs.getString(1) + "\t");
				System.out.print(rs.getString(2) + "\t");
				System.out.print(rs.getString(3) + "\t");
				System.out.print(rs.getInt(4) + "\t");
				System.out.println();
			}

		} catch (SQLException e) {
			System.out.print("Connection  fail...."+e.getMessage());
		}

	}
}
