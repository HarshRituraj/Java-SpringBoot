package alphabetNum;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcDemo {

	public static void main(String[] args) {
			try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/newemployee","harsh","0599");  
			
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select * from employee");  
			while(rs.next())  
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getInt(3));  
			con.close();  
			}catch(Exception e){ System.out.println(e);}  
			}  

	}