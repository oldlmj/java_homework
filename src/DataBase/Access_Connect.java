package DataBase;


import java.sql.*;

public class Access_Connect
{
    public static void main(String[] args)
    {
       Connection dbCon = null;
       Statement stmt = null;
   		ResultSet resSet= null;
       //程式參數
       String sDriver = "sun.jdbc.odbc.JdbcOdbcDriver";
       String sCon = "jdbc:odbc:mark_xlsx";
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
           dbCon = DriverManager.getConnection(sCon);
//           if (dbCon != null)
//             System.out.println("建立Connection物件成功!");
		  
		   sql = "select * from [data$]";
		  
           stmt = dbCon.createStatement();
//           if (stmt != null)
//              System.out.println("建立Statement物件成功!");
           resSet=stmt.executeQuery(sql);
          // System.out.println("編號\t姓名\t性別 \t日期 \t\t\t年齡\t地址");     
           System.out.println("地點\t第一期\t第二期 \t第三期 \t第四期\t第五期\t第六期\t總和");
           int count=0;
           while(resSet.next()){
//        	   for(int i=2;i<8;i++){
//           		 count=count+resSet.getShort(i);
//           		 }  
        	System.out.print(resSet.getString(1)+"\t");        	
        	System.out.print(resSet.getShort(2)+"\t");
        	System.out.print(resSet.getShort(3)+"\t");   	
        	System.out.print(resSet.getShort(4)+"\t"); 
        	System.out.print(resSet.getShort(5)+"\t");
        	System.out.print(resSet.getShort(6)+"\t");
        	System.out.print(resSet.getShort(7)+"\t");  	 
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







