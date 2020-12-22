package DataBase;


import java.sql.*;

public class MariaDB_Connect
{
    public static void main(String[] args)
    {
       Connection dbCon = null;
       Statement stmt = null;
   		ResultSet resSet= null;
       //程式參數
       String sDriver = "org.mariadb.jdbc.Driver";
       String sCon = "jdbc:mariadb://localhost:3306/mydb";
	   String sql;
      
       try   //載入JDBC driver 
       {     
           Class.forName(sDriver);
       }
       catch(Exception e)
       {
           System.out.println("無法載入驅動程式");
           return;
       }
       
       try   //建立資料連結和Statement物件
       {
           dbCon = DriverManager.getConnection(sCon,"root","1234");
          if (dbCon != null)
        	 System.out.println("建立Connection物件成功!");
		  
		   sql = "select * from employee";
		  
           stmt = dbCon.createStatement();
           
           if (stmt != null)
          //    System.out.println("建立Statement物件成功!");
           resSet=stmt.executeQuery(sql);
         
           int count=0;
           while(resSet.next()){          		   
        	System.out.print(resSet.getString(1)+"\t");        	
        	System.out.print(resSet.getString(2)+"\t\t");
        	System.out.print(resSet.getString(3)+"\t");   	        	
        	System.out.print(count);   
        	System.out.println();                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     
          }            		
       }
       catch(SQLException e)
       {
           System.out.println("與資料來源連結錯誤: " + sCon);
           System.out.println(e.getMessage());
           if (dbCon != null)
           {
              try { dbCon.close(); }
              catch( SQLException e2 ) {}
           }
           return;
       }
      
       finally
       {
           try 
           { 
                stmt.close(); 
                dbCon.close(); 
           }
           catch( SQLException e ) {}
       }
    }
    
    public static void getdata(){
    	
    }
}



