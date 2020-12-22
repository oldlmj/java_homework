package DataBase;


import java.sql.*;

public class Access_GetColumn
{
    public static void main(String[] args)
    {
        Connection dbCon = null;
        Statement stmt = null;
        ResultSet rs = null;
        ResultSetMetaData md = null;
        //驅動程式參數
        String sDriver = "sun.jdbc.odbc.JdbcOdbcDriver";
        String sCon = "jdbc:odbc:mark";
       
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
            stmt = dbCon.createStatement();
        }
        catch(SQLException e)
        {
            try
            { dbCon.close(); }
            catch( SQLException e2 ) {}
            return;
       }
       
       try   //取得ResultSet物件
       {
           boolean state = stmt.execute("SELECT * FROM employee");
           if(state)
           {
              rs = stmt.getResultSet();
              md = rs.getMetaData();  //取得RsultSetMetaData物件
              int count = md.getColumnCount();
              String label;
              int size;
              String type;
              
              System.out.println("資料表欄位數: "+count);
              System.out.println(); 
                           
              for (int i = 1; i <=count; i++)
              {
                 label = md.getColumnLabel(i);
                 type = md.getColumnTypeName(i);
                 size = md.getColumnDisplaySize(i);
                 System.out.print(i + ": 欄位名稱: "+label+'\t'); 
                 System.out.print(" 型態: "+type+'\t');  
                 System.out.println(" 大小: "+size);
              }
           }
       }
       catch(SQLException e)
       {
           System.out.println(e.getMessage());
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
}

